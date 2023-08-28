public class Etudiant {
    private String Nom;
    private String Prenom;
    private float Note;

    public Etudiant(String nom, String prenom, float note) {
        this.Nom = nom;
        this.Prenom = prenom;
        this.Note = note;
    }

    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }
    public float getNote() {
        return Note;
    }
    public void setNote(float note) {
        Note = note;
    }


}
