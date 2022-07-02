package assesment.second;

public class Prime_number_or_not
{

	public static void main(String[] args) 
	{
		int num=15;
		int count=0;
		for(int i=1; i<=num; i++)
		{
				if(num%i==0)
				{
					count++;
				}
		}
					if(count==2)
					{
					System.out.print("prime number");
					}
					else
					{
					System.out.print("Not a prime number");
					}
				}
			
		}
