package org.example;

import java.util.Scanner;

import static org.example.Autoservice.modify;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input mark name: ");
        String brand = scanner.nextLine();

        Car car = new Car();
        car.setBrand(brand);
        modify(car);

        System.out.println("Original name: " + brand + "; "+"Changed name: " + car.getBrand());


    }
}
