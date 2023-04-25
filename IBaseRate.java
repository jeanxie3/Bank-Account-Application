package BankAccountApp;

public interface IBaseRate {
// eine Methode schreiben, die den Baserate zurückgibt
	default double getIBaseRate() {
		return 2.5;
	}
}

