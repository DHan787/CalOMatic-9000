package edu.neu.cal.domain;

/**
 * @author Haipeng Wang
 * @since 2023/11/26
 */
public class UserProfile {

    private String id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 数字性别：
     * 1-男；
     * 0-女；
     */
    private int sex;
    /**
     * 字符性别
     */
    private String stringSex;
    /**
     * 体重
     * 单位：kg
     */
    private double weight;
    /**
     * 身高
     * 单位：m
     */
    private double height;
    /**
     * 年龄
     */
    private int age;
    /**
     * 体重指数
     */
    private double bmi;
    /**
     * 基础代谢率
     */
    private double bmr;
    /**
     * 体脂率
     */
    private double bodyFatRate;
    /**
     * 定义male
     */
    final String male = "male";
    /**
     * 定义female
     */
    final String female = "female";

    public UserProfile(String id, int age, String stringSex, String useName, double weight, double height,
            double bodyFatRate) {
        this.id = id;
        this.userName = useName;
        this.weight = weight;
        this.height = height;
        this.stringSex = stringSex;
        this.sex = sexStringToInt();
        this.age = age;
        this.bodyFatRate = bodyFatRate;
        this.bmi = calcuBmi();
        this.bmr = calcuBmr();
    }

    public UserProfile(int age, int sex, String useName, double weight, double height, double bodyFatRate) {
        this.userName = useName;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.stringSex = sexIntToString();
        this.age = age;
        this.bodyFatRate = bodyFatRate;
        this.bmi = calcuBmi();
        this.bmr = calcuBmr();
    }

    /**
     * 计算BMI
     * 
     * @return bmi
     */
    private double calcuBmi() {
        double bmic = this.weight / (this.height * this.height);
        return bmic;
    }

    /**
     * 计算BMR
     * 
     * @return bmr
     */
    private double calcuBmr() {
        double bmrc = 0;
        if (this.sex == 1) {
            bmrc = 13.7 * this.weight + 500 * this.height - 6.8 * this.age + 66;
        } else {
            bmrc = 9.6 * this.weight + 180 * this.height - 4.7 * this.age + 655;
        }
        return bmrc;
    }

    /**
     * 将数字性别转化为字符性别
     * 
     * @return 字符性别
     */
    private String sexIntToString() {
        if (this.sex == 1) {
            stringSex = "male";
        } else {
            stringSex = "female";
        }
        return stringSex;
    }

    /**
     * 将字符性别转化为数字性别
     * 
     * @return 数字性别
     */
    private int sexStringToInt() {
        if (this.stringSex == male) {
            sex = 1;
        } else if (this.stringSex == female) {
            sex = 0;
        }
        return sex;
    }

    /**
     * setter and getter
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getStringSex() {
        return stringSex;
    }

    public void setStringSex(String stringSex) {
        this.stringSex = stringSex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getBmr() {
        return bmr;
    }

    public void setBmr(double bmr) {
        this.bmr = bmr;
    }

    public double getBodyFatRate() {
        return bodyFatRate;
    }

    public void setBodyFatRate(double bodyFatRate) {
        this.bodyFatRate = bodyFatRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 将这tostring改成表格形式
    public String toFormatString() {

        return String.format(
                "+------------+-----+--------+--------+--------+------+-------+--------------+\n" +
                        "|  UserName  | Age |  Sex   | Weight | Height | BMI  |  BMR  | Body Fat Rate |\n" +
                        "+------------+-----+--------+--------+--------+------+-------+--------------+\n" +
                        "| %10s | %3d | %6s | %6.2f | %6.2f | %4.1f | %5.1f | %12.1f |\n" +
                        "+------------+-----+--------+--------+--------+------+-------+--------------+",
                userName, age, stringSex, weight, height, bmi, bmr, bodyFatRate);
    }

    public String toString() {
        return "Id" + id + "UserName:" + userName + ", Age:" + age + ", Sex:" + stringSex + ", Weight:" + weight +
                ", Height" + height + ", BMI:" + bmi + ", BMR:" + bmr + ", Body Fat Rate:" + bodyFatRate;
    }
}