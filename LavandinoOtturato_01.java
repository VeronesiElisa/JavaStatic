import java.util.Scanner;

public class LavandinoOtturato_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("inserire cl che perde il lavandino");
        double x = input.nextDouble();
        System.out.println("inserire cl che perde il rubinetto");
        double y = input.nextDouble();
        System.out.println("inserire il livello iniziale dell’acqua");
        double livello = input.nextDouble();
        System.out.println("inserire la capacità del lavandino");
        double capacita = input.nextDouble();

        int sec = 0;

        while(livello > 0 && livello <= capacita && sec != 20) {
            System.out.println(livello);
            livello -= x;
            if(sec % 3 == 0) {
                livello += y;
            }
            sec++;
        }

    }
}
