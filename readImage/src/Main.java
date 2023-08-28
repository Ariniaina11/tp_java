import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		/** Lire et écrire sur un fichier binaire **/
		
		File f1 = new File("readImage/src/happy-face.png");
		File f2 = new File("readImage/src/happy-face-clone.png");
		
		try {
			FileInputStream input = new FileInputStream(f1);
			FileOutputStream output = new FileOutputStream(f2);
			
			int c;
			// -1 : Fin du fichier
			while ((c = input.read()) != -1) {
				output.write(c);
			}
			
			input.close();
			output.close();
			
			System.out.println("L'image 'happy-face.png' est maintenant clooné en 'happy-face-clone.png'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
