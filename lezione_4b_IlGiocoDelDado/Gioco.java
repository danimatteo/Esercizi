package lezione_4b_IlGiocoDelDado;

import java.util.Scanner;

public class Gioco {

	public static void main(String[] args) {

		Dado d = new Dado(); // Costruisco un oggetto dado

		Giocatore giocatore = new Giocatore();
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ciao! Come ti chiami?");
		String username = scanner.nextLine();
		
	
		System.out.println("Con quanti soldi inizi?");
		double soldi = scanner.nextDouble();
		
		while (username.isEmpty()) {
			System.out.println("Errore...inserisci username:");
		}
		giocatore.setUsername(username);
		giocatore.setSoldi(soldi);
		
		String verifica = "si";

		//Scanner soldi = new Scanner(System.in);

		// Simulo la giocata
		while (verifica.equalsIgnoreCase("si")) {

				// Punto una somma di denaro
				System.out.print("(ricorda che il tuo credito è pari a " + giocatore.getContoGiocatore());
				System.out.println(" )");

				double contoGiocatore = giocatore.getContoGiocatore();
                
				// Verifico la puntata
				if(0 < contoGiocatore) {
					
					// Simulo il lancio del dado
					System.out.println("Lancio il dado...");
					int lancioBanco = d.lancio();
					int lancioGio = d.lancio();
					System.out.println("Il risultato dei dadi è: \n"+lancioBanco+" per il banco\n"+lancioGio+" lancio giocatore");
					
					
					// Verifico se il giocatore vince o perde
	
						if(lancioGio > lancioBanco) {
							System.out.println("Complimenti hai vinto!");
						    giocatore.aumentaContoGiocatore();
					}else {
						System.out.println("Peccato, hai perso!");
						giocatore.sottraiContoGiocatore();
					}
				}
				
				//Verifico se il giocatore può continuare a giocare
				if(contoGiocatore <= 0) {
					System.out.println("== CREDITO ESAURITO ==");
					System.out.println(giocatore.getContoGiocatore());
					verifica = "no";
				    	
				}
				
				//Il giocatore scegli se continuare a giocare
				System.out.println("Il tuo credito è pari a: ");
				System.out.println(giocatore.getContoGiocatore());
				System.out.println("Vuoi continuare?");
				verifica = scanner.next();
				if (verifica != "si") {
					
					System.out.println("Grazie " +username+ " per aver giocato, a mai più!");	
				}
			}
		scanner.close();
		}
		
	}


