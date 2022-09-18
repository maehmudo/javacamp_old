package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2; //remainder = kalan 
		//System.out.println(remainder);
		boolean isItPrime = true;
		
		
		if(number == 1) {
			System.out.println("This number is NOT prime number");
			return;
		}
		
		if(number < 1) {
			System.out.println("You entered an invalid number");
		}
		
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isItPrime = false;
			}
		}
		
		if (isItPrime) {
			System.out.println("This number is prime number");
		}
		
		else {
			System.out.println("This number is NOT prime number");

		}
			
		
		
	}

}
