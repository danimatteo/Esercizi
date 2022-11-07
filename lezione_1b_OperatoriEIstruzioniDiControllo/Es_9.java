package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_9 {

	public static void main(String[] args) {
		QuozienteResto(21,4);
	}

	private static void QuozienteResto(int i, int j) {
		double contenitore;
		while(i>j) {
			contenitore = i/j;
			System.out.println(contenitore  );
			System.out.println(i-(j*contenitore) );
			i=(int) contenitore;
		}
		
	}

}
