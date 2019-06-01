package file.basic;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MkdirDynamic {
    public static void main(String[] args) {
        Date date = new Date();
        String dateForm = new SimpleDateFormat("yyyy-MM-dd").format(date);
        String path="D:\\app\\"+dateForm;
        // 如果不存在,创建文件夹
        File f = new File(path);
        if(!f.exists()){
            f.mkdirs();
        }
        //BufferedWriter out;
        FileOutputStream out;
        // 创建文件名
        String fileName = "\\blk_daily_data_"+dateForm+".txt";
        try {
            out = new FileOutputStream(path + fileName);
            System.out.println(path+fileName);
            try {
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

        }

    }

}
