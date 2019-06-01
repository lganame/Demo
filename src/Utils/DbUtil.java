/*package Utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class DbUtil {
    /****
     * 查询结果多行转一行，以'|'分割
     * @param list
     * @return

    public static String list_toString(List<Map<String, Object>> list, String fields, String peiod) {
        StringBuffer strb = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                if (list.get(i).get(fields) == null) {
                    return null;
                } else {
                    strb.append(list.get(i).get(fields).toString());
                }

            } else {
                strb.append(peiod).append(list.get(i).get(fields).toString());
            }

        }
        return strb.toString();
    }

    /****
     * 根据dbid获取citybrain_dataget_sql
     * @param dbid
     * @return

    public static  Map getConnection(JdbcTemplate jdbcTemplate, String dbid) throws Exception {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> connlist = jdbcTemplate.queryForList("select * from IPS_GET_DATAINFO t where t.id='" + dbid + "'");
        String id = connlist.get(0).get("id").toString();
        String driver = connlist.get(0).get("driver").toString();
        String db_url = connlist.get(0).get("db_url").toString();
        String username = connlist.get(0).get("username").toString();
        String password = connlist.get(0).get("password").toString();
        String dbtype = connlist.get(0).get("dbtype").toString();
        map.put("dbtype", dbtype);
        map.put("db_url", db_url);
        map.put("driver", driver);
        map.put("username", username);
        map.put("password", password);
        return map;
    }


    /******
     * 判断任务是否需要执行
     * @param lastTime 上次执行时间
     *  @param refresh_space 执行间隔
     * @return

    public static Boolean isActive(String lastTime, String refresh_space) {
        if (lastTime.equals("")) {
            return true;
        } else if (refresh_space.contains("分")) {
            refresh_space = refresh_space.replace("分", "");
            Integer aa = DateUtil.geSeconds(DateUtil.getCurrentTime(), lastTime);
            if (aa > 60 * (Integer.valueOf(refresh_space))) {
                return true;
            }

        } else if (refresh_space.equals("小时")) {
            // String time = DateUtil.getTimeByMinuteformat(-60, "yyyy-MM-dd HH:mm:ss");
            Integer aa = DateUtil.geSeconds(DateUtil.getCurrentTime(), lastTime);
            if (aa > 3600) {
                return true;
            }

        } else if (refresh_space.equals("日")) {
            Integer aa = DateUtil.geSeconds(DateUtil.getCurrentTime(), lastTime);
            if (aa > 3600 * 24) {
                return true;
            }

        } else if (refresh_space.equals("月")) {
            String lastmonth = lastTime.substring(0, 7);
            String thismonth = DateUtil.getCurrentTime().substring(0, 7);
            if (!lastmonth.equals(thismonth)) {
                return true;
            }
        }
        return false;


    }




    public static List<Map<String, Object>> ResultSetToList(ResultSet rs) throws SQLException {
        List<Map<String, Object>> results = new ArrayList<Map<String, Object>>();
        ResultSetMetaData rsmd = rs.getMetaData();
        int colCount = rsmd.getColumnCount();
        List<String> colNameList = new ArrayList<String>();
        for (int i = 0; i < colCount; i++) {
            colNameList.add(rsmd.getColumnName(i + 1));
        }
        while (rs.next()) {
            Map map = new HashMap<String, Object>();
            for (int i = 0; i < colCount; i++) {

                String key = colNameList.get(i);
                Object value = rs.getString(colNameList.get(i));
                map.put(key, value);
            }
            results.add(map);
        }
        return results;
    }
}
*/