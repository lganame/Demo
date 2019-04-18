package common;

import collection.MyComp;
import javafx.collections.transformation.SortedList;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.TreeSet;

public class Common {
    public TreeSet<String> getTs(String path) throws Exception {
        TreeSet<String> ts = new TreeSet<String>();
        File file = new File(path);
        if (file.isFile() && file.exists()) {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");
            BufferedReader br = new BufferedReader(isr);
            String lineTxt = null;
            int sumtems = 0;
            while ((lineTxt = br.readLine()) != null) {
                ts.add(lineTxt);
            }
        }
        return ts;
    }

    public String getHtml(String imgurl) throws Exception {
        imgurl = imgurl.trim();
        imgurl = imgurl.replace(" ", "");
        if ("".equals(imgurl)) {
        }
        ;
        StringBuffer html = new StringBuffer();
        URL url = new URL(imgurl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
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
        }else{
            return "error";
        }

    }

    public void writeText(String path, String html) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "utf-8"));
        bw.write(html);
        bw.newLine();
        bw.close();
        System.out.println("完成!");
    }

    public String joint(String arg, String... args) {
        String concatString = arg;
        for (String s : args) {
            concatString += "@" + s;
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
