import java.io.*;

public class Main {

	public static void main(String[] args) {
		/*** Lire le contenu du file1.txt et l'écrire dans "file2.txt" ***/

		File file1 = new File("readAndWriteOnFile/src/file1.txt");
		File file2 = new File("readAndWriteOnFile/src/file2.txt");

		try {
			FileReader reader = new FileReader(file1);
			FileWriter writer = new FileWriter(file2);
			BufferedReader bufferedReader = new BufferedReader(reader);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			int c;
			while ((c = bufferedReader.read()) != -1) {
				bufferedWriter.write(c);
			}

			bufferedReader.close();
			bufferedWriter.close();

			System.out.println("Le contenu du 'file1.txt' est maintenant copié dans 'file2.txt' !");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Une erreur s'est produite lors de la copie du fichier !");
		}
	}
}