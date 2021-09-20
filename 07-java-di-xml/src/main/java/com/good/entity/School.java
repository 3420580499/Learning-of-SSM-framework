package com.good.entity;

/**
 * @author 小白
 * @create 2021/2/20
 */
public class School {
    private String schoolName;
    private String address;

    public School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
    }

    public School() {
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
