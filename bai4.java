import java.util.Scanner;
import java.util.Random;
public class bai4
{
	public static void main( String [] args )
	{	
		Scanner x = new Scanner ( System.in);
		int n = x.nextInt();
		int S = 0;
		for (int i = 1; i <= n; i++)
		{
			
			System.out.println(i);
			S = S + i;
		}
		System.out.println("Sum is : " + S);
	}
	
}