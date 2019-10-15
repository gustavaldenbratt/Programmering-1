package com.aldenbratt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	int tal = input.nextInt();
        int sum = 0;
        while (tal > 0) {
            sum = sum + tal % 10;
            tal = tal/ 10;
        }
        System.out.println(sum);
    }



    }

