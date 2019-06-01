package string;

public class DemoReplaceAll {
    public static void main(String[] args) {
        String json = "Hello\n'";
        String a="+张靓颖：I Didn't Know";
        json = json.replaceAll("[\\n,']", "");
        a = a.replaceAll("[\\n,']", "");
        System.out.print(json);//输出 Hello    } }
        System.out.println(a);
        System.out.println("1");
    }
}
