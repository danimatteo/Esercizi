package lezione_7_iFile;

import java.io.File;
import java.io.IOException;

public class CreaFile {

	public static void main(String[] args) {

		String path = "out/prova.txt";
		try {
			File nomeDelFile = new File("out1");
			nomeDelFile.mkdir();
			
			File fileout = new File(path);
			if(fileout.exists())
				System.out.println("Il file esiste già");
			else if(fileout.createNewFile())
			fileout.createNewFile();
			
		} catch (IOException e) {
			e.printStacktrace();
		}
	}

}
