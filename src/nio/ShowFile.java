package nio;

import org.omg.CORBA.DynAnyPackage.Invalid;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        //First, confirm that a filename has been specified.
        if(args.length != 1){
            System.out.println("Usage: ShowFile filename");
            return;
        }
        //Open the file and obtain a stream linked to it.
        try(InputStream fin = Files.newInputStream(Paths.get(args[0])))
        {
            do{
                i = fin.read();
                if(i!=-1) System.out.println((char)i);
            }while (i!=-1);
        }catch (InvalidPathException e){
            System.out.println("Path Error"+e);
        }catch (IOException e){
            System.out.println("I/O Error"+e);
        }
    }
}
