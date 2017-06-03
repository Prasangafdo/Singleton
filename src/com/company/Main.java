package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getSingleton();
        System.out.println("Please enter a number....");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        
        singleton.setX(num1);
        System.out.println(singleton.getX());

        System.out.println("Please enter a number to add..");
        int num2 = scanner.nextInt();

        singleton.add(num2);

        System.out.println(singleton.getX());
    }
}
