package lezione_5_ArrayList;

import java.util.ArrayList;
//import java.util.Scanner;

public class Banca {

	ArrayList<BancaAccount> bancazz = new ArrayList<BancaAccount>();

	// Metodo che aggiunge un nuovo conto nella banca
	public void addAccount(double importo, String nome) {
		int i = bancazz.size() + 1;
		BancaAccount bca = new BancaAccount(importo, i, nome);
		bancazz.add(bca);
	}

	// Metodo che permette di depositare denaro in un conto
	// daro' il numero conto
	public void deposita(int numcc, double sommadep) {
		for (int j = 0; j < bancazz.size(); j++) {
			BancaAccount temp = (BancaAccount) bancazz.get(j);
			int numero = temp.getNumcc();
			if (numero == numcc) {
				temp.deposito(sommadep);
			}
		}
	}

	// Metodo che permette di sottrarre una somma a un conto dato un numero conto
	public void preleva(int numcc, double sommapr) {
		for (int j = 0; j < bancazz.size(); j++) {
			BancaAccount temp = (BancaAccount) bancazz.get(j);
			int numero = temp.getNumcc();
			if (numero == numcc) {
				temp.prelievo(sommapr);
			}
		}
	}

	// Metodo che restituisce il valore del conto da un numeroConto
	public String getSaldo(int numcc) {
		for (int j = 0; j < bancazz.size(); j++) {
			BancaAccount temp = (BancaAccount) bancazz.get(j);
			if (temp.getNumcc() == numcc) {
				return "Numero conto " + temp.getNumcc() + " con importo " + temp.getSaldo();
			}
		}
		return "Conto inesistente!";
	}
	
	// Metodo che trasferisce una somma di denaroda un conto ad un altro
	public boolean transfer (int conto1,int conto2,double importo) {
		BancaAccount uscita = null;
		BancaAccount entrata = null;
		for(int j=0; j<bancazz.size(); j++) {
			BancaAccount temp = (BancaAccount) bancazz.get(j);
			if(temp.getNumcc()==conto1) {
				uscita = temp;
			}
			if(temp.getNumcc()==conto2) {
				entrata = temp;
			}
		}
		if(uscita != null && entrata != null) {
			uscita.prelievo(importo);
			entrata.deposito(importo);
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	

}
