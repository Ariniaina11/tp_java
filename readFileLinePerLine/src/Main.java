import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		/* Lire et écrire sur un fichier texte ligne par ligne */
		
		File f1 = new File("readFileLinePerLine/src/input.txt");
		File f2 = new File("readFileLinePerLine/src/output.txt");
		
		try {
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(f2);
			
			String s;
			while ((s = br.readLine()) != null) {
				fw.write(s + "\n");
			}
			br.close();
			fw.close();

			System.out.println("Le contenu du 'input.txt' est maintenant écri dans 'output.txt' !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
