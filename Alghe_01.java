import java.util.Scanner;

public class Alghe_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Popolazione iniziale");
		int pop_ini = s.nextInt();
		System.out.println("Popolazione da raggiungere");
		int pop_fin = s.nextInt();

		double crescita = 2;
		int anni = 0;

		while(pop_ini < pop_fin) {
			pop_ini *= crescita;
			if(crescita == 2) {
				crescita = 2.0 / 3;
			} else {
				crescita = 2;
			}
			anni++;
		}
		System.out.println(anni);
	}
}
