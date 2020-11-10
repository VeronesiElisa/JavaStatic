import java.util.Scanner;

/**
 * Far inserire una serie numerica di interi fermandosi quando o la somma di due numeri consecutivi è pari a 10
 * o quando un numero è uguale al precedente del precedente nella serie numerica
 */

public class SerieNumerica_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inserisci un numero ");
        int a = input.nextInt();

        System.out.println("inserisci un numero ");
        int b = input.nextInt();

        int c = 0;

        if (a + b != 10) {
             System.out.println("inserisci un numero ");
             c = input.nextInt();
        }


        while(a+b != 10 && a != c){
            a=b;
            b=c;
            if (a+b != 10) {
                System.out.println("inserisci un numero ");
                c = input.nextInt();
            }
        }

        System.out.println("fine!");
    }
}

