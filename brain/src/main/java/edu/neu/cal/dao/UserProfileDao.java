/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 03:34:08
 * @Description: 
 */
package edu.neu.cal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.neu.cal.Dbconnector.DbAccess;
import edu.neu.cal.domain.User;
import edu.neu.cal.domain.UserProfile;
import edu.neu.cal.utils.TypewriterEffectPrinter;

public class UserProfileDao {
    private DbAccess myAccess;

    private Connection connection;

    public UserProfileDao() {
        this.myAccess = new DbAccess();
        this.connection = this.myAccess.getConnection();
    }

    public void close() {
        this.myAccess.closeConnection(this.connection);
    }

    public UserProfile getUserProfileByName(String name) {
        PreparedStatement pstmt = null;

        // 准备结果集
        ResultSet rs = null;

        try {
            // 准备sql语句
            String sql = "SELECT * FROM userprofile WHERE name = ?";

            pstmt = this.connection.prepareStatement(sql);
            // 设置参数
            pstmt.setString(1, name);
            // 执行查询
            rs = pstmt.executeQuery();
            // 处理结果集
            if (rs.next()) {
                UserProfile userProfile = new UserProfile(rs.getInt("age"),
                        rs.getInt("sex"),
                        name,
                        rs.getDouble("weight"),
                        rs.getDouble("height"),
                        rs.getInt("bodyfatrate"));
                return userProfile;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    // update user profile
    public void addUserProfile(UserProfile UserProfile) {
        System.out.println(UserProfile.toString());

        String sql = "INSERT INTO userprofile (name, sex, stringsex, weight, height, age, bmi, bmr, bodyfatrate, id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, UserProfile.getUserName());
            pstmt.setInt(2, UserProfile.getSex());
            pstmt.setString(3, UserProfile.getStringSex());
            pstmt.setDouble(4, UserProfile.getWeight());
            pstmt.setDouble(5, UserProfile.getHeight());
            pstmt.setInt(6, UserProfile.getAge());
            pstmt.setDouble(7, UserProfile.getBmi());
            pstmt.setDouble(8, UserProfile.getBmr());
            pstmt.setDouble(9, UserProfile.getBodyFatRate());
            System.out.println(UserProfile.getId());
            pstmt.setString(10, UserProfile.getId());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateName(String name, String newName) {
        String sql = "UPDATE userprofile SET name = ? WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // updateSex
    // updateWeight
    // updateHeight
    // updateAge
    // updateBmi
    // updateBmr
    // updateBodyFatRate

    public void updateSex(String name, int sex) {
        String sql = "UPDATE userprofile SET sex = ? WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, sex);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateWeight(String name, double weight) {
        String sql = "UPDATE userprofile SET weight = ? WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDouble(1, weight);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateHeight(String name, double height) {
        String sql = "UPDATE userprofile SET height = ? WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDouble(1, height);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateAge(String name, int age) {
        String sql = "UPDATE userprofile SET age = ? WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, age);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateBmi(String name, double bmi) {
        String sql = "UPDATE userprofile SET bmi = ? WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDouble(1, bmi);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateBmr(String name, double bmr) {
        String sql = "UPDATE userprofile SET bmr = ? WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDouble(1, bmr);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateBodyFatRate(String name, double bodyFatRate) {
        String sql = "UPDATE userprofile SET bodyFatRate = ? WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDouble(1, bodyFatRate);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // delete user profile
    public void deleteUserProfileByName(String name) {
        String sql = "DELETE FROM userprofile WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // find user profile by name
    public boolean findUserProfileByName(String name) {
        String sql = "SELECT * FROM userprofile WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) {
                return false;
            } else {
                TypewriterEffectPrinter.println("GOT U!");
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
