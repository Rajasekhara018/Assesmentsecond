package assesment.second;

import java.util.Scanner;

public class Pattern
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the size of pattern:");
	  int size=sc.nextInt();
	  for(int i=1; i<=size; i++)
	  {  
		  for(int j=i; j<=size; j++)
		  {
			  System.out.print(" ");
		  }

		  for(int j=1; j<=i;j++)
		  {		
			  System.out.print("* ");
		  }
		  System.out.println();
	  }

	}

}
