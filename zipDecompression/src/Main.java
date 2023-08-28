import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipInputStream;

public class Main {

	public static void main(String[] args) {
		/* Décompression ZIP: stream de traitement ZipInputStream */
		
		File f1 = new File("zipDecompression/src/Hery_Mifanandrina.zip");
		File f2 = new File("zipDecompression/src/Hery_Mifanandrina.pdf");

		try {
			FileInputStream input = new FileInputStream(f1);
			BufferedInputStream bInput = new BufferedInputStream(input);
			
			ZipInputStream zInput = new ZipInputStream(bInput);
			zInput.getNextEntry();
			
			FileOutputStream output = new FileOutputStream(f2);
			BufferedOutputStream bOutput = new BufferedOutputStream(output);
			
			int c;
			while ((c = zInput.read()) != -1) {
				bOutput.write(c);
			}
			zInput.close();
			bOutput.close();

			System.out.println("le fichier 'Hery_Mifanandrina.zip' est maintenant decompressé en 'Hery_Mifanandrina.pdf'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
