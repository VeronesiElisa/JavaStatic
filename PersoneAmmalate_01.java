import java.util.Scanner;

/**
 * Creare un programma in java che, dati due interi che rappresentano rispettivamente il tasso di propagazione di
 * un virus (quante nuove persone ogni giorno si ammalano per ogni persona già ammalata) e la quantità di persone
 * di una popolazione, dica quanti giorni sono necessari perché sia ammalata almeno la metà della popolazione
 * considerando che all’inizio ci sia una sola persona ammalata.
 */


public class Main {

    public static void main(String[] args) {
        int tasso = 3;
        int persone = 20000;
        int giorni = 0;

        while ((int)Math.pow(tasso, giorni) <= persone/2 ){
            giorni ++;
        }

        System.out.println("ci vogliono " + giorni + " giorni perchè metà popolazione sia ammalata");
    }
}