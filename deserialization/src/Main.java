import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		File file = new File("deserialization/src/operations.txt");
		
		try {
			FileInputStream input = new FileInputStream(file);
			ObjectInputStream objInput = new ObjectInputStream(input);
			
			Operation operation = (Operation)objInput.readObject();
			
			System.out.println("Num : " + operation.getNumOperation());
			System.out.println("Date : " + operation.getDateOperation());
			System.out.println("Type : " + operation.getTypeOperation());
			System.out.println("Montant : " + operation.getMontant());
			
			objInput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
