/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class App {

    // Thông số kết nối (giữ nguyên như Bài 1)
    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USER = "root";
    private static final String PASSWORD = "123321Long"; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ID user can xoa: ");
        int idToDelete = scanner.nextInt();

        // Câu lệnh SQL sử dụng dấu hỏi chấm (?) làm tham số
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Truyền giá trị ID vào câu lệnh SQL
            pstmt.setInt(1, idToDelete);

            // executeUpdate() trả về số lượng dòng bị tác động (số dòng đã xóa)
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Xoa thành cong user co ID: " + idToDelete);
            } else {
                // Yêu cầu bài toán: In thông báo nếu không tìm thấy ID
                System.out.println("Khong tim thay user de xoa");
            }

        } catch (Exception e) {
            System.err.println("Loi khi thuc thi lenh xoa!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}