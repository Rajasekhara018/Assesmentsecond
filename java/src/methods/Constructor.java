package methods;
import java.util.Scanner;
public class Constructor 
{
	static Scanner sc = new Scanner(System.in);
	Constructor() //Default constructor
	{
		System.out.print("raja");
	}
	Constructor(int a, String b, float c, char d) //Parameterised constructor
	{
		System.out.print(a+" "+b+" "+c+" "+d);
	}

	public static void main(String[] args) 
	{
		Constructor dc = new Constructor(sc.nextInt(),sc.next(),sc.nextFloat(), sc.next().charAt(4));
	}
}


/*Scanner statement:
 * int a =object.nextInt();
 * float b =object.nextFloat();
 * double c =object.nextDouble();
 * long d =object.nextLOng();
 * String e =object.next();
 * char f =object.next().charAt(index value);
 * byte g =object.nextByte();
 * short h =object.nextShort();
 */
	
