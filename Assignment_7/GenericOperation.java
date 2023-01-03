//SI32 Yash Kamthe
/*
Implement a generic program using any collection class to count the number of
elements in a collection that have a specific property such as even numbers, odd
number, prime number and palindromes.
*/
import java.util.*;

class GenericOperation
{
	public static <T>void count(String type,T a[])
	{
	if(type == "Even")
		{
		int even = 0;
			for(T value: a)
			{
			if((Integer.parseInt(value.toString()))%2==0)
				{
				even++;
				}
			}
			System.out.println("Even Numbers are:"+even);
		}
	else if(type == "Odd")
		{
		int odd = 0;
			for(T value: a)
			{
			if((Integer.parseInt(value.toString()))%2!=0)
				{
				odd++;
				}
			}
			System.out.println("Odd Numbers are:"+odd);
		}
	else if(type == "Palindrome")
		{
		int palindrome = 0;
			for(T value: a)
			{
					StringBuffer rev = new StringBuffer(value.toString());
					
					if(value.toString().equals(new String(rev.reverse())))	
					{
						palindrome++;
					}	 
			}
			System.out.println("Palindrome Numbers are:"+palindrome);
		}
		int prime = 0;
		if(type.equals("Prime"))
		{

			for(T value : a)
			{
				int n=Integer.parseInt(value.toString());
				int flag=0;

				for(int i=2;i<n;i++)
				{
					if(Integer.parseInt(value.toString())%i==0)
						{
							flag=1;
							break;
						}
				}
				if(flag==0)
				{
					prime++;
				}
			}            
			System.out.println("Total Prime Numbers in array are: "+ prime);
		}
}
		

	public static void main(String[] args)
	{
	GenericOperation g = new GenericOperation();
	Integer a[]={13,11,23,6,9,77};
	count("Even",a);
	count("Odd",a);
	count("Palindrome",a);
	count("Prime",a);
	}
}
/***OUTPUT***/
/*
Even Numbers are:1
Odd Numbers are:5
Palindrome Numbers are:4
Total Prime Numbers in array are: 3
*/


