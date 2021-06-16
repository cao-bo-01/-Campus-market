package domain;

/**
 * user
 * 
 * @author caobo
 * @version 1.0.0 2021-06-21
 */
public class User implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7226865787176474842L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** userid */
    private Integer userid;

    /** username */
    private String username;

    /** idnumber */
    private String idnumber;

    /** phone */
    private String phone;

    /** sex */
    private Integer sex;

    /** account */
    private String account;

    /** password */
    private String password;

    /** regtime */
    private String regtime;

    /** conditionn */
    private Integer conditionn;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取userid
     * 
     * @return userid
     */
    public Integer getUserid() {
        return this.userid;
    }

    /**
     * 设置userid
     * 
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取username
     * 
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置username
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取idnumber
     * 
     * @return idnumber
     */
    public String getIdnumber() {
        return this.idnumber;
    }

    /**
     * 设置idnumber
     * 
     * @param idnumber
     */
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    /**
     * 获取phone
     * 
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * 设置phone
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取sex
     * 
     * @return sex
     */
    public Integer getSex() {
        return this.sex;
    }

    /**
     * 设置sex
     * 
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取account
     * 
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * 设置account
     * 
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取password
     * 
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置password
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取regtime
     * 
     * @return regtime
     */
    public String getRegtime() {
        return this.regtime;
    }

    /**
     * 设置regtime
     * 
     * @param regtime
     */
    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    /**
     * 获取conditionn
     * 
     * @return conditionn
     */
    public Integer getConditionn() {
        return this.conditionn;
    }

    /**
     * 设置conditionn
     * 
     * @param conditionn
     */
    public void setConditionn(Integer conditionn) {
        this.conditionn = conditionn;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}