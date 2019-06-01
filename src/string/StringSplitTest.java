package string;

public class StringSplitTest {
    public static void main(String args[]) {
        String s = " ;String; String; String; String, String; String;;String;String; String; String; ;String;String;String;String";
        //String[] strs = s.split("[,\\s\\;]");
        String[] strs = s.split("[,\\;]");
        System.out.println("Substrings length:"+strs.length);
        for (int i=0; i < strs.length; i++) {
            System.out.println("Str["+i+"]:"+strs[i]);
        }
    }
}
