/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;

/**
 *
 * @author Admin
 */
public class HomeTheaterFacade {

    private TV tv;
    private Sound soundSystem;
    private DVD dvdPlayer;

    public HomeTheaterFacade(TV tv,Sound soundSystem,DVD dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        tv.turnOn();
        soundSystem.turnOn();
        soundSystem.Volume(10);
        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movie);
    }
}
