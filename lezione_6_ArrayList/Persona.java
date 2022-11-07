package lezione_6_ArrayList;

public class Persona {
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public void stampaPersona() {
		System.out.println("nome: " +nome+ " cognome: " +cognome );
	}

	

}
