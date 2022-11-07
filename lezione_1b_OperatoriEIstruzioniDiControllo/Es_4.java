package lezione_1b_OperatoriEIstruzioniDiControllo;

public class Es_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxMinMedia(1,2,3);
	}

	private static void MaxMinMedia(int i, int j, int k) {
		// TODO Auto-generated method stub
		
		int max = 0;
		int min = 0;
		int media = (k+j+i)/3;
		if(i>j && j > k) max = i;min =k; 
		if(i>k && k > j) max = i;min =j; 
		
		if(j>i && i>k)max = j; min =k;
		if(j>k && k>i)max = j; min =i;
		
		if(k>j&&j>i)max = k; min =i;
		if(k>i&&k>j)max = k; min =j;
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(media);
		
	}

}
