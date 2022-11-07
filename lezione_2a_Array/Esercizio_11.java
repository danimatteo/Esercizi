package lezione_2a_Array;

public class Esercizio_11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {4,2,3,4,5};
		int[] array2 = {3,2,3,4,5};
		System.out.println(CheckIdentical(array1,array2));
	}

	private static boolean CheckIdentical(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		for(int i=0;i<array1.length;) {
			for(int j=0;j<array2.length;) {
				if(array1[i]==array2[j]) {
					i++;j++;}
					else return false;	
			}
		}
		return true;
	}
}
