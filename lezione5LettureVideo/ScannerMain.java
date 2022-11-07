package lezione5LettureVideo;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		  
		Scanner scanner = new Scanner(System.in);
		
		int a, b, somma = 0;
		//scanner.nextInt(); => questo metodo restituisce un int
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		somma = a + b;
		System.out.println("somma: " +somma); 
		
	/*	String valore = scanner.nextLine();
		System.out.println("valore:" +valore);
		scanner.close();*/
		
	}

}
