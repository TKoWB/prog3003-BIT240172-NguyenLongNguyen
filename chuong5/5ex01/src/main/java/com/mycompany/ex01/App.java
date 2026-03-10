/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex01;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {

    // Cấu hình thông số kết nối
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USER = "root";
    private static final String PASSWORD = "123321Long  "; // Mặc định XAMPP thường để trống

    public static void main(String[] args) {
        // 1. Kết nối đến cơ sở dữ liệu
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Kết nối thành công!");

            // 2. Thực thi câu lệnh SELECT * FROM users
            String sql = "SELECT * FROM users";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            // 3. Sử dụng ResultSet để in ra danh sách theo định dạng
            System.out.println("--- Danh sách người dùng ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");

                // Định dạng in ra: ID - Username - Email
                System.out.printf("%d - %s - %s%n", id, username, email);
            }
            
        } catch (Exception e) {
            System.err.println("Lỗi kết nối: " + e.getMessage());
            e.printStackTrace();
        }
    }
}