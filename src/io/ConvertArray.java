package io;

import Utils.Common;

import java.util.HashSet;
import java.util.TreeSet;

public class ConvertArray extends Common {
    public static String OUTPUTPATH = "D:\\wasu\\pra.txt";
    public static void main(String[] args) throws Exception{
        HashSet<String> hashSet = new Common().getHs("D:\\wasu\\image_all_all_parent_foldercode.txt");
        TreeSet<String> treeSet = new TreeSet<String>();
        for(String element:hashSet){
            String[] elementArray = element.split(",");
            String words = elementArray[2];
            System.out.println(elementArray[2]);
           /* for(String ele:elementArray) {
                System.out.println(ele);
            }*/
            treeSet.add(words);

            new Common().writeText(OUTPUTPATH, words);
        }
    }
}
