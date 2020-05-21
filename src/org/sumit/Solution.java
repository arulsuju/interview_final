package org.sumit;

import java.util.Scanner;
import java.io.*;
abstract class Car {
    protected boolean isSedan;
    protected String seats;
    protected int mileage;

    public Car(int mileage){
        this.mileage=mileage;
    }

    public Car(boolean isSedan, String seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public boolean getIsSedan() {
        return this.isSedan;
    }

    public String getSeats() {
        return this.seats;
    }


    abstract public String getMileage();

    public void printCar(String name) {
        System.out.println(
                "A " + name + " is " + (this.getIsSedan() ? "" : "not ")
                        + "Sedan, is " + this.getSeats() + "-seater, and has a mileage of around "
                        + this.getMileage() + ".");
    }
}

class WagonR extends Car{

    public WagonR(int mileage){
        super(mileage);
    }

    public WagonR(boolean isSedan, String seats) {
        super(isSedan, seats);
    }

    public String getSeats() {
        return String.valueOf(4);
    }
    @Override
    public String getMileage() {
        return String.valueOf(mileage);
    }
    public boolean getIsSedan() {
        return false;
    }
}
class HondaCity extends Car{
    public HondaCity(boolean isSedan, String seats) {
        super(isSedan, seats);
    }
    public HondaCity(int Mileage){
        super(Mileage);
    }
    public String getSeats() {
        return String.valueOf(4);
    }
    @Override
    public String getMileage() {
        return String.valueOf(mileage);
    }
    public boolean getIsSedan() {
        return true;
    }
}
class InnovaCrysta extends Car
{

    public InnovaCrysta(int mileage){
        super(mileage);
    }
    public String getSeats() {
        return String.valueOf(6);
    }
    public InnovaCrysta(boolean isSedan, String seats) {
        super(isSedan, seats);
    }


    @Override
    public String getMileage() {
        return String.valueOf(mileage);
    }
    public boolean getIsSedan() {
        return false;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int carType = Integer.parseInt(bufferedReader.readLine().trim());
        int carMileage = Integer.parseInt(bufferedReader.readLine().trim());

        if (carType == 0){
            Car wagonR = new WagonR(carMileage);
            wagonR.printCar("WagonR");
        }

        if(carType == 1){
            Car hondaCity = new HondaCity(carMileage);
            hondaCity.printCar("HondaCity");
        }

        if(carType == 2){
            Car innovaCrysta = new InnovaCrysta(carMileage);
            innovaCrysta.printCar("InnovaCrysta");
        }
    }
}