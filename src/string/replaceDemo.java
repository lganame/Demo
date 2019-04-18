package string;

public class replaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test");
        sb.replace(4,7,"was");
        System.out.println("After replace:"+sb);
    }
}
