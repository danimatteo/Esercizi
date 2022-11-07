package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_6 {
	
//SCRIVI UN ALGORITMO CHE DATI DUE NUMERI INTERI ESEGUA:
// - LA SOMMA SE UNO DEI DUE è PARI
// - IL PRODOTTO SE TUTTI E DUE SONO PARI
// - LA LORO DIVISIONE SE NESSUNO DEI DUE è PARI
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Operations(1,2));
		System.out.println(Operations(2,2));
		System.out.println(Operations(1,1));
	}

	private static int Operations(int i, int j) {
		// TODO Auto-generated method stub
		if (i%2 == 0 || j%2== 0) return i+j;
		if (i%2 == 0 && j%2== 0) return i*j;
		if (i%2 != 0 && j%2!= 0) return i/j;
		return -1;
		
	}

}
