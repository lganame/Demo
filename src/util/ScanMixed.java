package util;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ScanMixed {
    public static void main(String[] args) throws Exception{
        int i;
        double d;
        boolean b;
        String str;
        //Write output to a file
        FileWriter fout = new FileWriter("test.txt");
        fout.write("Testing Scanner 10 12.2 one true two false");
        fout.close();
        FileReader fin = new FileReader("Test.txt");
        Scanner src = new Scanner(fin);
        //Read to end.
        while(src.hasNext()){
            if(src.hasNextInt()){
                i = src.nextInt();
                System.out.println("int: "+i);
            }else if(src.hasNextDouble()){
                d = src.nextDouble();
                System.out.println("double: "+d);
            }else{
                str = src.next();
                System.out.println("String: "+str);
            }
        }
    }
}
