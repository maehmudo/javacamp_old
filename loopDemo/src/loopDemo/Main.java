package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		for (int i = 1; i <= 10; i+=2) {  
			System.out.println(i);
		}
		System.out.println("For loop completed!");
		
		//while 
		int i = 1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While loop completed!");
		
		//Do-While
		int j=0;
		do {
			System.out.println(j);
			j+=2;
			
		} while (j<10);
		
		System.out.println("Do-While loop completed!");

	}

}
