package lezione_2a_Array;

public class Esercizio_8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,2,3,4,5};
		MinimumIndex(array);
		
	}

	private static void MinimumIndex(int[] array) {
		// TODO Auto-generated method stub
		
				 int index = 0;
				    int min = array[index];

				    for (int i = 1; i < array.length; i++){
				        if (array[i] < min){
				        min = array[i];
				        index = i;
				        }
				    }
				    System.out.println(index);}
}
