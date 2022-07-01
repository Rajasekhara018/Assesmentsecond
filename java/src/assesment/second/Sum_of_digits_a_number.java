package assesment.second;

public class Sum_of_digits_a_number 
{
	public static void main(String[] args) 
	{
		int num=13627;
		int remainder=0;
		int sum=0;
		int count=0;
		System.out.print("sum of digits of a number:");
		while(num>0)
		{
			count++;
			remainder=num%10;
			if(count==1)
			{
				System.out.print(remainder);
			}
			else
			{
				System.out.print("+"+remainder);
			}
			sum=sum+remainder;
			num=num/10;
		}
		System.out.print("="+sum);
	}

}
