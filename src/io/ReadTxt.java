package io;

import Utils.Common;

import java.util.TreeSet;

public class ReadTxt extends Common {
    public static void main(String[] args) throws Exception{
        TreeSet<String> treeSet = new Common().getTs("D:\\wasu\\image_all_all_foldercode");
        for(String element:treeSet){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
