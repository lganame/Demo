package string;

public class Split {
    public static void main(String[] args) {
        String string1;
        String string2;
        string1="004";
        string2="034556";
        String string = "0024-034556";
        String[] parts = string.split("-");
        String part1 = parts[0]; // 004
        String part2 = parts[1]; // 034556
        String string3 = "004-034556";
        String[] parts2 = string.split("(?<=-)");
        String part3 = parts[0]; // 004-
        String part4 = parts[1]; // 034556
        String string4 = "004-034556-42";
        String[] parts5 = string.split("-", 2);
        String part5 = parts[0]; // 004
        String part6 = parts[1]; // 034556-42


    }
}
