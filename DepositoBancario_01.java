
public class DepositoBancario_01 {

    public static void main(String[] args) {
	    double saldo = 230;
	    int perch = 17;
	    int soglia = 10000;

	    int anni = 0;

		while(saldo < soglia) {
			saldo += saldo * perch / 100.0;
			anni++;
        }
        System.out.println(anni);
    }
}
