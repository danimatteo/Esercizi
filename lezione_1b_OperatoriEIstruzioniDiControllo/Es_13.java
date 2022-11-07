package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_13 {

	public static void main(String[] args) {
		

		Stagione(2,12);

	}

	private static String Stagione(int giorno, int mese) {
		
		int marzo = 3;
		int giugno = 6;
		int settembre = 9;
		int dicembre = 12;
		
		if(mese == marzo) {
			if(giorno>=1 && giorno<=20) {
				return "primavera";
			}
		}
		if(mese == giugno) {
			if(giorno>=1 && giorno<=20) {
				return "estate";
			}
		}
		if(mese == settembre) {
			if(giorno>=1 && giorno<=20) {
				return "autunno";
			}
		}
		if(mese == dicembre) {
			if(giorno>=1 && giorno<=20) {
				return "inverno";
			}
		}
		return null;
	} 

}
