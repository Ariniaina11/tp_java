public class Main {

	public static void main(String[] args) {
		Voiture v1 = new Voiture("MAZDA");
		new Thread(v1).start();
	}

}
