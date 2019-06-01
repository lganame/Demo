package Utils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpResJson {

    public static String getHttpURLConnection(String url1) {
        String msg = "";
        try {
            // 1. 得到访问地址的URL
            URL url = new URL(
                    url1);
            // 2. 得到网络访问对象java.net.HttpURLConnection
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestProperty("Content-type", "application/json;charset=utf-8");
            /* 3. 设置请求参数（过期时间，输入、输出流、访问方式），以流的形式进行连接 */
            // 设置是否向HttpURLConnection输出
            connection.setDoOutput(false);
            // 设置是否从httpUrlConnection读入
            connection.setDoInput(true);
            // 设置请求方式
            connection.setRequestMethod("POST");
            // 设置是否使用缓存
            connection.setUseCaches(true);
            // 设置此 HttpURLConnection 实例是否应该自动执行 HTTP 重定向
            connection.setInstanceFollowRedirects(true);
            // 设置超时时间
            connection.setConnectTimeout(3000);
            // 连接
            connection.connect();
            // 4. 得到响应状态码的返回值 responseCode
            int code = connection.getResponseCode();
            // 5. 如果返回值正常，数据在网络中是以流的形式得到服务端返回的数据
            if (code == 200) { // 正常响应
                // 从流中读取响应信息
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
                String line = null;

                while ((line = reader.readLine()) != null) { // 循环从流中读取
                    msg += line + "\n";
                }
                reader.close(); // 关闭流
            }
            // 6. 断开连接，释放资源
            connection.disconnect();

            // 显示响应结果
            //System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return msg;
    }


    public static String httpconnect_post(String type,String app_url, String params, List<Map<String,Object>> headlist) throws Exception {
        URL url = new URL(app_url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(type);// 提交模式
        conn.setDoOutput(true);// 是否输入参数
        if(params!=null){
            byte[] bypes = params.getBytes();
            conn.getOutputStream().write(bypes);// 输入参数
        }
        InputStream inStream=conn.getInputStream();
        String res = new String(readInputStream(inStream), "utf-8");
        System.out.println(res);
        inStream.close();
        conn.disconnect();
        return res;




    }
    public static class NullHostNameVerifier implements HostnameVerifier {
        @Override
        public boolean verify(String arg0, SSLSession arg1) {
            // TODO Auto-generated method stub
            return true;
        }
    }
//    public static void main(String args[])throws Exception{
//        List<Map<String,Object>> list = new ArrayList<>();
//        Map map = new HashMap<String, Object>();
//        map.put("1", "fds");
//        map.put("2", "valu");
//
//        list.add(map);
//        StringBuffer params = new StringBuffer();
//       // 表单参数与get形式一样
//       params.append("client_id").append("=").append(Constant.client_id).append("&")
//               .append("client_secret").append("=").append(Constant.client_secret);
////        httpconnect_post(Constant.API_BASIC,params.toString(),list);
//    }

    /**
     * 通过HttpURLConnection模拟post表单提交
     *
     * @param path
     * @param params 例如"name=zhangsan&age=21"
     * @return
     * @throws Exception
     */
    public static byte[] sendPostRequestByForm(String path, String params) throws Exception{
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");// 提交模式
        // conn.setConnectTimeout(10000);//连接超时 单位毫秒
        // conn.setReadTimeout(2000);//读取超时 单位毫秒
        conn.setDoOutput(true);// 是否输入参数
        byte[] bypes = params.toString().getBytes();
        conn.getOutputStream().write(bypes);// 输入参数
        InputStream inStream=conn.getInputStream();
        return readInputStream(inStream);
    }

    /**
     * 从输入流中读取数据
     * @param inStream
     * @return
     * @throws Exception
     */
    public static byte[] readInputStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while( (len = inStream.read(buffer)) !=-1 ){
            outStream.write(buffer, 0, len);
        }
        byte[] data = outStream.toByteArray();//网页的二进制数据
        outStream.close();
        inStream.close();
        return data;
    }



}

