// SI32 Yash Kamthe
/*
Design a class complex with data members for real and imaginary part. Provide default and Parameterized constructors.
Write a program to perform arithmetic operations of two complex numbers 
*/
import java.util.*;
import java.util.Scanner;

class Complex
{
	float real;
	float img;
	
	public Complex()
	{
	real = 0;
	img = 0;
	}
	
	public Complex(float r,float i)
	{
	real = r;
	img = i;
	}
	
	public void display()
	{
	System.out.println(real+"+"+img+"i");
	} 

	void addition(Complex s1,Complex s2)
	{
	Complex s3 = new Complex();
	s3.real = s1.real + s2.real;
	s3.img = s1.img + s2.img;
	System.out.println("Addition is: "+s3.real+"+"+s3.img+"i");
	}

	void subtraction(Complex s1,Complex s2)
	{
	Complex s4 = new Complex();
	s4.real = s1.real - s2.real;
	s4.img = s1.img - s2.img;
	System.out.println("Subtraction is: "+s4.real+"+"+s4.img+"i");
	}

	void multiplication(Complex s1,Complex s2)
	{
	Complex s5 = new Complex();
	s5.real = s1.real*s2.real - s1.img*s2.img;
	s5.img = s1.real*s2.img + s1.img*s2.real;
	System.out.println("Multiplication is: "+s5.real+"+"+s5.img+"i");
	}

	void division(Complex s1,Complex s2)
	{
	Complex s6 = new Complex();
	s6.real = (s1.real*s2.real + s1.img*s2.img)/(s2.real*s2.real+s2.img*s2.img);
	s6.img = (s1.img*s2.real - s1.real*s2.img)/(s2.real*s2.real+s2.img*s2.img);
	System.out.println("Divsion is: "+s6.real+"+"+s6.img+"i");
	}
		 
}

public class complex_number
{
	public static void main(String arg[])	
	{
	
	System.out.println("\nFirst Complex Number: ");
	Complex s1 = new Complex(4,9);
	System.out.println("\nSecond Complex Number: ");
	Complex s2 = new Complex(12,5);
	s1.display();
	s2.display();
	int ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("1: Addition");
        System.out.println("2: Subtracton");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
	System.out.println("5: Exit");
	while(true) // labeling the while loop
         {
             System.out.print("Make your choice: ");  
             ch = sc.nextInt(); // reading user's choice
	switch (ch)
              {
		case 1: 
		Complex s3=new Complex();
		s3.addition(s1,s2);
                break;
		case 2:
		Complex s4=new Complex();
		s4.subtraction(s1,s2);
		break;
		case 3:
		Complex s5=new Complex();
		s5.multiplication(s1,s2);
		break;
		case 4:
		Complex s6=new Complex();
		s6.division(s1,s2);
		break;
		case 5:
		System.exit(0);
                default:
		 System.out.println("Invalid choice! Please make a valid choice. \n\n");
               }
         }
		
	}
}

/*
OUTPUT

mmcoe06@mmcoe06:~/Desktop/yash_k$ java complex_number
4.0+9.0i
12.0+5.0i
1: Addition
2: Subtracton
3: Multiplication
4: Division
5: Exit
Make your choice: 1
Addition is: 16.0+14.0i
Make your choice: 2
Subtraction is: -8.0+4.0i
Make your choice: 3
Multiplication is: -29.0+128.0i
Make your choice: 4
Divsion is: 0.5502958+0.52071005i
Make your choice: 5
*/
