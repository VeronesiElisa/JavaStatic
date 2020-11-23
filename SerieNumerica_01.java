import java.util.Scanner;

public class SerieNumerica_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n1 = s.nextInt();
        System.out.println("Inserisci un numero");
        int n2 = s.nextInt();

        while(n1 != n2) {
            n1 = n2;
            System.out.println("Inserisci un numero");
            n2 = s.nextInt();
        }
        System.out.println("Inserito due volte lo stesso numero");
    }
}
