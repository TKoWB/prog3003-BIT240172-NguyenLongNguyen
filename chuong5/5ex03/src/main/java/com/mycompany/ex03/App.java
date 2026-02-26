/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author Admin
 */
package com.mycompany.ex03;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Khởi tạo SessionFactory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        // Mở Session để thao tác với DB
        try (Session session = factory.openSession()) {
            // 1. Tạo đối tượng Laptop theo yêu cầu
            Product p = new Product("Laptop", 1500);

            // 2. Bắt đầu Transaction
            session.beginTransaction();
            
            // 3. Lưu đối tượng
            System.out.println("Đang lưu Laptop vào database...");
            session.persist(p); 

            // 4. Commit (Xác nhận thay đổi)
            session.getTransaction().commit();
            
            System.out.println("Lưu thành công sản phẩm: " + p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}