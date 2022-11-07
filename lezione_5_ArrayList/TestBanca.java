package lezione_5_ArrayList;

public class TestBanca {

	public static void main(String[] args) {
		
		//Creo un nuovo oggetto Banca
		Banca prova = new Banca();
		
		//Aggiungo 7 nuovi conti
		prova.addAccount(2000, "Daniel Monteaguero");
		prova.addAccount(45355, "Giorgio Carmusciano");
		prova.addAccount(500, "Valentina Corbellini");
		prova.addAccount(3000, "Giuseppe Verdi");
		prova.addAccount(123, "Anna Rossi");
		prova.addAccount(284, "Silvia Rossini");
		prova.addAccount(5432, "Enzo Bianchi");
		
		// Effettuo alcune operazioni sui conti
		prova.deposita(12, 200);
		prova.preleva(500, 30);
		
		// Visualizzo a video lo stato dei conti presenti nella banca
		System.out.println(prova.getSaldo(1));
		System.out.println(prova.getSaldo(2));
		System.out.println(prova.getSaldo(3));
		System.out.println(prova.getSaldo(4));
		System.out.println(prova.getSaldo(5));
		System.out.println(prova.getSaldo(6));
		System.out.println(prova.getSaldo(7));
		
		//Trasferisco una somma di denaro da un conto all'altro
		double somma = 100;
		if(prova.transfer(1, 2, somma)==true) {
			System.out.println("=== TRASFERIMENTO DENARO AVVENUTO CORRETTAMENTE! ===");
		} else {
			System.out.println("Ahia! Errore nel trasferimento..");
		}
		
		// Ristampo lo stato dei due conti soggetti a trasferimento
		System.out.println(prova.getSaldo(1));
		System.out.println(prova.getSaldo(2));
		System.out.println(prova.getSaldo(3));
		System.out.println(prova.getSaldo(4));
		System.out.println(prova.getSaldo(5));
		System.out.println(prova.getSaldo(6));
		System.out.println(prova.getSaldo(7));
		

	}


	
	

}
