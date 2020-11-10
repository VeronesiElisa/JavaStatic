

import java.util.Scanner;

/**
 * Dato un numero intero che rappresenta un numero di ammalati e un numero intero che rappresenta la percentuale
 * di ammalati che ogni giorno guarisce, calcolare quanti giorni sono necessari affinché il numero di ammalati
 * sia minore di 100.
 */


public class PersoneAmmalate_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ammalati = input.nextInt();
        int perc_amma = input.nextInt();

        int giorni = 0;

        while (ammalati > 100){
            ammalati -= ammalati*perc_amma/100;
            giorni ++;
        }

        System.out.println("ci vogliono " + giorni + " giorni perchè gli ammalati siano minori di 100");
    }
}

