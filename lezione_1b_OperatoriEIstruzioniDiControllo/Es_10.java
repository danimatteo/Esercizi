package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Primo(6)); 
	}

	private static boolean Primo(int i) {
		// TODO Auto-generated method stub
		 if (i<2)   return false;
		    if (i<=3)   return true;
		    if (i%2==0)     return false;
		    for (int j=3;j<i/2+1;i=i+2){  
		    	if ( i%j==0)  return false;   
		    }
		    return true;
	}

}
