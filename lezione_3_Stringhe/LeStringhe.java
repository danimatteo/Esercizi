package lezione_3_Stringhe;

public class LeStringhe {
	
	public static void main(String[] args) {
		
			String a = "sempre caro mi fu quest'ermo colle";
		    String b = " e questa siepe, che da tanta parte ";
		    String c = "dell'ultimo orizzonte il guardo esclude";
		
		    
		    System.out.println(concatenazione(a , b, c));
		    System.out.println(indexOf(b));
		    
	}
	
	void indexOf(char s) {
	}

	private static String concatenazione(String a,String b, String c) {
		return a + b + c;
		
	}
	
	
}
