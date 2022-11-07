package lezione_1b_OperatoriEIstruzioniDiControllo;

import java.util.Scanner;

public class Es_17 {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int voto;
		
		@SuppressWarnings("unused")
		boolean registrare = false;
		
		System.out.println("un voto");
		voto = input.nextInt();
		
		if((voto>0)&&(voto<31)){
			if((voto>0)&&(voto<18)) {
				System.out.println("Esame non superato!");
			}else if((voto>17)&&(voto<25)){
				System.out.println("Giudizio: sufficiente");
				registrare = true;
			}else if((voto>24)&&(voto<31)) {
				System.out.println("Giudizio: buono");
				registrare = true;
			}else {
				System.out.println("Numero errato");
			}
		}
	}

}
