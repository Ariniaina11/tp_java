import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

	public static void main(String[] args) {
		/* Compression ZIP: stream de traitement ZipOutputStream */
		
		File f1 = new File("zipCompression/src/Hery_Mifanandrina.pdf");
		File f2 = new File("zipCompression/src/Hery_Mifanandrina.zip");
		
		try {
			FileInputStream input = new FileInputStream(f1);
			BufferedInputStream bInput = new BufferedInputStream(input);
			
			FileOutputStream output = new FileOutputStream(f2);
			BufferedOutputStream bOutput = new BufferedOutputStream(output);
			ZipOutputStream zOutput = new ZipOutputStream(bOutput);
			
			zOutput.setMethod(ZipOutputStream.DEFLATED);
			zOutput.putNextEntry(new ZipEntry(f1.getName()));
			
			int c;
			while ((c = bInput.read()) != -1) {
				zOutput.write(c);
			}
			
			zOutput.close();
			bInput.close();
			
			System.out.println("le fichier 'Hery_Mifanandrina.pdf' est maintenant compressé en 'Hery_Mifanandrina.zip'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
