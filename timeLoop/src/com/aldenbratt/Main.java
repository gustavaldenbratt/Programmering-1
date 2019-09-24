package com.aldenbratt;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = input.nextInt();
        String text = " Abracadabra";
        if (number <= 100) {
            for (int number2 = 1; number2 <= number; ++number2) {
                System.out.println(number2 + text);
            }
        }
        else if (number >100){
            System.out.println("Nummret är för högt");
        }

    }
}


