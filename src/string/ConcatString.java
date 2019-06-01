package string;

import Utils.Common;

public class ConcatString {
    public static void main(String[] args) {
        System.out.print(ConcatString.joint("1\n","2","3'","4\n"));
        System.out.println("2");
    }

    public static String joint(String arg, String... args) {
        String concatString = arg;
        concatString=concatString.replaceAll("[\n,']", "");
        StringBuffer sb = new StringBuffer(2048);
        String tb=" ";
        for (String s : args) {
            s=s.replaceAll("[\n,']", "");
            tb =  sb.append(",").append(s).toString();
        }
        return (concatString+tb);
    }

}
