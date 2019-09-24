package com.aldenbratt;

public class Main {

    public static void main(String[] args) {

        int heltal = 1;
        int heltal2 = 2;
        float flyttal = (float) 3.14;
        char tkn = 'c';
        boolean sanning = true;

        int summan = heltal + heltal2;
        int produkt = heltal2 / heltal;

        if (sanning == true && heltal > 1) {
            summan = 0;

        } else if (sanning == true || heltal > 1) {

            summan = 1;

        } else {
            summan = heltal + heltal2;
        }
        for (int i = 0; i == 10; i++) {
            summan = summan + 1;

        }
        while (sanning == true)
        {
            summan++;
            if (summan >= 40)
            {
                sanning = false;
            }
        }

    }
}


