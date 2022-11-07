package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_7 {

	public static void main(String[] args) {
		int contenitore = 0 ;
		
	for(int i = 1; i <= 6;i++) {
		contenitore = contenitore + i;
		
		System.out.println(i);
	}
	System.out.println("la somma è "+ contenitore );
	System.out.println("la media arrotondata è "+ contenitore / 6 );
	}

}
