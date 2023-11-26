package com.example;

class User {
    // 用户名
    private String userName;
    // 数字性别——男 1——女 0
    private int sex;
    // 字符性别
    private String stringSex;
    // 体重（kg）
    private double weight;
    // 身高(m)
    private double height;
    // 年龄
    private int age;
    // 体重指数
    private double BMI;
    // 基础代谢率
    private double BMR;
    // 体脂率
    private double bodyFatRate;

    public User(int age, String stringSex, String useName, double weight, double height, double bodyFatRate) {
        this.userName = useName;
        this.weight = weight;
        this.height = height;
        this.stringSex = stringSex;
        this.sex = sexStringToInt();
        this.age = age;
        this.bodyFatRate = bodyFatRate;
        this.BMI = BMI();
        this.BMR = BMR();
    }

    public User(int age, int sex, String useName, double weight, double height, double bodyFatRate) {
        this.userName = useName;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.stringSex = sexIntToString();
        this.age = age;
        this.bodyFatRate = bodyFatRate;
        this.BMI = BMI();
        this.BMR = BMR();
    }

    // 计算BMI
    private double BMI(){
        double BMI = this.weight/(this.height*this.height);
        return BMI;
    }
    // 计算BMR
    private double BMR(){
        double Bmr = 0;
        if(this.sex == 1){
            Bmr = 13.7*this.weight + 500*this.height -6.8*this.age + 66;
        }
         else {
            Bmr = 9.6*this.weight + 180*this.height - 4.7*this.age + 655;
        }
        return Bmr;
    }
    // 将数字性别转为字符性别
    private String sexIntToString(){
        if(this.sex == 1) {
            stringSex = "male";
        }
        else {
            stringSex = "female";
        }
        return stringSex;
    }
    //将字符性别转为数字性别
    private int sexStringToInt(){
        if(this.stringSex == "male") {
            sex = 1;
        }
        else if(this.stringSex == "female"){
            sex = 0;
        }
        return sex;
    }
    //getter和setter方法
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

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public double getBMR() {
        return BMR;
    }

    public void setBMR(double BMR) {
        this.BMR = BMR;
    }

    public double getBodyFatRate() {
        return bodyFatRate;
    }

    public void setBodyFatRate(double bodyFatRate) {
        this.bodyFatRate = bodyFatRate;
    }
    // toString方法
    public String toString(){
        return "UserName:" + userName + ", Age:" + age + ", Sex:" + stringSex + ", Weight:" + weight + 
        ", Height" + height + ", BMI:" + BMI + ", BMR:" + BMR + ", Body Fat Rate:" + bodyFatRate;
    }
}


public class UserProfile {
    public static void main(String[] args) {
        User user1 = new User(22, "male", "Wang", 80.0, 1.85, 23);
        System.out.println(user1);
    }
}