/*
 * @Author: Jiang Han
 * @Date: 2023-12-03 21:42:38
 * @Description: 
 */
package edu.neu.cal.dao;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.getPasswordByUsername("testname"));
        userDao.close();
    }

}
