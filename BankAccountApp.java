package BankAccountApp;

public class BankAccountApp {

	public static void main(String[] args) {
		// Lesen einer CSV-Datei und Erstellen eines neuen Kontos auf der Grundlage dieser Daten
		Checking c1 = new Checking("John Q", "8943752",234);
		Savings s1 = new Savings("Tim Y", "8758642",264);
		
		s1.compound();
		
		c1.zeigenInformationen();
		System.out.print("\n");
		s1.zeigenInformationen();
		
		}

}
