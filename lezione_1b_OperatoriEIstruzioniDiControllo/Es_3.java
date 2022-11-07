package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_3 {
	
	public static void main(String[] args) {
		DiscountAndIvaofNetPrice(101);
		DiscountAndIvaofNetPrice(100);
	}
	
	private static void DiscountAndIvaofNetPrice(int i) {
		double AfterDiscount ;
		double AfterIva;
		if(i > 100) {
			AfterDiscount = i - (i*0.35);
			AfterIva = AfterDiscount - (AfterDiscount*0.2);
		    System.out.println(AfterIva);
	    } else {
	    	AfterIva = i - (i*0.2);
	        System.out.println(AfterIva);
		}
    }
}
