package assesment.second;

public class Given_number_is_palindrome_or_not 
{
	public static void main(String[] args) 
	{
		int num=12321;
		int reminder=0;
		int sum=0;
		int temp=num;
        while(num>0)
		{
        	reminder=num%10;
        	num=num/10;
        	sum=(sum*10)+reminder;
		}
        num=temp;
		if(num==sum)
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
	}
}
