/*
 * @Author: uyrance uyrance@hotmal.com
 * @Date: 2023-12-08 14:35:59
 * @LastEditors: uyrance uyrance@hotmal.com
 * @LastEditTime: 2023-12-09 10:21:53
 * @FilePath: \CalOMatic-9000\brain\src\main\java\edu\neu\cal\dao\UserDaoTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @Author: Jiang Han
 * @Date: 2023-12-03 21:42:38
 * @Description: 
 */
package edu.neu.cal.dao;

import edu.neu.cal.Hongkai.User;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.getPasswordByName("testname"));
        System.out.println(userDao.getIdByName("Jane Smith"));
        System.out.println(userDao.getEmailByName("testname"));
        //User newUser = new User(1,"11","111","11"); 
        //userDao.addUser(newUser);
        //userDao.close();
    }

}
