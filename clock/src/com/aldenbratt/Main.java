package com.aldenbratt;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int dif = m-45;
        if (dif < 0){
            m = 60+dif;
            if (h == 0)
                h = 24;
            System.out.println(h-1 + " " + m);
        }
        else
            System.out.println(h + " " + dif);
    }
}
