package string;

public class VariArgs {
    public static String joint(String arg, String... args){
        String concatString = arg;
        for (String s : args) {
            concatString += ","+s;
        }
        return concatString;
    }

    public static void main(String[] args) {
        System.out.println(joint("aaa"));
        System.out.println(joint("aaa", "bbb"));
        System.out.println(joint("aaa", "bbb", "ccc"));
    }

}
