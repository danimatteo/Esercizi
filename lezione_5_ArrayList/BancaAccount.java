package lezione_5_ArrayList;

public class BancaAccount {

	private double saldo;
	private String nome;
	private int numcc;
	
	// Metodo costruttore inizializzato con nome,saldo e numero conto
	public BancaAccount(double saldo, int numcc, String nome) {
		this.saldo = saldo;
		this.nome = nome;
		this.numcc = numcc;
	}
	
	// Metodo per prelevare il denaro dal conto
	public void prelievo(double sommapr) {
		double temp = saldo;
		saldo = temp - sommapr;
	}
	
    //Metodo per depositare il denaro nel conto
	public void deposito(double sommadep) {
		double temp = saldo;
		saldo = temp + sommadep;
	}	
	
	// Metodo che restituisce il valore di conto
	public double getSaldo() {
		return saldo;
	}
	
	// Metodo che restituisce il nome di conto
	public String getNome() {
		return nome;
	}
	
	// Metodo che restituisce il numero di conto
	public int getNumcc() {
		return numcc;
	}

//	public static void stampaBancaAccount() {
//		System.out.println(" Nome: " +nome+ " Numero conto: " +numcc+ " Saldo: " +saldo);
//	}


	
	
}
