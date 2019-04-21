package connect;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Demonstrate HttpUrlConnection
public class HttpURLDemo {
    public static void main(String[] args) throws Exception{
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        //Display request method
        System.out.println("Request method is :"+hpCon.getRequestMethod());

        //Display response code
        System.out.println("Response code is :"+hpCon.getResponseCode());

        //Display response message
        System.out.println("Response Message is :"+hpCon.getResponseMessage());


        //Get a list of the header fields and a set of the header keys as values
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\n Here is the header: ");

        //Display all header keys and values.
        for(String k:hdrField){
            System.out.println("key: "+ k + "Value: "+hdrMap.get(k));
        }
    }
}