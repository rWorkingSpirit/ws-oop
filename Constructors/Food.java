class Food
{
	public String typeOfFood;

	{ System.out.println("Get Plate"); }
	{ System.out.println("Get Fork"); }
	{ System.out.println("Get Spoon"); }
	
	public Food()
	{
		System.out.println("Preparing plain food");
	}

	public Food(String typeOfFood)
	{
		this("hello", 4);
		this.typeOfFood = typeOfFood;
		System.out.println("Preparing " + this.typeOfFood);
	}

	public Food(String typeOfFood, int amount)
	{
		this.typeOfFood = typeOfFood;
		System.out.println("Preparing " + this.typeOfFood + amount);
	}

	public static void main(String[] args) {}
}