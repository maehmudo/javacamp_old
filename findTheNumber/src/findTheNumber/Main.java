package findTheNumber;

public class Main {

	public static void main(String[] args) {
		int [] numbers = new int[] {1,2,5,7,9,0};
		int searched = 11;
		boolean isThereAny = false;
		for (int number : numbers) {
			
			if( number == searched) {
				isThereAny = true;
				break;
			}
		}
		if(isThereAny) {
			System.out.println("There is a searched number");

		}
		else {
			System.out.println("There is NOT a searched number");

		}
	}

}
