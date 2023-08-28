public class Voiture implements Runnable {
	private String nom;
	private int compteur;
	
	public Voiture(String nom) {
		this.nom = nom;
	}
	
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				++compteur;
				System.out.println("Voiture : " + this.nom + " i = " + i + " Compteur = " + this.compteur);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
