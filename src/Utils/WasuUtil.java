package Utils;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.*;

public class WasuUtil {


    /**
     * 保存104命令的信息
     */
    public static  List cityList;

    /******
     * 获得随机数
     * @param min
     * @param max
     * @return
     */
    public static int getRandom(int min, int max) {
        Random random = new Random();

        int s = random.nextInt(max) % (max - min + 1) + min;
        return s;
    }

    /*****
     * 获取占比
     * @param scale 分子
     * @param all  分母
     * @param len  小数点后位数
     * @return
     */
    public static String  getScale(int scale,int all,int len){
        System.out.println(scale+":"+all);
        // 创建一个数值格式化对象

        NumberFormat numberFormat = NumberFormat.getInstance();

        // 设置精确到小数点后2位

        numberFormat.setMaximumFractionDigits(len);

        String result = numberFormat.format((float) scale / (float) all * 100);
        System.out.println(result);
        return result;
    }

    public static void sortlist(List list, final String compareFields){
        Collections.sort(list, new Comparator<Map<String, Object>>() {

            @Override
            public int compare(Map<String, Object> firstMapEntry,
                               Map<String, Object> secondMapEntry) {

                int tag1 = (Integer) firstMapEntry.get(compareFields);

                int tag2 = (Integer) secondMapEntry.get(compareFields);
                if(tag1>tag2){
                    return 1;
                }else if(tag1==tag2){
                    return 0;
                }else{
                    return -1;
                }
            }
        });

    }
    public static void dsortlist(List list, final String compareFields){
        Collections.sort(list, new Comparator<Map<String, Object>>() {

            @Override
            public int compare(Map<String, Object> firstMapEntry,
                               Map<String, Object> secondMapEntry) {

                int tag1 = (Integer) firstMapEntry.get(compareFields);

                int tag2 = (Integer) secondMapEntry.get(compareFields);
                if(tag1>tag2){
                    return -1;
                }else if(tag1==tag2){
                    return 0;
                }else{
                    return 1;
                }
            }
        });

    }

    /*
     * 读取已读文件列表
     */
    public  static  List<String> readOldFile(String path,String charset) {
        List<String> dataList = new ArrayList<String>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), charset));
            String line = null;
            while ((line = reader.readLine()) != null) {
                dataList.add(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {

                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return dataList;
    }
    /*
     * 读取已读文件列表
     */
    public  static  List<String> readOldFile(String path) {
        List<String> dataList = new ArrayList<String>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "GBK"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                dataList.add(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {

                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return dataList;
    }

}
