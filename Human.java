import java.util.Scanner;

public class Human
{
	Scanner scanner = new Scanner(System.in);


	public int age = 5;
	public short height = 2;
	public boolean gender = true;
	public char name;
	public double eyes;

	public char getName()
	{
		return name;
	}
	
	public void setName(char name)
	{
		this.name = name;
	}



	public void fillAge()
	{
		age = scanner.nextInt();
	}

	public void fillHeight()
	{
		height = scanner.nextShort();
	}

	public void fillGender()
	{
		gender = scanner.nextBoolean();
	}

	public void fillName()
	{
		name = scanner.next().charAt(0);
	}

	public void fillEyes()
	{
		eyes = scanner.nextDouble();
	}

	

	public int ReturnAge()
	{
		return age;
	}

	public short ReturnHeight()
	{
		return height;
	}

	public boolean ReturnGender()
	{
		return gender;
	}

	public char ReturnName()
	{
		return name;
	}

	public double ReturnEyes()
	{
		return eyes;
	}



	public void fillAge(int a)
	{
		age = a;
	}

	public void fillHeight(short b)
	{
		height = b;
	}

	public void fillGender(boolean c)
	{
		gender = c;
	}

	public void fillName(char d)
	{
		name = d;
	}

	public void fillEyes(double e)
	{
		eyes = e;
	}


}