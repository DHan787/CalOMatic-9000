package edu.neu.cal.test;

/*
 * @Author: Jiang Han
 * @Date: 2023-12-08 23:06:33
 * @Description: 
 */

import edu.neu.cal.Dbconnector.DbAccess;
import edu.neu.cal.dao.UserProfileDao;
import edu.neu.cal.domain.User;
import edu.neu.cal.domain.UserProfile;

public class test {
    public static void main(String[] args) {
        UserProfileDao userProfileDao = new UserProfileDao();
        UserProfile userProfile = userProfileDao.getUserProfileByName("Bob");
        userProfileDao.close();
        System.out.println(userProfile.toString());
        // 注意，access 类应该只做数据库连接，查询数据应该由DAO层的类去完成，这里仅做演示和方便使用
    }
}
