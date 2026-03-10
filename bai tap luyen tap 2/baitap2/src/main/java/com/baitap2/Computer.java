/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.baitap2;
/**
 *
 * @author Admin
 */
public class Computer {
    private String HDD;
    private String RAM;
    private boolean isBluetoothEnable;
    
    //constuctor
    private Computer(Builder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnable = builder.isBluetoothEnable;
    }
    
    public String getHDD(){return HDD;}
    public String getRAM() {return RAM;}
    public boolean IsBluetoothEnable(){ return isBluetoothEnable;}

    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + "GB, RAM=" + RAM + "GB, Bluetooth=" + isBluetoothEnable + "]";
    }    
    
    public static class Builder{
        private String HDD;
        private String RAM;
        private boolean isBluetoothEnable;
        
        public Builder(String hdd, String ram){
            this.HDD = hdd;
            this.RAM = ram;
        }
        
        public Builder IsBluetoothEnable(boolean bluetooth){
            this.isBluetoothEnable = bluetooth;
            return this;
        }
        
        public Computer build(){return new Computer(this);}
    }
    
    
}
