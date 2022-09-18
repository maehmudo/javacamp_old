package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Perfect! : You passed this course");
			break;
		case 'B':
		case 'C':
			System.out.println("Okay! : You passed this course");
			break;
		case 'D':
			System.out.println("Normal! : You passed this course");
			break;
		case 'E':
			System.out.println("Unfortunately! You don't passed this course");
			break;

		default:
			System.out.println("You entered an invalid grade");

		}
	}

}
