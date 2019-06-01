package Utils;

public enum Area {

    /**
     * 浙江省
     */
    ZHEJIANG("10", "浙江省"),
    /**
     * 嘉兴地区
     */
    JIAXING("1003", "嘉兴地区"),
    /**
     * 金华地区
     */
    JINHUA("1004", "金华地区"),
    /**
     * 湖州地区
     */
    HUZHOU("1005", "湖州地区"),
    /**
     * 丽水地区
     */
    LISHUI("1006", "丽水地区"),
    /**
     * 绍兴地区
     */
    SHAOXING("1007", "绍兴地区"),
    /**
     * 温州地区
     */
    WENZHOU("1008", "温州地区"),
    /**
     * 舟山地区
     */
    ZHOUSHAN("1009", "舟山地区"),
    /**
     * 衢州地区
     */
    QUZHOU("1010", "衢州地区"),
    /**
     * 宁波地区
     */
    NINGBO("1011", "宁波地区"),
    /**
     * 杭州地区
     */
    HANGHZOU("40", "杭州地区");

    public String code;
    public String areaName;

    private Area(String code, String areaName){
        this.code = code;
        this.areaName = areaName;
    }

    public String getCode() {
        return code;
    }

    public String getAreaName() {
        return areaName;
    }

}
