package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Today,the weather is good.";
		String newMesage = giveCity();
		System.out.println(newMesage);
		int number = sumUp(3,7);
		System.out.println(number);
		int sum = sumUp2(2,3,4,5,6,7);
		System.out.println(sum);
	}

	public static void add() {
		System.out.println("Added..");
	}

	public static void delete() {
		System.out.println("Deleted..");
	}

	public static void update() {
		System.out.println("Updated..");
	}

	public static int sumUp(int number1, int number2) {
		System.out.println("The numbers added up..");
		return number1 + number2;
	}
	
	public static int sumUp2(int...numbers) {
		int sum = 0;
		for (int number:numbers) {
			sum+=number;
		}
		return sum;
	}

	public static String giveCity() {
		return "Adana";
	}
}
