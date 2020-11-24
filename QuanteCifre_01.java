import java.util.Scanner;

/**
 * Dopo aver fatto inserire un numero naturale il programma restituisce in output da quante cifre è composto il numero.
 */

public class QuanteCifre_01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int cifre = 1;

        while(num / 10 > 0) {
            num = num / 10;
            cifre++;
        }

        System.out.println(cifre);
    }

}
