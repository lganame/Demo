package string;

public class SplitTest {
    public static String[] split(String text, String delimiter) {
        java.util.List<String> parts = new java.util.ArrayList<String>();

        text += delimiter;

        for (int i = text.indexOf(delimiter), j=0; i != -1;) {
            String temp = text.substring(j,i);
            if(temp.trim().length() != 0) {
                parts.add(temp);
            }
            j = i + delimiter.length();
            i = text.indexOf(delimiter,j);
        }

        return parts.toArray(new String[0]);
    }


    public static void main(String[] args) {
        String str = "004-034556";
        String delimiter = "-";
        String result[] = split(str, delimiter);
        for(String s:result)
            System.out.println(s);
    }
}
