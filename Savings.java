package BankAccountApp;

public class Savings extends Account{
	// Liste der spezifischen Eigenschaften von Saving Accounten
	private int saftyDepositBoxId, saftyDepositBoxKey;
	// Konstrukteur zum Einrichten des Saving Accounten
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNum = "2" + this.accountNum;
		//System.out.println("AccountID: " + accountNum);
		setSaftyDebox();
	}
	private void setSaftyDebox() {
		saftyDepositBoxId = (int)(Math.random()*Math.pow(10, 3));
		saftyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
		
	}
	// Liste der spezifischen Methoden von Saving Accounten
	public void zeigenInformationen() {
		super.zeigenInformationen();
		System.out.println("Account Type: Saving" + "\nSafty Depositbox ID: " + saftyDepositBoxId + "\nSafty Depositbox Key: "+ saftyDepositBoxKey);
	}
	public void setRate() {
		rate = getIBaseRate()-.15;
	}
}
