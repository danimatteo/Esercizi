package lezione_2a_Array;

import java.util.Arrays;

public class Esercizio_12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,2,3,4,5};
		System.out.println(Arrays.toString(OrderCrescent(array)));
	}

	private static int[] OrderCrescent(int[] array) {
		int[] inOrder = new int[array.length];
		int temp;
		// TODO Auto-generated method stub
		for (int j = 0; j < array.length - 1; j++) {
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] > array[i + 1]) {
	                temp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = temp;
	                inOrder = array;
	            }
	        }	        	
		}
		return inOrder;
	}
}
