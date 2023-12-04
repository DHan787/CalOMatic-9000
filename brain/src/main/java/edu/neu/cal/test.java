/*
 * @Author: Jiang Han
 * @Date: 2023-11-21 22:28:40
 * @Description: 
 */

package edu.neu.cal;

import edu.neu.cal.connector.DbAccess;

/**
 * @Author: Jiang Han
 * @Date: 2023-11-21 22:28:40
 * @Description: 一个可被随意修改的测试类也是主类
 **/

public class Test {
    public static void main(String[] args) {
        DbAccess myAccess = new DbAccess();
        myAccess.connectToDatabase();
        // 数据库链接成功
        System.out.println(myAccess.readUsersData("name"));
        myAccess.close();
        // 注意，access 类应该只做数据库连接，查询数据应该由DAO层的类去完成，这里仅做演示和方便使用
    }
}
