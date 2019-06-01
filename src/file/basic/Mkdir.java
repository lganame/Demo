package file.basic;

import java.io.File;

public class Mkdir {
    public static void main(String[] args) {
        File dir = new File("data");
        if(!dir.exists()){
            dir.mkdir();
            System.out.println("successfully created");
        }
    }
}
