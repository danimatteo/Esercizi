package lezione_4b_IlGiocoDelDado;

public class Giocatore {

	private String username;
	private double soldi;

	public double getContoGiocatore() {
		return soldi;
	}
	
	public void aumentaContoGiocatore() {
		soldi = soldi + 1;
	}

	public void sottraiContoGiocatore() {
		soldi = soldi - 1;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getSoldi() {
		return soldi;
	}

	public void setSoldi(double soldi) {
		this.soldi = soldi;
	}

	@Override
	public String toString() {
		return "Giocatore [username=" + username + ", soldi=" + soldi + "]";
	}

}
