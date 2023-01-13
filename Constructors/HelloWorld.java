public class HelloWorld
{
	public String text;
	public int times;

	public HelloWorld()
	{
		System.out.println("Hello World");
	}
	
	public HelloWorld(String text)
	{
		this.text = text;
		System.out.println("Hello from the other side");
	}

	public HelloWorld(String text, int times)
	{
		this.text = text;
		this.times = times;
		System.out.println("Hello " + text + " the other " + times);
	}

	public static void main(String[] args)
	{

	}

}