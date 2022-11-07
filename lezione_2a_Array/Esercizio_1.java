package lezione_2a_Array;

public class Esercizio_1 {

	// RIBALTARE UN ARRAY
	
public static void main(String[] args) {
		
		//Inverti(new int[]{1,2,3,4,5});
		//dichiarazione e valorizzazione sono fatte simultaneamente 
		//all'interno della chiamata del metodo
		
		int[] arraylista = {1,2,3,4,5}; 
		Inverti(arraylista); 
	}

	private static void Inverti(int[]arraylista) {
		
		for(int i = arraylista.length-1 ;i>=0;i--) {
			 System.err.println(arraylista[i]);
	    }
	}
}	