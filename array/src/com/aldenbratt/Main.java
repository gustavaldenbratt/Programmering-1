package com.aldenbratt;


import java.util.Scanner;


public class Main {

    static void arraySum() {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:" + sum);
    }


    public static void main(String[] args) {

        arraySum();



    }

    }







