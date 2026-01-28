/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author Admin
 */
public class DatabaseConnection 
{
    private static DatabaseConnection instance; //là duy nhất
    
    private DatabaseConnection() {
    System.out.println("connect"); //giả lập sự kế nối, phần kết nối sẽ nằm ở đây
    
    }
    
    public static DatabaseConnection getInstance(){
        if (instance == null){
        instance = new DatabaseConnection(); //vì constuc là private nên chỉ có thể new ở đây nếu instance chưa tồn tại
        }
        return instance;
    }
    
    
}    