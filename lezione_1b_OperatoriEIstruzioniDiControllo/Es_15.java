package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(PariPiccolo(4));
	}

	private static String PariPiccolo(int i) {
		// TODO Auto-generated method stub
		if((i>1 & i<100 )&(i%2==0)){return "Pari e piccolo";}
		return "non è pari piccolo";
	}
}
