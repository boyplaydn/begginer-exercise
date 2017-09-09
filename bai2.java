import java.util.Scanner;
import java.util.Random;
public class bai2
{
	public static void main( String [] args )
	{
		Random r = new Random();
		Scanner x = new Scanner(System.in);
		int a = 1 + r.nextInt(10);
		int b;
		
		System.out.println("Serect number game");
		b = x.nextInt();
		if ( b == a)
		{
			System.out.println("You right number is:  " + b );
		}
		else
		{
			System.out.println("Sorry serect number was: " +a);
		}
	}
	
}