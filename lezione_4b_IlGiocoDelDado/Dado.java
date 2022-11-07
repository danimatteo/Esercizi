package lezione_4b_IlGiocoDelDado;

public class Dado {

	// Metodo costruttore. Numero di facce impostato a 6.
	public int lancio() {
		int getRandomValue = 0;
		int min = 1;
		int max = 7;
		for (int i = min; i <= max; i++) {
			getRandomValue = (int) (Math.random() * (max - min)) + min;
		}
		return getRandomValue;
	}
	/*
	 * Random random = new Random(); // creo oggetto Random int number =
	 * random.nextInt(7); // genera numero casuale tra 0 e 6
	 * System.out.println(number);
	 */


}
