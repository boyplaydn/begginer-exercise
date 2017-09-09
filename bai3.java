import java.util.Scanner;
import java.util.Random;
public class bai3
{
	public static void main( String [] args )
	{
		for (int i = 1; i < 20; i++)
		{
			
			if ( i % 5 == 0 ) System.out.println("Buzz");
			if ( i % 3 == 0 ) System.out.println("Fizz");
			else System.out.println(i);
			
		}
	}
	
}