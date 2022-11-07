package lezione_2a_Array;

public class Esercizio_10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,2,3,4,5};
		System.out.println(CheckDoubles(array));
	}

	private static String CheckDoubles(int[] array) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(j!=i && array[i]==array[j])return"doppione";
			}
		}
		return "non ci sono doppioni";
	}

}
