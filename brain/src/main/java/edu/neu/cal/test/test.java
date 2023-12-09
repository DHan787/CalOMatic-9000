package edu.neu.cal.test;

/*
 * @Author: Jiang Han
 * @Date: 2023-12-08 23:06:33
 * @Description: 
 */

import edu.neu.cal.connector.DbAccess;

public class test {
    public static void main(String[] args) {
        DbAccess myAccess = new DbAccess();
        myAccess.connectToDatabase();
        // 数据库链接成功
        System.out.println(myAccess.readUsersData("name"));
        myAccess.close();
        // 注意，access 类应该只做数据库连接，查询数据应该由DAO层的类去完成，这里仅做演示和方便使用
    }
}
