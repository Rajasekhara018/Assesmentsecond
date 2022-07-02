package assesment.second;

public class Negative_elements_in_an_array 
{

	public static void main(String[] args) 
	{
		int array[]= {-1,3,5,-6,-6,9,-3};
		int count=0;
		System.out.print("Move negative elements the array at the end:");
		for(int i=0; i<array.length;i++)
		{
			if(array[i]>=0)
			{
				count++;
				if(count==1)
				{
				System.out.print(array[i]);
				}
				else
				{
					System.out.print(","+array[i]);
				}
			}
		}
		count=0;
		for(int i=0; i<array.length;i++)
		{
			if(array[i]<=0)
			{
				count++;
				if(count==1)
				{
				System.out.print(array[i]);
				}
				else
				{
				System.out.print(","+array[i]);
			}

		}
	}
	}
}
