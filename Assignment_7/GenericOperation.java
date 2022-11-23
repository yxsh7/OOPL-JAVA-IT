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
	else if(type == "Prime")
	{
	int prime = 0, i;
	
	
		for(T value: a)
		{	
		int flag = 0;
		int z = Integer.parseInt(value.toString());	
			for(i=2;i<z;i++)
			{
				if((Integer.parseInt(value.toString()))%i==0)
				{
					flag=1;
					break;
				}
				else if(flag==0)
				{
					prime++;
				}
			}
		}
		System.out.println("Prime Numbers are:"+prime);
	}
}
		

	public static void main(String[] args)
	{
	GenericOperation g = new GenericOperation();
	Integer a[]={60,77,9};
	count("Even",a);
	count("Odd",a);
	count("Palindrome",a);
	count("Prime",a);
	}
}
/***OUTPUT***/
/*Even Numbers are:1
Odd Numbers are:2
Palindrome Numbers are:2
Prime Numbers are:6*/


