/*package parser;

import sun.net.www.http.HttpClient;

import javax.xml.ws.http.HTTPException;
import javax.xml.ws.spi.http.HttpExchange;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class RetrivePage {
    private static HttpClient httpClient = new HttpClient();
    //设置代服务器
    static{
        //设置代理服务器
        httpClient.getHostConfiguration().setProxy("172.17.18.84",8080);

    }
    public static boolean downloadPage(String path) throws HTTPException, IOException{
        InputStream input = null;
        OutputStream output = null;
        //得到post方法
        PostMethod postMethod = new PostMethod(path);
        //设置post方法的参数
        NameValuePair[] postData = new NameValuePair[2];
        postData[0] = new NameValuePair("name","litu");
        postData[1] = new NameValuePair("password","*******");
        postMethod.addParameters(postData);
        //执行返回状态吗
        int statusCode = httpClient.executeMethod(postMethod);
        //针对状态码进行
        if(statusCode == HttpStatus.SC_OK){
            input = postMethod.getResponseBodyAsStream();
            //
            String filename = path.substring(path.lastIndexOf('/')+1);
            //
            output = new FileOutputStream(filename);
            //
            int tempByte = -1;
            while((tmpByte = input.read())>0){
                output.write(tempByte);
            }
            //
            if(input!=null){
                input.close();
            }
            if(output!=null){
                output.close();
            }
            return true;
        }
        return false;
    }
    /**
     * *test code
     *//*
    public static void main(String[] args) {
        //
        try{
            RetrivePage.downloadPage("http://www.lietu.com/");
        }catch(HTTPException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
*/