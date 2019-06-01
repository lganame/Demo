package string;

public class BreakString {
    public static void main(String[] args) {
        String string = "004-034556-1234-2341";
        String[] parts = string.split("-");

        for(int i=0;i<parts.length;i++) {
        System.out.println(parts[i]);
    }
    }
}
