package com.zyht.domain;

import org.springframework.stereotype.Component;

/**
 * @author caoxin
 * @ClassName Seller
 * @Package com.zyht.sclouds.entity
 * @Description 类描述
 * @date 2018/1/16
 */
@Component
public class Seller {
    /**
     * 主键
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别 男或女
     */
    private String sex;
    /**
     * 年龄
     */
    private Byte age;
    /**
     * 身份证号
     */
    private String idNumber;
    /**
     * 手机
     */
    private String tel;
    /**
     * 地址
     */
    private String addr;
    /**
     * 职业
     */
    private String profession;
    /**
     * 工作单位
     */
    private String workUnit;
    /**
     * 账户余额
     */
    private Double saving;
    /**
     * @Title: Seller
     * @Description: 空参数构造函数
     * @author caoxin
     * @date 2018/1/16
     */
    public Seller() {
    }

    /**
     * @Title: Seller
     * @Description:
     * @author caoxin
     * @date 2018/1/16
     * @param id,name, sex, age, idNumber, tel, addr, profession, workUnit
     */

    public Seller(Long id, String name, String sex, Byte age, String idNumber, String tel, String addr, String profession, String workUnit,Double saving) {
        this.id=id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idNumber = idNumber;
        this.tel = tel;
        this.addr =addr;
        this.profession = profession;
        this.workUnit = workUnit;
        this.saving=saving;
    }
    /**
     * @Title: getId
     * @Description: 获取主键
     * @author caoxin
     * @date 2018/1/16 18:31
     * @return java.lang.Long
     */
    public Long getId() {
        return id;
    }
    /**
     * @Title: setId
     * @Description: 设置主键
     * @author caoxin
     * @date 2018/1/16 18:31
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @Title: getName
     * @Description: 获取性别
     * @author caoxin
     * @date 2018/1/16 18:31
     * @return java.lang.String
     */
    public String getName() {
        return name;
    }
    /**
     * @Title: setName
     * @Description: 设置姓名
     * @author caoxin
     * @date 2018/1/16 18:31
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @Title: getSex
     * @Description: 获取性别
     * @author caoxin
     * @date 2018/1/16 18:31
     * @return java.lang.String
     */
    public String getSex() {
        return sex;
    }
    /**
     * @Title: setSex
     * @Description: 设置性别
     * @author caoxin
     * @date 2018/1/16 18:32
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * @Title: getAge
     * @Description: 获取年龄
     * @author caoxin
     * @date 2018/1/16 18:32
     * @return Byte
     */
    public Byte getAge() {
        return age;
    }
    /**
     * @Title: setAge
     * @Description: 设置年龄
     * @author caoxin
     * @date 2018/1/16 18:32
     * @param age
     */
    public void setAge(Byte age) {
        this.age = age;
    }
    /**
     * @Title: getIdNumber
     * @Description: 获取身份证号
     * @author caoxin
     * @date 2018/1/16 18:32
     * @return java.lang.String
     */
    public String getIdNumber() {
        return idNumber;
    }
    /**
     * @Title: setIdNumber
     * @Description: 设置身份证号
     * @author caoxin
     * @date 2018/1/16 18:32
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    /**
     * @Title: getTel
     * @Description: 获取电话号码
     * @author caoxin
     * @date 2018/1/16 18:32
     * @return java.lang.String
     */
    public String getTel() {
        return tel;
    }
    /**
     * @Title: setTel
     * @Description: 设置电话号码
     * @author caoxin
     * @date 2018/1/16 18:32
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
    /**
     * @Title: getAddr
     * @Description: 获取地址
     * @author caoxin
     * @date 2018/1/16 18:32
     * @return java.lang.String
     */
    public String getAddr() {
        return addr;
    }
    /**
     * @Title: setAddr
     * @Description: 设置地址
     * @author caoxin
     * @date 2018/1/16 18:32
     * @param addr
     */
    public void setAddr(String addr) {
       this.addr =addr;
    }
    /**
     * @Title: getProfession
     * @Description: 获取职业
     * @author caoxin
     * @date 2018/1/16 18:32
     * @return java.lang.String
     */
    public String getProfession() {
        return profession;
    }
    /**
     * @Title: setProfession
     * @Description: 设置职业
     * @author caoxin
     * @date 2018/1/16 18:32
     * @param profession
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }
    /**
     * @Title: getWorkUnit
     * @Description: 获取工作单位
     * @author caoxin
     * @date 2018/1/16 18:32
     * @return java.lang.String
     */
    public String getWorkUnit() {
        return workUnit;
    }
    /**
     * @Title: setWorkUnit
     * @Description: 设置工作单位
     * @author caoxin
     * @date 2018/1/16 18:32
     * @param workUnit
     */
    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }
    /**
     * @Title: getSaving
     * @Description:
     * @author caoxin
     * @date 2018/1/16
     * @return java.lang.Double
     */
    public Double getSaving() {
        return saving;
    }
    /**
     * @Title: setSaving
     * @Description:
     * @author caoxin
     * @date 2018/1/16
     * @param  saving
     */
    public void setSaving(Double saving) {
        this.saving = saving;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "addr='" + addr + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", idNumber='" + idNumber + '\'' +
                ", tel='" + tel + '\'' +
                ", profession='" + profession + '\'' +
                ", workUnit='" + workUnit + '\'' +
                ", saving=" + saving +
                '}';
    }
}