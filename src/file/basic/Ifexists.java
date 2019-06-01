package file.basic;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ifexists {
    public static void main(String[] args) {
        Path  file = Paths.get("file.txt");
        Boolean exists = Files.exists(file);
        System.out.println(exists);
    }

}
