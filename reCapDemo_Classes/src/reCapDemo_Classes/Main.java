package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		FourTransactions fourTransactions = new FourTransactions();
		int result = fourTransactions.SumUp(1, 2);
		int result1 = fourTransactions.Multiply(11, 22);

		System.out.println(result);
		System.out.println(result1);

	}

}
