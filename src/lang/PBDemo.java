package lang;

public class PBDemo {
    public static void main(String[] args) {
        try{
            ProcessBuilder proc = new ProcessBuilder("chromium","www.baidu.com");
            proc.start();
        }catch (Exception e){
            System.out.println("Error executing chromium");
        }
    }

}
