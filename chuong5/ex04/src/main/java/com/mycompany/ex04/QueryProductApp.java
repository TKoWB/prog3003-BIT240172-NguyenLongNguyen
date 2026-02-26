/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ex04;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class QueryProductApp {
    public static void main(String[] args) {
        // Khởi tạo SessionFactory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        // Sử dụng Session để thực hiện truy vấn
        try (Session session = factory.openSession()) {
            session.beginTransaction();

            // 1. Sử dụng HQL để lọc sản phẩm có giá > 1000
            String hql = "FROM Product p WHERE p.price > 1000"; //

            // 2. Sử dụng createQuery() và getResultList()
            List<Product> products = session.createQuery(hql, Product.class)
                                            .getResultList(); //

            // In danh sách kết quả
            System.out.println("--- cac sang pham co gia> 1000 ---");
            for (Product p : products) {
                System.out.println(p);
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}