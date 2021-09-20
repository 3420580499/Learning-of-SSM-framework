package com.good.entity;

/**
 * @author 小白
 * @create 2021/2/14
 */
public class OtherStudent {
    private Integer stuid;
    private String  stuname;
    private String stuemail;
    private Integer stuage;

    public OtherStudent(Integer stuid, String stuname, String stuemail, Integer stuage) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stuemail = stuemail;
        this.stuage = stuage;
    }

    public OtherStudent() {
    }

    @Override
    public String toString() {
        return "OtherStudent{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stuemail='" + stuemail + '\'' +
                ", stuage=" + stuage +
                '}';
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuemail() {
        return stuemail;
    }

    public void setStuemail(String stuemail) {
        this.stuemail = stuemail;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }
}
