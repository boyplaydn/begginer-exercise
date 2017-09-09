import java.util.Scanner;
public class bai1
{
	public static void main( String [] args )
	{
		Scanner x = new Scanner (System.in);
		String doituong, kichco; 
		System.out.println ( " Question 1) Is it animal, vegetable, or mineral? " );
		doituong = x.next();
		System.out.println ("Question 2) Is it bigger than a breadbox? " );
		kichco = x.next();
		
		if ( doituong.equals("animal") )
		{
			if ( kichco.equals ("yes") )
			{
				System.out.println ("My guess is that you are thinking of a squirrel");
			}
			if( kichco.equals ("no") )
			{
				System.out.println ("My guess is that you are thinking of a moose");
			}
		}
		
		if ( doituong.equals("vegetable") )
		{
			if ( kichco.equals ("yes") )
			{
				System.out.println ("My guess is that you are thinking of a watermelon ");
			}
			if( kichco.equals ("no") )
			{
				System.out.println ("My guess is that you are thinking of a carrot ");
			}
		}
		
		if ( doituong.equals("mineral") )
		{
			if ( kichco.equals ("yes") )
			{
				System.out.println ("My guess is that you are thinking of a Camaro ");
			}
			if( kichco.equals ("no") )
			{
				System.out.println ("My guess is that you are thinking of a paper clip ");
			}
		}
	}
}