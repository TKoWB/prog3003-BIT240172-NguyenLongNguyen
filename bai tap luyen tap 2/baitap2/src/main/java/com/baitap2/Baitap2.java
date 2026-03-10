/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.baitap2;
import com.baitap2.Computer;

/**
 *
 * @author Admin
 */
public class Baitap2 {

    public static void main(String[] args) {
        Computer haveBluetooth = new Computer.Builder("1TB","32GB")
                .build();
        Computer nonBluetooth = new Computer.Builder("1TB","64GB")
                .IsBluetoothEnable(true)
                .build();
        
        System.out.println(haveBluetooth.toString());
        System.out.println(nonBluetooth.toString());
                
    }
}
