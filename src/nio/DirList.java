package nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";
        //Obtain and manage a directory stream within a try block.
        try(DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname)))
        {
            System.out.println("Directory of "+dirname);
            //Because DirectoryStream implements Iterable, we can usea "foreach" loop to display the directory
            for(Path entry:dirstrm){
                BasicFileAttributes attributes = Files.readAttributes(entry,BasicFileAttributes.class);
                if(attributes.isDirectory())
                    System.out.println("<DIR>");
                else
                    System.out.println("     ");
                System.out.println(entry.getName(1));
            }
        }catch (InvalidPathException e){
            System.out.println("Path Error "+e);
        }catch(NotDirectoryException e){
            System.out.println(dirname +" is not a directory. ");
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
