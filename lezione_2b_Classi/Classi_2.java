package lezione_2b_Classi;

public class Classi_2 {
	/*
	 
	  SCRIVERE UNA CLASSE CHE DATI DUE ARRAY A E B INTERI, RESTITUISCE
	  L'ARRAY IN CUI B È STATO CONCATENATO ALLA FINE DI A.
	  AD ESEMPIO DATI A=[7,-3,2] E B=[-3,4,11,-21], 
	  IL METODO RESTITUISCE L'ARRAY AB =[]
	
	*/
	public static void main(String []args) {
		
		int[] a = {7,-3,2};
		int[] b = {-3,4,11,-21};
		
		Concatena(a,b);
	}

	private static int[] Concatena(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		int []arrayTot= new int[a.length + b.length];
		int pos = 0;
		for(int element : a) {
			arrayTot[pos]=element;
			pos++;
		}
		for(int element : b) {
			arrayTot[pos]=element;
			pos++;
		} return arrayTot;
	}
}
