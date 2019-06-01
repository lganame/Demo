package Utils;

import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Common {
    public TreeSet<String> getTs(String path) throws Exception {
        TreeSet<String> ts = new TreeSet<String>();
        File file = new File(path);
        if (file.isFile() && file.exists()) {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String lineTxt = null;
            int sumtems = 0;
            while ((lineTxt = br.readLine()) != null) {
                ts.add(lineTxt);
            }
        }
        return ts;
    }

    public HashSet<String> getHs(String path) throws Exception {
        HashSet<String> hashSet = new HashSet<String>();
        File file = new File(path);
        if (file.isFile() && file.exists()) {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");
            BufferedReader br = new BufferedReader(isr);
            String lineTxt = null;
            int sumtems = 0;
            while ((lineTxt = br.readLine()) != null) {
                hashSet.add(lineTxt);
            }
        }
        return hashSet;
    }

    public Queue<String> getQs(String path) throws Exception{
        Queue unVisitedUrl = new PriorityQueue();
        File file = new File(path);
        if (file.isFile() && file.exists()) {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
            BufferedReader br = new BufferedReader(isr);
            String lineTxt = null;
            int sumtems = 0;
            while ((lineTxt = br.readLine()) != null) {
                unVisitedUrl.add(lineTxt);
            }
        }
        return unVisitedUrl;

    }

    public String getHtml(String imgurl) throws Exception {
        imgurl = imgurl.trim();
        imgurl = imgurl.replace(" ", "");
        if ("".equals(imgurl)) {
        };
        StringBuffer html = new StringBuffer();
        URL url = new URL(imgurl);
        System.out.println(url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        try {
            if (conn.getResponseCode() == 200) {
                InputStreamReader isr = new InputStreamReader(conn.getInputStream(), "utf-8");
                BufferedReader br = new BufferedReader(isr);
                String temp;
                while ((temp = br.readLine()) != null) {
                    html.append(temp).append("\n");
                }
                br.close();
                isr.close();
                return html.toString();
            } else {
                return "error";
            }
        }catch (ConnectException e){
            System.out.println("连接超时");
            return "connect timed out";
        }
    }

    public void writeText(String path, String html) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "utf-8"));
        System.out.println(html);
        bw.write(html);
        bw.newLine();
        bw.close();
    }

    public String joint(String arg, String... args) {
        String concatString = arg;
        StringBuffer sb = new StringBuffer(2048);
        for (String s : args) {
            s=s.replaceAll("[\\,']", "");
            concatString += sb.append(",").append(s).toString();
            //concatString += "," + s;
        }
        return concatString;
    }

    public Object checkNull(Object obj) {
        String nullobj = new String("空");
        if (obj == null) {
            return nullobj;
        } else {
            return obj;
        }
    }
}
