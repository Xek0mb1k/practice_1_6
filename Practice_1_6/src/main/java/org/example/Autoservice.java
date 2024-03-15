package org.example;

public class Autoservice {
    public static void modify(Car car) {
        String brand = car.getBrand();
        brand = brand.toLowerCase();
        brand = brand.replace('a', 'o');
        brand = brand.replace('i', 'e');
        car.setBrand(brand);
    }
}