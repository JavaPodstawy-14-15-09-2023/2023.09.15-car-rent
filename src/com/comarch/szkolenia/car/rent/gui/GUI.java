package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.core.App;
import com.comarch.szkolenia.car.rent.model.Car;

import java.util.Scanner;

public class GUI {
    static Scanner wczytywacz = new Scanner(System.in);
    public static String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return wczytywacz.nextLine();
    }

    public static String readPlate() {
        System.out.println("Plate:");
        return wczytywacz.nextLine();
    }

    public static void showRentResult(boolean result) {
        if(result) {
            System.out.println("Success !!");
        } else {
            System.out.println("Error !!");
        }
    }

    public static void listCars() {
        for(Car car : App.baza.getCars()) {
            /*System.out.println(car.getBrand() +
                    " " + car.getModel() + " " +
                    car.getPlate() + " " +
                    car.getPrice() + " " +
                    car.isRent());*/
            System.out.println(new StringBuilder()
                    .append(car.getBrand())
                    .append(" ")
                    .append(car.getModel())
                    .append(" ")
                    .append(car.getPlate())
                    .append(" ")
                    .append(car.getPrice())
                    .append(" ")
                    .append(car.isRent()));
        }
    }
}
