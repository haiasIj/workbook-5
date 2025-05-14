package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Asset> allAssets = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INCLUDE 2 HOUSES AND 2 VEHICLES

        System.out.println("Showing All Assets");

        loadAssets();

        Vehicle Mazda = new Vehicle("2014 Mazda3", "Available in Hatchback and Sedan coupe types\n" +
                "Engine options: Diesel and Petrol (Gasoline)\n" +
                "Detailed technical specifications, transmission details, body dimensions, and tire sizes\n" +
                "Incentives, rebates, recalls, and warranty ", "27,290");

    }
    public static void loadAssets() {
        allAssets.add(new Vehicle("2014 Mazda3", "Available in Hatchback and Sedan coupe types\n" +
                "Engine options: Diesel and Petrol (Gasoline)\n" +
                "Detailed technical specifications, transmission details, body dimensions, and tire sizes\n" +
                "Incentives, rebates, recalls, and warranty ", "27,290"));
    }
}
