package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        int pokePower = Integer.parseInt(scan.nextLine());
        int pokePOriginal = pokePower;
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustionFactor = Integer.parseInt(scan.nextLine());
        int pokesMade = 0;
        if  (pokePower <= 0 || distance <= 0) {
            System.out.println("0");
            System.out.println("0");
        }

        while (pokePower >= distance && pokePower > 0) {
            pokePower -= distance;
            pokesMade++;
            double percent = (pokePower * 100.0f) / pokePOriginal;
            //System.out.println(percent);
            if (percent == 50.0 && exhaustionFactor > 0) {

                pokePower /= exhaustionFactor;
            }

        }

        System.out.println(pokePower);
        System.out.println(pokesMade);
    }
}
