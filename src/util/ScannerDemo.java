package util;

import java.io.FileReader;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int i;
        try {
            FileReader fin = new FileReader("Test.txt");
            Scanner src = new Scanner(fin);
            String instr = "10 99.88 scanning is easy.";
            Scanner conin2 = new Scanner(instr);
            Scanner conin = new Scanner(System.in);
            while (conin.hasNextInt()) {
                i = conin.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
