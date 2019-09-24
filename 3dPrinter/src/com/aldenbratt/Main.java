package com.aldenbratt;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int statues = sc.nextInt();
        System.out.println(1 + (int)Math.ceil(Math.log(statues) / Math.log(2)));
    }
}
