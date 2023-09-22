package com.comarch.szkolenia.car.rent.core;

import com.comarch.szkolenia.car.rent.database.CarDB;
import com.comarch.szkolenia.car.rent.gui.GUI;

public class App {

    public static CarDB baza = new CarDB();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            switch (GUI.showMenu()) {
                case "1":
                    GUI.listCars();
                    break;
                case "2":
                    GUI.showRentResult(App.baza.rentCar(GUI.readPlate()));
                    break;
                case "3":
                    running = false;
                default:
                    System.out.println("Wrogn choose !!");
                    break;
            }
        }
    }
}
