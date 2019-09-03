package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = input.nextLine();
        System.out.println("Username is: " + userName);

        System.out.println("Enter age");
        String age = input.nextLine();
        System.out.println("Your age are " + age);

        System.out.println("Enter address");
        String address = input.nextLine();
        System.out.println("your Address are " + address);

        System.out.println("Enter postnummer");
        String post = input.nextLine();
        System.out.println("Ditt postnummer är " + post);

        System.out.println("Enter stad");
        String stad = input.nextLine();
        System.out.println("din stad är " + stad);

        System.out.println("Enter tele");
        int tele = input.nextInt();
        System.out.println("ditt tele är " + tele);
        System.out.println(tele);

        System.out.println("Information:");
        System.out.println("Namn: "+ userName);
        System.out.println("ålder: "+ age);
        System.out.println("adress: "+ address);
        System.out.println("postnummer och stad: "+ post + stad);
        System.out.println("telefon: "+ tele);


        }
    }

