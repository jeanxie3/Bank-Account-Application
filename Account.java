package BankAccountApp;

public abstract class Account implements IBaseRate {
//Liste der gemeinsamen Eigenschaften von Checking und Saving Accounten
private String name,sSN;
protected String  accountNum;
private static int index = 10000;
private double balance;
protected double rate;
//Konstruktor zum Festlegen der Basiseigenschaften und Initialisieren des Kontos
public Account(String name, String sSN, double initDeposit) {
	this.name = name;
	this.sSN = sSN;
	balance = initDeposit;
	//Systemout.println(name + " " + sSN+" "+ balance);
	
	//Accountnummer erstellen
	index++;
	this.accountNum = erstellenAccountNum();
	//System.out.println("AccountID: " + this.accountNum);
	setRate();
	
}

public abstract void setRate();
//Liste gemeinsame Methode
private String erstellenAccountNum() {
	String letztezweiNum = sSN.substring(sSN.length()-2,sSN.length());
	
	int funfNum = index;
	int random = (int) (Math.random()*Math.pow(10, 3));
	return letztezweiNum + funfNum + random;
}
public void zeigenInformationen() {
	
	System.out.println("Name: " + name + "\nAccountID:　" + accountNum + "\nSaldo:" + balance +"\nRate: " + rate); 
}

public void einzahlung(double betrag) {
	balance = balance + betrag;
	System.out.println(betrag + " Euro eingezahlt" + "\nIhr Saldo ist: " + balance);
}

public void auszahlung(double betrag) {
	balance = balance - betrag;
	System.out.println(betrag + " Euro ausgezahlt"+ "\nIhr Saldo ist: " + balance);
}

public void ueberweisung(String anwem, double betrag) {
	balance = balance - betrag;
	System.out.println(betrag + " Euro an "+ anwem + " uberwiesen"+ "\nIhr Saldo ist: " + balance);
}
public void compound() {
	double accruedInterest = balance * (rate/100);
	balance = balance + accruedInterest;
	System.out.println("Aufgelaufene Zinsen: "+ accruedInterest + " Euro\nIhr Saldo ist: " + balance + " Euro");
	
}
}
