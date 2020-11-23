import java.util.Scanner;

public class Asta_02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("compratore1");
        int c1 = s.nextInt();
        int c2 = 0;
        int res;
        if(c1 == 0) {
            System.out.println("Vince compratore2");
        } else {
            System.out.println("compratore2");
            c2 = s.nextInt();
        }
        while(c1 != 0 && c2 != 0) {
            while(c2 <= c1 && c2 != 0) {
                System.out.println("Inserisci aumento su compratore2 (" + c2 + ")");
                res = s.nextInt();
                if(res == 0) {
                    c2 = 0;
                } else {
                    c2 += res;
                }
            }
            if(c2 == 0) {
                System.out.println("Vince compratore1 (" + c1 + ")");
            } else {
                while(c1 <= c2 && c1 != 0) {
                    System.out.println("Inserisci aumento su compratore1(" + c1 + ")");
                    res = s.nextInt();
                    if(res == 0) {
                        c1 = 0;
                    } else {
                        c1 += res;
                    }
                }
                if(c1 == 0) {
                    System.out.println("Vince compratore2(" + c2 + ")");
                }
            }
        }
    }

}