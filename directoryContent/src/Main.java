import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * Afficher le contenu d’un répertoire en affichant si ce 
		 * contenu est un répertoire ou un fichier , si le contenu est un fichier le programme 
		 * affiche le nombre de caractères.
		 * **/

		Scanner scan = new Scanner(System.in);

		System.out.println("Veuillez entrer un répertoire : ");
		String directory = scan.next();

		File f = new File(directory);
		
		// Si le répertoire existe
		if(f.exists()) {
			String[] content = f.list();
			for (int i = 0; i < content.length; i++) {
				File f2 = new File(directory, content[i]);
				
				if(f2.isDirectory())
					System.out.println(content[i] + " (répertoire)");
				else
					System.out.println(content[i] + " (fichier - " + content[i].length() + " caractères)");
			}
		}else {
			System.out.println("La répértoire n'existe pas !");
		}
	}
}
