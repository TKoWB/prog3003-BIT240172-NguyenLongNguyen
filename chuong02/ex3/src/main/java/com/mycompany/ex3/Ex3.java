/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author Admin
 */
public class Ex3 {

    public static void main(String[] args) {

        TV tv = new TV();
        Sound sound = new Sound();
        DVD dvd = new DVD();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(tv, sound, dvd);

        homeTheater.watchMovie("test");
    }
}
