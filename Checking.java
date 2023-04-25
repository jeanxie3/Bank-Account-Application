package BankAccountApp;

public class Checking extends Account{
// Liste der spezifischen Eigenschaften von Checking Accounten
private int debitCardNum, pin;
// Konstrukteur zum Einrichten des Checking Accounten
public Checking(String name, String sSN,double initDeposit) {
	super(name,sSN,initDeposit);
	accountNum = "1" + this.accountNum;
	//System.out.println("AccountID: " + accountNum);
	setDebitCard();
}
// Liste der spezifischen Methoden von Checking Accounten
public void zeigenInformationen() {
	super.zeigenInformationen();
	System.out.println("Account Type: Checking" + "\nDebit Card Nummer: " + debitCardNum + "\nPIN: " + pin);
}
private void setDebitCard() {
	debitCardNum = (int)(Math.random()*Math.pow(10, 12));
	pin = (int)(Math.random()*Math.pow(10, 4));
}
public void setRate() {
	rate = getIBaseRate()*.15;
}
}
