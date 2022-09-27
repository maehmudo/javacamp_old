package methods;

public class Main {
	public static void main(String[] args) {

		findTheNumber();
		findTheNumber();
		findTheNumber();
		findTheNumber();
	}

	public static void findTheNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int searched = 11;
		boolean isThereAny = false;
		for (int number : numbers) {

			if (number == searched) {
				isThereAny = true;
				break;
			}
		}
		if (isThereAny) {
			giveMessage("There is a searched number : " + searched);
		} else {
			giveMessage("There is NOT a searched number : " + searched);

		}

	}

	public static void giveMessage(String message) {
		System.out.println(message);
	}

}
