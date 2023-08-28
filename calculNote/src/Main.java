import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* Manipuler le fichier notes.txt et calcul la moyenne de la classe */

        File file = new File("calculNote/src/notes.txt");
        List<Etudiant> lists = getEtudiants(file, ";");
        float notes = 0;

        for (Etudiant etd : lists) {
            System.out.println(" - " + etd.getNom() + " " + etd.getPrenom() + " : " + etd.getNote());
            notes += etd.getNote();
        }

        System.out.println("=========================================");
        System.out.println("La moyenne de classe est : " + (notes / lists.size()));
        System.out.println("=========================================");
    }

    static List<Etudiant> getEtudiants(File file,String separator){
        List<Etudiant> lists = new ArrayList<>();

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String s;
            String[] splittedString;

            while ((s = br.readLine()) != null) {
                splittedString = s.split(separator);

                Etudiant etd = new Etudiant(
                        splittedString[0],
                        splittedString[1],
                        Float.parseFloat(splittedString[2])
                );

                lists.add(etd);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lists;
    }
}
