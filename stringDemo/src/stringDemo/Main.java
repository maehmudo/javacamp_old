package stringDemo;

public class Main {

	public static void main(String[] args) {
		String message ="Today, the weather is so good.";
		System.out.println(message);

		/*
		 * System.out.println("Number of Character : "+message.length());
		 * System.out.println("5. character : " +message.charAt(4));
		 * System.out.println(message.concat("Yaaayyy"));
		 * System.out.println(message.startsWith("A"));
		 * System.out.println(message.endsWith(".")); char[] characters = new char[5];
		 * 
		 * message.getChars( 0, 5, characters, 0); System.out.println(characters);
		 * System.out.println(message.indexOf('a')); //Metin içinde ilk bulduğu a'da
		 * aramayı bitirir.
		 */
		
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(2,5));
		
		for (String word: message.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());//bütün harfleri küçültüyor.
			
	}

}
