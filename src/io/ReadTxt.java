package io;

import common.Common;

import java.util.TreeSet;

public class ReadTxt extends Common {
    public static void main(String[] args) throws Exception{
        TreeSet<String> treeSet = new Common().getTs("E:\\Emacs.reg");
        for(String element:treeSet){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
