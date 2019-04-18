package collection;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class LinkQueue {
    //已访问的URL集合
    private static Set visitedUrl = new HashSet();
    //待访问的URL集合
    private static Queue unVisitedUrl = new PriorityQueue();
    //添加到访问过的URL队列中
    public static void addVisitedUrl(String url){
        visitedUrl.add(url);
    }
    //未访问过的URL移除
    public static void removeVisitedVUrl(String url){
        visitedUrl.remove(url);
    }
    //未访问的URL出队列
    public static Object unVisitedUrlDeQueue(){
        return unVisitedUrl.poll();
    }

    //保证每个URL只被访问一次
    public static void addUnVisitedUrl(String url){
        if(url!=null && !url.trim().equals(" ")
         &&!visitedUrl.contains(url)
         &&!unVisitedUrl.contains(url))
            unVisitedUrl.add(url);
    }
    //获得已经访问的URL数目
    public static int getVisitedUrlNum(){
        return visitedUrl.size();
    }
    public static boolean unVisitedUrlsEmpty(){
        return unVisitedUrl.isEmpty();

    }
}
