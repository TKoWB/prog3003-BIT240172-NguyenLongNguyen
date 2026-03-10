/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.baitap1;
import java.util.TreeSet;
/**
 *
 * @author Admin
 */
public class Baitap1 {

    public static void main(String[] args) {
        TreeSet<String> ten = new TreeSet<>();
        ten.add("John");
        ten.add("Alice");
        ten.add("Jack");
        ten.add("Bob");
        
        System.out.println("in danh sach theo thu tu:" + ten);
        System.out.println("danh gia in danh sach theo thu tu bang chu cai Alphabet");
        
        System.out.println("phan tu dau: " + ten.first());
        System.out.println("phan tu cuoi: " + ten.last());
        
    }
}
