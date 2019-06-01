
package Utils;
/*
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
public class OracleJdbcUtil {
    public static List<Map<String,Object>> executeSQL(String driver, String url, String username, String password, String sql) throws SQLException {
        List<Map<String,Object>> reslist = new ArrayList<>();
        Connection conn = null;
        if(conn == null){
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
                // log.info("获取"+url+"连接成功!");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                log.error(url+sql);
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        Statement stmtt = null;
        ResultSet rs = null;

        try {
            stmtt = conn.createStatement();
            rs = stmtt.executeQuery(sql);
            reslist = DbUtil.ResultSetToList(rs);

        } catch (SQLException e) {
            log.error("获取数据库返回结果失败:"+url+"-----"+sql);
            e.printStackTrace();
            return null;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                    rs = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmtt != null) {
                try {
                    stmtt.close();
                    stmtt = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    log.error("获取数据库返回结果失败:"+url+"-----"+e.getMessage());
                }
            }
        }
        return reslist;
    }



    public void executeSQL_Excute(String driver,String url,String username,String password, String sql) throws SQLException {
        Connection conn = null;
        if(conn == null){
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
                // log.info("获取"+url+"连接成功!");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                log.error(url+sql);
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        Statement stmtt = null;
        try {
            stmtt = conn.createStatement();
            stmtt.execute(sql);

        } catch (SQLException e) {
            log.error("获取数据库返回结果失败:"+url+"-----"+sql);
            e.printStackTrace();

        } finally {
            if (stmtt != null) {
                try {
                    stmtt.close();
                    stmtt = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                    // log.info("关闭连接成功"+url);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public void executeSQL_Excute(String driver,String url,String username,String password,List<Map<String,Object>> updatelist,List<Map<String,Object>> insertist) throws SQLException {
        Connection conn = null;
        if(conn == null){
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
                log.info("获取"+url+"连接成功!");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                log.error(url+e.getMessage());
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        Statement stmtt = null;
        try {
            stmtt = conn.createStatement();


            for(int i=0;i<updatelist.size();i++){
                String upsql = "update  citybrain_tv_scenicstate t set t.sce_con='"+updatelist.get(i).get("sce_con").toString()+"',t.create_time=CURRENT_TIMESTAMP where t.id='"+updatelist.get(i).get("id").toString()+"'";
                stmtt.execute(upsql);
            }

            for(int i=0;i<insertist.size();i++){
                String insert_sql = "insert into  citybrain_tv_scenicstate (id,sce_con,create_time)values('"+insertist.get(i).get("id").toString()+"','"+insertist.get(i).get("sce_con").toString()+"',CURRENT_TIMESTAMP)";
                stmtt.execute(insert_sql);
            }


        } catch (SQLException e) {
            log.error("获取数据库返回结果失败:"+url+"-----"+e.getMessage());
            e.printStackTrace();

        } finally {
            if (stmtt != null) {
                try {
                    stmtt.close();
                    stmtt = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                    //log.info("关闭连接成功"+url);
                } catch (SQLException e) {
                    e.printStackTrace();
                    log.error("获取数据库返回结果失败:"+url+"-----"+e.getMessage());
                }
            }
        }

    }


    public void executeSQL_Excute_con_index(String driver,String url,String username,String password,List<Map<String,Object>> updatelist,List<Map<String,Object>> insertist) throws SQLException {
        Connection conn = null;
        if(conn == null){
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
                // log.info("获取"+url+"连接成功!");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                log.error(url+e.getMessage());
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        Statement stmtt = null;
        try {
            stmtt = conn.createStatement();

            String insert_sql = "";
            String upsql = "";
            for(int i=0;i<updatelist.size();i++){
                try{
                    upsql = "update  citybrain_tv_scenicstate t set t.con_index='"+updatelist.get(i).get("con_index").toString()+"',t.create_time=CURRENT_TIMESTAMP where t.id='"+updatelist.get(i).get("id").toString()+"'";
                    stmtt.execute(upsql);
                }catch (Exception e){
                    log.error(upsql+e.getMessage());
                    continue;
                }

            }

            for(int j=0;j<insertist.size();j++){
                try{
                    insert_sql = "insert into  citybrain_tv_scenicstate (id,con_index,create_time)values('"+insertist.get(j).get("id").toString()+"','"+insertist.get(j).get("con_index").toString()+"',CURRENT_TIMESTAMP)";
                    stmtt.execute(insert_sql);
                }catch (Exception e){
                    log.error(insert_sql+e.getMessage());
                    continue;
                }
            }


        } catch (SQLException e) {
            log.error("获取数据库返回结果失败:"+url+"-----"+e.getMessage());
            e.printStackTrace();


        } finally {
            if (stmtt != null) {
                try {
                    stmtt.close();
                    stmtt = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    log.error("获取数据库返回结果失败:"+url+"-----"+e.getMessage());
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                    // log.info("关闭连接成功"+url);
                } catch (SQLException e) {
                    e.printStackTrace();
                    log.error("获取数据库返回结果失败:"+url+"-----"+e.getMessage());
                }
            }
        }

    }




    //关闭连接
    public void close(Connection connection){
        try {
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/