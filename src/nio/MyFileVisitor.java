package nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

//A simple example that uses walkFileTree() to display a directory tree.
public class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) throws IOException
    {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList{
    public static void main(String[] args) {
        String dirname = "\\MyDir";
        System.out.println("Directory tree starting with "+dirname +":\n");
        try{
            Files.walkFileTree(Paths.get(dirname),new MyFileVisitor());
        }catch (IOException exe){
            System.out.println("I/O Error");
        }
    }
}
