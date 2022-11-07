package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_2 {

	public static void main(String[] args) {

		HighestNumber(1,2,1);
		HighestNumber(1,2,5);

	}

	private static void HighestNumber(int i, int j, int k) {
		
		if(i>j & j>k) System.out.println(i);
		if(i>k & k>j) System.out.println(i);
		if(k>j& j > i)System.out.println(k) ;
		if(j>i & i >k)System.out.println(j) ;
		if(j>k & k>i)System.out.println(j);
		if(k>i & i > j)System.out.println(k) ;
		if(k==i || i== j) System.out.println(i+j+k) ;
	
	}
}
		/*
		int max;
//		int somma;
		
		int[]punteggi = new int[3];
		Scanner tastiera = new Scanner(System.in);
		
		//CARICAMENTO DELL'ARRAY
		
		for(int i=0;i<punteggi.length;i++) {
			System.out.println("Inserisci numero: ");
			punteggi[i]=tastiera.nextInt();
		}
		
		tastiera.close(); //CHIUSURA DELLO STREAM DI INPUT
		
		//SCANSIONE DELL'ARRAY PER IL CALCOLO DEL MASSIMO
		
		max=punteggi[0]; //INIZIALIZZO IL MASSIMO COL PRIMO ELEMENTO DELL'ARRAY
		
		for(int i=1;i<punteggi.length;i++) {
			if(punteggi[i]>max)
				max=punteggi[i];
		}
		
		System.out.println("Il massimo vale:" +max);
		
//		for(int i=0;i<punteggi.length;i++) {
//			if(punteggi[])
//		}
 
 */