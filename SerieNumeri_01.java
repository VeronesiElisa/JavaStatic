import java.util.Scanner;

/**
 * Mario è uno studente che ha una quantità di soldi stabilita dall’utente, ogni giorno Mario all’intervallo può
 * acquistare al bar della scuola una pastina che costa 1 euro o un panino che costa 1,5 euro.
 *
 * Il programma continua a chiedere all’utente cosa mangerà Mario quel giorno finché ha abbastanza soldi o non ha
 * la possibilità di soddisfare il suo appetito con quello che vuole.
 * Al termine del programma scrivere in output il numero di giorni in cui Mario ha mangiato e quante volte ha
 * mangiato una pastina e quante un panino.
 */

public class SerieNumeri_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int inseriti = 1;

        while (n1 < n2){
            n1 = n2;
            System.out.println("inserisci numero ");
            n2 = input.nextInt();
            inseriti ++;
        }
        System.out.println("inseriti: " + inseriti);
    }
}

