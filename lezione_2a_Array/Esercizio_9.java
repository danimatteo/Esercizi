package lezione_2a_Array;

public class Esercizio_9 {

	public static void main(String[] args) {
		
		int [] arr = {3,6,4,8,5};
		SumEvenIndex(arr);

	}

	private static void SumEvenIndex(int[] arr) {
		
		int somma = 0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				somma=somma+arr[i];
			}
			System.out.println(somma);
		}
		
	}

}
