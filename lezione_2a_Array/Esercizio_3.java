package lezione_2a_Array;


public class Esercizio_3 {

	public static void main(String[] args) {
		
		double[]lista= {30,20,25,22,10,12,12,12,18};
		Temperature(lista);
	}

	private static void Temperature(double[]array) {
		
		double somma = 0;
		double media;
		
		for(int i=0;i<array.length;i++) {
			somma = somma + array[i];
			if(i == array.length-1) {
				for(int j=0;j<array.length;j++) {
					media = somma/array.length;
					if(array[j]>=media)
						System.out.println("maggiore");
					if(array[j]<media)
						System.out.println("minore");
				}
			}
		}
	}
}
