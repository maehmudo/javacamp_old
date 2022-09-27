package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourTransactions fourTransactions = new FourTransactions();
		System.out.println(fourTransactions.sumUp(2,3));
		System.out.println(fourTransactions.sumUp(2,3,5));

	}

}
