package com.ssm.entity;

/**
 * @author MyLitter
 * 实体 要注意的是  字段和数据库的一一对应，可以在*Mapper.xml中指定字段名称和类型
 */
public class User {
 
    private Integer id;
    
    private String departmentKeyId;
    
    private String userKeyId;
    
    private String userName;
    
    private String userNameSpell;
    
    private String employeeNo;
    
    private String departmentName;
    
    private String departmentNo;
    
    private String mobile;
    
    private String tel;
    
    private Boolean isPublicAccount;
    
    private String deptNameSpell;
    
    private String departmentType;
    
    private String cityCode;
    
    private Boolean isDanger;
    
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentKeyId() {
        return departmentKeyId;
    }

    public void setDepartmentKeyId(String departmentKeyId) {
        this.departmentKeyId = departmentKeyId;
    }

    public String getUserKeyId() {
        return userKeyId;
    }

    public void setUserKeyId(String userKeyId) {
        this.userKeyId = userKeyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNameSpell() {
        return userNameSpell;
    }

    public void setUserNameSpell(String userNameSpell) {
        this.userNameSpell = userNameSpell;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Boolean getIsPublicAccount() {
        return isPublicAccount;
    }

    public void setIsPublicAccount(Boolean isPublicAccount) {
        this.isPublicAccount = isPublicAccount;
    }

    public String getDeptNameSpell() {
        return deptNameSpell;
    }

    public void setDeptNameSpell(String deptNameSpell) {
        this.deptNameSpell = deptNameSpell;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Boolean getIsDanger() {
        return isDanger;
    }

    public void setIsDanger(Boolean isDanger) {
        this.isDanger = isDanger;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", departmentKeyId=" + departmentKeyId + ", userKeyId=" + userKeyId + ", userName=" + userName + ", userNameSpell=" + userNameSpell + ", employeeNo=" + employeeNo + ", departmentName=" + departmentName + ", departmentNo=" + departmentNo + ", mobile=" + mobile + ", tel=" + tel + ", isPublicAccount=" + isPublicAccount + ", deptNameSpell=" + deptNameSpell + ", departmentType=" + departmentType + ", cityCode=" + cityCode + ", isDanger=" + isDanger + ", pwd=" + pwd + "]";
    }
}
