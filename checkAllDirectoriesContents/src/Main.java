import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /** Afficher le contenu d’un répertoire y compris le contenu de ses sous répertoires **/

        Scanner scan = new Scanner(System.in);

        System.out.println("Veuillez entrer une répertoire dans votre PC : ");
        String directory = scan.next();

        System.out.println(directory + " : ");
        gets(getContents(directory), directory);
    }

    // Prendre les dossiers et ses sous-dossiers.
    static void gets(List<Element> elements, String root) {
        for (Element element : elements) {
            String name = element.getName();

            if(element.getType() == 0) {
                List<Element> lists = getContents(root + "/" + name);

                System.out.print("\t/" + name);
                gets(lists, root + "/" + name);
            }else {
                System.out.println("\n\t\t- " + name);
            }
        }
    }

    // Prendre les contenus d'un répertoire
    static List<Element> getContents(String directory) {
        File f = new File(directory);
        List<Element> lists = new ArrayList<>();

        if(f.exists()) {
            String[] content = f.list();
            for (int i = 0; i < content.length; i++) {
                File f2 = new File(directory, content[i]);
                Element elm = new Element();

                elm.setType(f2.isDirectory() ? 0 : 1);
                elm.setName(content[i]);
                lists.add(elm);
            }
        }else {
            System.out.println("La répértoire n'existe pas !");
        }

        return lists;
    }
}
