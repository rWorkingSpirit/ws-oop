import working.spirit.util.Tee;
//import test.model.Webshop;
import webshop.*;

import java.util.Scanner;

public class Application
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		// Webshop w = new Webshop();

		//Tee t = new Tee();
		//t.name = "Tea";
		// t.amount = 4; // private, can't access this outside the class. They are accessible only within the class which has these private entities as its members.
		// t.hot = true; // default, can only be accessed when in same package. package-private which means every class (whether extending it or not) within same package can access it.
		// t.glass = false;	// protected, can't access this.


		System.out.println("Werkt");

		Webshop web = new Webshop();
		Klant klant = new Klant();

		System.out.print("Voer een naam in voor het product: ");
		if(scanner.hasNext())
		{
			web.item = scanner.nextLine();
		}
		else
		{
			System.out.println("Verkeerde waarde.");
			System.exit(0);
		}


		System.out.print("Voer prijs in: ");
		if(scanner.hasNextDouble())
		{
			web.prijs = scanner.nextDouble();
		}
		else
		{
			System.out.println("Verkeerde waarde.");
			System.exit(0);
		}


		System.out.print("Voer een leeftijd voor de klant in: ");
		if(scanner.hasNextInt())
		{
			web.setKlantLeeftijd(scanner.nextInt());
		}
		else
		{
			System.out.println("Verkeerde waarde.");
			System.exit(0);
		}


		System.out.print("Is de winkel schoon? true/false ");
		if(scanner.hasNextBoolean())
		{
			web.setWinkelIsSchoon(scanner.nextBoolean());
		}
		else
		{
			System.exit(0);
		}
		

		System.out.print("Is het product uitverkocht? true/false ");
		if(scanner.hasNextBoolean())
		{
			web.setUitverkocht(scanner.nextBoolean());
		}
		else
		{
			System.exit(0);
		}
		

		System.out.print("Voer een naam in voor de klant: ");
		if(scanner.hasNext())
		{
			klant.naam = scanner.next();
			web.setGuppie(klant);
		}
		else
		{
			System.exit(0);
		}
		

		System.out.println("De klant heet: " + klant.naam);
		System.out.println("De klant is " + web.getKlantLeeftijd() + " jaar oud");
		System.out.println("De klant koopt: " + web.item);
		System.out.println("De " + web.item + " is " + web.prijs +" euro");
		System.out.println("Het " + web.item + " is uitverkocht? " + web.isUitverkocht());
		System.out.println("De winkel is schoon? " + web.isWinkelIsSchoon());


		/*
		web.prijs = 12;
		web.item = "Lasergun";
		//web.setUitverkocht(false);
		//web.setWinkelIsSchoon(true);
		web.setGuppie(klant);
		web.setKlantLeeftijd(999);

		*/
		
	}
}