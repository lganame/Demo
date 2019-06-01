package file.basic;

import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Date;

public class GetFileProp {
    public static void main(String[] args) {
        String file = "/Users/User/file.txt";
        //file size(the second method)
        long fileSize = file.length();
        //file modification date

        //Date dateChanges = new Date(file.lastModified());
        //file creation DATE
        FileTime creationDate = FileTime.fromMillis(0);
        try {
          //  BasicFileAttributes attr = Files.readAttributes(file.toPath(),BasicFileAttributes.class);
   //         creationDate = attr.creationTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //is readable file
     //   Boolean isReadable = file.canRead();
        //is writable file
       // Boolean isWritable = file.canWrite();
        int pos = file.lastIndexOf('.');
        //file extension
        String extension = " ";
        if (pos>0) {
      //      extension = filePath.substring(pos+1);
        }
        //file directory
        //String fileDir = file.getParent();
    }
}
