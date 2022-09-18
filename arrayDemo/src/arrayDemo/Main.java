package arrayDemo;

public class Main {

	public static void main(String[] args) {
		String student1 ="Mahmut";
		String student2 ="Sevgi";
		String student3 ="Aydin";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println("--------------------");

		String[] students = new String[3]; // dizinin kaç elemandan oluştuğunu gösteriyoruz.
		students[0]="Mahmut";
		students[1]="Sevgi";
		students[2]="Aydin";
		
		for (int i = 0; i < students.length; i++) {
			
			System.out.println(students[i]);
		}
		System.out.println("--------------------");	
		
		for(String student:students) {
			
			System.out.println(student);

		}
		

			
		
	}

}
