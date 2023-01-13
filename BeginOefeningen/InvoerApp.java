import java.util.Scanner;

public class InvoerApp
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

	/*
		System.out.println("vul een woord in");
		String woord = scanner.nextLine();

		System.out.println("vul een nummer in");
		int nummer = scanner.nextInt();

		System.out.println(woord.charAt(nummer));
	*/

		String word = "		Java is what we learn";
		System.out.println(word.indexOf('J'));
		System.out.println(word.substring(5));
		System.out.println(word.trim());
		System.out.println(word.replace('a', '#'));
		System.out.println(word.length());
		System.out.println(word.startsWith("a"));
		System.out.println(word.endsWith("n"));
		
		String result = word.replace('a', '%').concat("++");
		System.out.println(result);

		


	}
}