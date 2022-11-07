package lezione_2a_Array;

public class Esercizio_7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeri = {10,4,8,9,2,1};
		valMax(numeri);
	}

	private static void valMax(int[] numeri) {
		// TODO Auto-generated method stub
		
		int max = numeri[0];
		for(int i=0;i<numeri.length;i++) {
			if(numeri[i]>max)max = numeri[i];
		}System.out.println(max);
	}
}
