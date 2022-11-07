package lezione_6_ArrayList;

import java.util.ArrayList;


public class LanciaArrayList {

	public static void main(String[] args) {
		
	/*	ArrayList<String> str = new ArrayList<String>();
		str.add("Ciao");
		str.add("Mondo");
		for(int i=0;i<str.size();i++) {
			System.out.println(str.get(i));
		}
	*/	
        ArrayList<Persona> people = new ArrayList<Persona>();
        
        people.add(new Persona("Marco","Rossi"));
        people.add(new Persona("Gianni","Bianchi"));
        people.add(new Persona("Luca","Verdi"));

        for(int i=0;i<people.size();i++) {
        	people.get(i).stampaPersona();
        }
    /*  	
		people.remove(people.size()-1);
		
		for(int i=0;i<people.size();i++) {
        	people.get(i).stampaPersona();
        }
    */
        System.out.println("*************************");
        for (Persona persona : people) {
			persona.stampaPersona();
		}
	}

}
