package lezione_2a_Array;

public class Esercizio_2 {

	public static void main(String[] args) {
		int [] lista = {4,1,67,78,33,6,21,98,4,22};
		checkNumberInArray(lista,1);				
	}

	private static void checkNumberInArray(int[] lista, int i) {
		
		for(i=0;i<lista.length;i++) {
			if(lista [i] == 1) {
				System.out.println("Presente");
			} else {
				System.out.println("Assente");
			}
		}		
	}
	
	/*
	    public static void main(String[] args) {
		
		int[] lista= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(PresenteAssente(lista,11));
		System.out.println(PresenteAssente(lista,2));
	}

	private static String PresenteAssente(int[] array, int i) {
		
		for(int j=0;j<array.length;j++) {
			if (i==array[j]) return "Presente" ;	 
		}
		return "Assente";
	}
	*/


}
