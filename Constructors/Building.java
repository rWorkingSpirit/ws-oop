class Building
{
	public String color;

	public Building() // Default Constructor
	{
		System.out.println("Constructor is calling");
		color = "Brick red";
	}

	public Building(String color) // Default Constructor
	{
		this.color = color;
		System.out.println("Constructor is calling");
	}

	// Initializer block
	{
		System.out.println("In initializer block");
	}
	
	// Initializer block2
	{
		System.out.println("In initializer block 2");
	}
	

	public static void main(String[] args)
	{

	}

}