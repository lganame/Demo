package string;

public class LiteralValue {
    public static void main(String[] args) {
        char chars[] = {'a','b','c'};
        String s1 = new String(chars);
        String s2 = "abc";//use string literal
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.length());
    }
}
