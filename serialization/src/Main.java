import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		/*  sérialisation des objets operation dans un fichier texte */
		
		Operation op1 = new Operation("op1", "R", "10/05/2023", 15000);
		Operation op2 = new Operation("op2", "V", "10/06/2023", 1000);
		
		File file = new File("serialization/src/operations.txt");
		try {
			FileOutputStream output = new FileOutputStream(file);
			ObjectOutputStream objOutput = new ObjectOutputStream(output);
			objOutput.writeObject(op1);
			objOutput.writeObject(op2);
			
			objOutput.close();
			
			System.out.println("La sérialisation fonctionne correctement ! Le résultat se trouve dans 'operations.txt'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
