public class Application
{
	public static void main(String[] args)
	{
		System.out.println("Het werkt");

		// Declaration
		int a; int c; int d, e;
		// Assignment
		a = 12;
		c = 123; d = 3;
		// Initialization
		int b = 24;
		int h = 11, j = 10;
		
		
		// Hele getal
		byte _bb = 23; // 8 bit
		short s11 = 5123; // 16 bit
		int i$ = 345356; // 32 bit
		long l = 876543234; // 64 bit

		float f = 12; // 12.0
		float _f = 12f;
		double do_ = 23.56;

		boolean bool = true; 

		char _c = 'c';
		
		String s2 = "Working Spirit";


		System.out.println("----------------------------------");


		a = a++ + a;
		System.out.println(a);
		a = --a + a - a++;
		System.out.println(a);


		int __a = 12;
		int __b = 12;
		int __c = __a * __b;

		System.out.println("----------------------------------");

		System.out.println("int *: " + __c);

		short __s = 3;
		int __i = __a * __s;

		System.out.println("short * int: " + __i);


		double __dd = 12.45;
		double __de = 14.87;
		double __Total = __dd / __de;

		System.out.println("double /: " + __Total);

		__Total = __a / __dd;

		System.out.println("int / double: " + __c);



		System.out.println("----------------------------------");

		int modulus = 23 % 8;
		System.out.println("Modulus is wat overblijft: " + modulus);


		System.out.println("----------------------------------");
		
		System.out.println("!= ... ! wordt uitgesproken als bang op zijn engels");
		

		boolean comp = 12 != 28;
		System.out.println(comp);
		boolean comp2 = !comp;
		System.out.println(comp2);

		System.out.println("----------------------------------");

		if(false)
		{
			System.out.println("Het is waar");
		}
		else
		{
			System.out.println("Het is niet waar");
		}


		System.out.println("----------------------------------");


		boolean isGelijk = a < b;
		System.out.println("Integer vergelijking: " + isGelijk);
		
		boolean isNietGelijk = __dd != __s;
		System.out.println("double met short vergelijking: " + isNietGelijk);

		boolean gelijk = _bb >= _c;
		System.out.println("byte met char vergelijking: " + gelijk);

		System.out.println("----------------------------------");

		if(false)
		{
			System.out.println("Het is waar");
		} else if(true)
		{
			System.out.println("else if is waar");
			System.out.println("je mag eindigen met else if");
		}

		System.out.println("----------------------------------");


		
		// Reasigns 400 to both a and b
		int _$a = 12 , _$b = 6;
		_$a = _$b = 400;
		System.out.println(_$a);

		// Assignment starts from right to left.
		int $$a = 12 , $$b = 6, $$c = 80;
		$$a = $$b = $$c;
		System.out.println($$a);

		// unary increment with char
		char x = 'x';
		System.out.println(++x);
		System.out.println((int)x);

		// When using final you can use short instead of int on arithmetic operators
		final short __1x = 10;
		final short __1y = 2;
		short z = __1x / __1y;

		System.out.println(z);




		
		



	}
}


