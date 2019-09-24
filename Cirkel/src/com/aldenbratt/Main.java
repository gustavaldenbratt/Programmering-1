package com.aldenbratt;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv radie");
        double r = input.nextDouble();
        double a = r * r * 3.14;
        System.out.println("arenan på cirkeln är " +a);

    }
}
