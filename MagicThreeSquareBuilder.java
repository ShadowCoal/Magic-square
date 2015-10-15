public class RandomMagicSquareBuilder {
	public static void main(String[]args){
		
		int a1 =0;
		int a2 = 0;
		int a3 = 0;
		int b1 = 0;
		int b2 = 5;
		int b3 = 0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		a1 = edge();
		a3 = one(a1);
		
		if (a3 == 6)
		{
			c1 = 4;
			if (a1 == 2)
				c3 = 8;
			else 
				c3 = 2;
		}
		else if (a3 == 4)
		{
			c1 = 6;
			if (a1 == 2)
				c3 = 8;
			else 
				c3 = 2;
		}
		else if (a3 == 2)
		{
			c1 = 8;
			if (a1 == 6)
				c3 = 4;
			else
				c3 = 6;
		}
		else if (a3 == 8)
		{
			c1 = 2;
			if (a1 == 6)
				c3 = 4;
			else
				c3 = 6;
		}
		a2 = 15 - (a1 + a3);
		b1 = 15 - (a1 + c1);
		b3 = 15 - (a3 + c3);
		c2 = 15 - (c1 + c3);
		System.out.println(a1 + " " + a2 + " " + a3);
		System.out.println(b1 + " " + b2 + " " + b3);
		System.out.println(c1 + " " + c2 + " " + c3 + "\nIs a magic square");
		
	}
	public static int edge()
	{
		final int  high = 4;
		final int  low = 1;
		int random = 0;
		random = 2*((int)(Math.random() * 100) % high+ low);
		return random;
	}
	public static int one(int a1)
	{
		int high = 4;
		int low = 1;
		int random = 0;
		if (a1 == 2 || a1 == 8)
		{
			low = 2;
			high = 3;
		}
		random = 2*((int)(Math.random() * 100) % high+ low);
		while (random <a1 +4 && random > a1 -4)
			random = 2*((int)(Math.random() * 100) % high+ low);
		
		return random;
	}
	
}
