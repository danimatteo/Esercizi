package lezione_2b_Classi;

import java.util.Arrays;
import java.util.Collections;

public class Classi {
	
	/*ORDINARE UN ARRAY TRAMITE UN METODO*/
	int[] arr = new int[] {5,7,3,4,12,2,89,34,11};
				
		public static void main (String[] args) {
			
			//ordCre(arr);
			//ordDec(arr);
			//somma();
			//media();
			//valoreMax();
			//valoreMin();
			stampa();

		}
		
		public static void stampa() {
			int[] arr = new int[] {5,7,3,4,12,2,89,34,11};
			for(int i=0;i<arr.length;i++) {
				System.out.println("stampa: "+arr[i]);
			}
		}
		
		//calcoli il valore minimo
		public static int valoreMin() {
			int x[]= {5,7,3,4,12,2,89,34,11};
					
			int i;
			int minimo;
					
			minimo=x[0];
					
			for(i=0; i<=x.length; i=i++) {
				if( x[i]<minimo) {
					minimo=x[i];
				}
			}
			System.out.println("Il minimo è" +minimo);
			return minimo;
		}
		
		//calcoli il valore massimo
	    public static int valoreMax() {
	    	int x[]={5,7,3,4,12,2,89,34,11};		 
			int i;
		    int massimo;

			massimo=x[0];

			for(i=0; i<=x.length-1; i=i+1) {
				if( x[i]>massimo ) {
					massimo=x[i];
			    }
			}
		    System.out.println("Il massimo e' "+massimo);
		    return massimo;
	    }
	    
	    //calcoli la media dei numeri
		public static double media() {
			int vettore[]={5,7,3,4,12,2,89,34,11};
		    int i;
		    double somma, media;

		    somma=0;

		    for(i=0; i<=vettore.length-1; i=i+1) {
		      somma=somma+vettore[i];
		    }

		    media=somma/vettore.length;

		    System.out.println("Media = " + media );
			return i;
		}
		
		//calcoli la somma dei numeri
		public static int somma() {
			int x[]={5,7,3,4,12,2,89,34,11};
		    int i;
		    int somma;

		    somma=0;

		    for(i=0; i<=x.length-1; i=i+1) {
		      somma=somma+x[i];
		    }

		    System.out.println("La somma vale: "+somma);
			return somma;
		}
		
		//ordina array in ordine decrescente
		public static int ordDec(int[]arr) { 
			//Collections.reverseOrder do not work for primitive Types 
			//define an array with Integer 
			Integer[] IntArray = {5,7,3,4,12,2,89,34,11};
			// Sorts IntArray in descending order 
			Arrays.sort(IntArray, Collections.reverseOrder()); 
			//print sorted array 
			System.out.printf("Ordine Decrescente: %s", Arrays.toString(IntArray));
			return 0;
		}
		
		//ordina array in ordine crescente
		public static int ordCre(int[]arr) {
			System.out.println("Ordine Crescente:");
			for (int i : arr) {
				System.out.print(i+" ");
			}
			return 0;
		}
		
		
}