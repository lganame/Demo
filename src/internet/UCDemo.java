package internet;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();
        //getdate
        long d = hpCon.getDate();
        System.out.println(d);
        if (d == 0)
            System.out.println("No data information.");
        else
            System.out.println("Date: " + new Date(d));

        //get contentType
        System.out.println("Content-Type: " + hpCon.getContentType());
        //get expiration date
        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println(d);
            System.out.println("No expiration information");
        } else
            System.out.println("Expires: " + new Date(d));

        //get last-modified date
        d = hpCon.getLastModified();
        System.out.println(d);
        if (d == 0){
            System.out.println("No last-modified information.");
        }else
            System.out.println("Last-Modified: "+new Date(d));

        //get content length
        long len = hpCon.getContentLengthLong();
        if(len == -1)
            System.out.println("Content length unavailable.");
        else
            System.out.println("Content-Length:"  +len);

        if(len != 0){
            System.out.println("===Content===");
            InputStream input = hpCon.getInputStream();
            while(((c=input.read())!=-1)){
                System.out.print((char)c);
            }
            input.close();
        }else{
            System.out.println("No content available.");
        }
    }
}
