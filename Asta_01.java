import java.util.Scanner;

public class Asta_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci soldi compratore1");
        int c1 = s.nextInt();
        int c2 = 0;

        if(c1 == 0) {
            System.out.println("Vince compratore 2");
        } else {
            System.out.println("Inserisci soldi compratore2");
            c2 = s.nextInt();
            if(c2 == 0) {
                System.out.println("Vince compratore 1");
            }
        }
        while(c1 != 0 && c2 != 0) {
            while(c2 < c1 && c2 != 0) {
                System.out.println("Inserisci piu soldi");
                c2 = s.nextInt();
            }
            if(c2 != 0) {
                System.out.println("Inserisci soldi compratore1");
                c1 = s.nextInt();
                while(c1 < c2 && c1 != 0) {
                    System.out.println("Inserisci piu soldi");
                    c1 = s.nextInt();
                }
                if(c1 != 0) {
                    System.out.println("Inserisci soldi compratore 2");
                    c2 = s.nextInt();
                } else {
                    System.out.println("Vince compratore 2");
                }
            } else {
                System.out.println("Vince compratore 1");
            }
        }
    }
}
