package cn.itcast.eshop.common.entity;

/**
 * 实体类
 * 所有模块实体类的父类
 * 职责，封装数据
 * **/
public class Entity {

    private String id;

    private String createTime;

    private String deteleTime;

    private String isDel = "1";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDeteleTime() {
        return deteleTime;
    }

    public void setDeteleTime(String deteleTime) {
        this.deteleTime = deteleTime;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

}
