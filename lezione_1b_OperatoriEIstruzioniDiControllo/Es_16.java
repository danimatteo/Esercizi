package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_16 {

	public static void main(String[] args) {
		
		
		System.out.println(Festività(1,1));
	}

	private static String Festività(int giornoMese, int meseAnno) {
		
		if (giornoMese>=1 && giornoMese<=31) {
			if( meseAnno>=1 && meseAnno<=12) {
				if(giornoMese == 1 && meseAnno == 1) {
					return "Capodanno";
				}
				if(giornoMese == 6 && meseAnno == 1) {
					return "Epifania";
				}
				if(giornoMese == 15 && meseAnno == 8) {
					return "Ferragosto";
				}
				if(giornoMese == 25 && meseAnno == 12) {
					return "Natale";					
				}		
				else return "non è festivo";
			}return "mese sbagliato"; 
		}return "giorno sbagliato";		
	}	
}
