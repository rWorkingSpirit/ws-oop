import java.util.Scanner;

public class OOPProduct
{
	public static void main(String[] args)
	{
		Car car = new Car();

		car.setBrand("Opel");
		System.out.println(car.getBrand());

		car.setDoors(4);
		System.out.println(car.getDoors());

		car.setWheels(4);
		System.out.println(car.getWheels());
	
		car.setEngineRunning(true);
		System.out.println(car.isEngineRunning());

		car.setSpeed(1250);
		System.out.println(car.getSpeed());
		


		/*
		//Scanner scanner = new Scanner(System.in);

		Product p = new Product();	// Initializzation

		Product p2;	// Declaration
		p2 = new Product(); // Assignment

		p.name = "TV";
		//p.printName();

		
		Human male = new Human();
		Human	female = new Human();

		
		System.out.print("Please input an age for the human: ");
		male.fillAge();
		System.out.print("Please input how man eyes you would like: ");
		male.fillEyes();
		

		
		male.age = 28;
		male.height = 2;
		male.gender = false;
		male.name ='a';
		male.eyes = 2.0;
		
	
		
		System.out.println("Please input the age");
		female.fillAge();

		System.out.println("Please input the height");
		female.fillHeight();

		System.out.println("Please input true or false for gender");
		female.fillGender();
		
		System.out.println("Please input the name as a character");
		female.fillName();

		System.out.println("Please input amount of eyes");
		female.fillEyes();
		


		female.fillAge(5);
		female.fillHeight((short)2);
		female.fillGender(true);
		female.fillName('y');
		female.fillEyes(66.66);


		
		int fAge = female.ReturnAge();	
		short fHeight = female.ReturnHeight();
		boolean fGender = female.ReturnGender();
		char fName = female.ReturnName();
		double fEyes = female.ReturnEyes();

		System.out.println("Female age = " + fAge);
		System.out.println("Female height = " + fHeight);
		System.out.println("Part of the female gender? " + fGender);
		System.out.println("Name of the female: " + fName);
		System.out.println("Amount of eyes of the female: " + fEyes);


		*/

	}




}