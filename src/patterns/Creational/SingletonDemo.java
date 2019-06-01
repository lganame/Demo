package patterns.Creational;
//Singleton
class Settings{
    static Settings instance;
    static Settings getInstance(){
        if(instance == null){
            instance = new Settings();
        }
        return instance;
    }
    private Settings(){}
    public int port;
    public String host;
}
public class SingletonDemo {
    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        //Settings settings = new Settings();
        settings.host="192.168.100.1";
        settings.port=33;
        Settings settings1 = Settings.getInstance();
        System.out.println(settings);
    }
}
