package domain;

/**
 * user
 * 
 * @author caobo
 * @version 1.0.0 2021-06-12
 */
public class User implements java.io.Serializable {
    /** 版本号 */
//    private static final long serialVersionUID = 5635901210093876764L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** name */
    private String name;

    /** age */
    private Integer age;

    /** sex */
    private Integer sex;



    /**
     * 获取name
     * 
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取age
     * 
     * @return age
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * 设置age
     * 
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
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


}