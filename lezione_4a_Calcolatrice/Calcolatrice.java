package lezione_4a_Calcolatrice;

import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		
		
//		somma();
//		differenza();
//		prodotto();
//		divisione();
		potenza();
		
	}

	private static void potenza() {
		
		Scanner scanner = new Scanner (System.in);
		int a, b, pot = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		pot = (int) Math.pow(a, b); //System.out.println((long) );
		System.out.println("la potenza di " +a+ " alla " +b+ " è: " +pot);
		
	}

	private static void divisione() {
		Scanner scanner = new Scanner(System.in);
		int a, b, divis = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		divis = a / b;
		System.out.println("la divisione è: " +divis);
		
	}

	private static void prodotto() {
		
		Scanner scanner = new Scanner(System.in);
		int a, b, prodotto = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		prodotto = a * b;
		System.out.println("il prodotto è: " +prodotto);
		
	}

	private static void differenza() {
		
		Scanner scanner = new Scanner(System.in);
		int a, b, diff = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		diff = a - b;
		System.out.println("la differenza è: " +diff);
	}

	private static void somma() {
		
		Scanner scanner = new Scanner (System.in);
		int a, b, somma = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		somma = a + b;
		System.out.println("somma è: " +somma);
	}
	    
}
