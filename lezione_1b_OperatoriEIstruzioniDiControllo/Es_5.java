package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_5 {

	public static void main(String[] args) {
		CalculateProvvigioneCoffe(7000);
		CalculateProvvigioneCoffe(1000);
		CalculateBonusOnTotalSale(20000,10000);
		CalculateBonusOnTotalSale(10000,1000);
	}
	
	private static void CalculateBonusOnTotalSale(int coffe,int the) {
		int totalSale = coffe + the;
		double bonusProvvigione;
		
		if(totalSale > 20000) {
			bonusProvvigione = totalSale * 0.12;
			System.out.println("il bonus è " + bonusProvvigione);
		}else System.out.println("il bonus è " + 0);
		
	}

	private static void CalculateProvvigioneCoffe(int i) {
		double provvigioneCoffe = 0;
		if(i > 5000) {
			provvigioneCoffe = i * 0.10;
			System.out.println("la provvigione sul caffè è di: $ "+provvigioneCoffe);
		}
		if(i<5000) {provvigioneCoffe = i * 0.05;
			System.out.println("la provvigione sul caffè è di: $ "+provvigioneCoffe);
		}
		
		
	}

}
