/*
SI32 Yash Kamthe
Implement a program to handle Arithmetic exception, Array Index Out of Bounds.
The user enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed.
If Num1 and Num2 are not integers, the program would throw a Number Format Exception.
If Num2 were zero, the program would throw an Arithmetic Exception. Display the exception.
GITHUB: https://github.com/yxsh7
*/
import java.util.*;
class exception
{
Scanner sc=new Scanner(System.in);
int num1;
int num2;
int result;

	void division()
	{
		try
		{
 		System.out.print("Enter First Number: ");
		num1=sc.nextInt();
		System.out.print("Enter Second Number:");
		num2=sc.nextInt();
		result = num1/num2;
		System.out.print("The Result is: "+result);
		}
		catch(ArithmeticException e)
		{
		System.out.println("You should not divide a number by zero");
		}
		catch(InputMismatchException e)
		{
		System.out.println("Wrong Format, only Integers are allowed.");	
		}
		catch(Exception e)
		{
		System.out.println("Exception occurred");	
		}
	}
}

class ArrayOperation
{
//int a[10];
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int i;
	public void input()
	{
	System.out.print("Enter 10 numbers: ");
 		for(i=0;i<10;i++)
		{
		a[i]=sc.nextInt();
		}
	}
	
	public void arraydisplay(int x)
	{
		try
		{
		System.out.print("THE NUMBER AT INDEX "+ x +" IS: "+a[x]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
      		System.out.println ("ArrayIndexOutOfBounds Exception occurred");
    		}
	}
}

class exceptionhandling
{
public static void main(String[] args)
{
exception e=new exception();
ArrayOperation z=new ArrayOperation();
Scanner sc=new Scanner(System.in);
int n;

while(true)
{
	System.out.println("\nEnter the Choice which you want to check type of error \n "+"1]Arithmaticexception"+"\n 2]ArrayOutOfBound"+"\n 3]Exit"); 				              
	n=sc.nextInt();
	switch(n) 	
	{
		case 1:
		e.division();
		break;
		case 2:
		z.input();
		System.out.print("\nEnter the Index No. of Element which you want to print ::");
		int i=sc.nextInt();
		z.arraydisplay(i);
		break;
		case 3:
		System.exit(0);	
	}
}
}
}
/*
Enter the Choice which you want to check type of error 
 1]Arithmaticexception
 2]ArrayOutOfBound
 3]Exit
1
Enter First Number: 100
Enter Second Number:a
Wrong Format, only Integers are allowed.

Enter the Choice which you want to check type of error 
 1]Arithmaticexception
 2]ArrayOutOfBound
 3]Exit
2
Enter 10 numbers: 1
2
3
4
5
6
7
8
9
0

Enter the Index No. of Element which you want to print ::11
ArrayIndexOutOfBounds Exception occurred

Enter the Choice which you want to check type of error 
 1]Arithmaticexception
 2]ArrayOutOfBound
 3]Exit
3

*/
