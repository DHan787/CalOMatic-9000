/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 01:30:00
 * @Description: 
 */
package edu.neu.cal.test;

import edu.neu.cal.utils.PassowordHashingByBCrypt;
import edu.neu.cal.utils.UUIDGen;

public class mainTest {
    public static void main(String[] args) {
        System.out.println(PassowordHashingByBCrypt.hashPassword("123456"));
    }

}
