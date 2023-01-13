package  working.spirit.util;

public class Tee
{
	// Access modifiers.
	public String name;
	private int amount;
	boolean hot;	// Default access modifer
	protected boolean glass;

	{
		System.out.println("this is the initilazation");
	}

	public static void main(String[] args)
	{
		System.out.println("Tee main Method");
	}
}