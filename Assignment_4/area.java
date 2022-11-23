// S132 Yash Kamthe 
/*
Design a base class shape with two double type values and member functions to input the data and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make compute_area() as abstract function and redefine this function in the derived class to suit their requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated area. Implement dynamic binding for given case study.
GITHUB: https://github.com/yxsh7
*/
import java.util.*;
abstract class Shape
{
    double d1,d2;
  Scanner sc=new Scanner(System.in);
    void getData( )
    {  System.out.println("enter dimension :" );
        d1=sc.nextDouble( );
        System.out.println("enter dimension :" );
        d2=sc.nextDouble( );
         
      
    }
  abstract void compute_area( );
}

class triangle extends Shape
{
   double area;
    void compute_area( ) 
   {
      area=0.5*d1*d2;
      System.out.println("area of triangle is :" +area);
   }
}
class rectangle extends Shape
{      double area;
    void compute_area( )
     {  area=d1*d2;
         System.out.println("area of rectangle is: "+ area);
     }
}
         
public class area
{     
       public static void main(String args[ ])
      {
	Scanner sc = new Scanner(System.in);
	int ch;
	System.out.println("1: Triangle Area");
        System.out.println("2: Rectangle Area");
        System.out.println("3: Exit");
	while(true)
	{
        System.out.print("Make your choice: ");  
        ch = sc.nextInt(); // reading user's choice
	switch (ch)
              {
	case 1: 
        triangle t1=new triangle( );
        Shape s;
        t1.getData( );
        s=t1;
        s.compute_area( );
	break;
	case 2:
        rectangle r1=new rectangle( );
        r1.getData( );
        s=r1;
        s.compute_area( );
	break;
	case 3:
	System.exit(0);
        default:
	System.out.println("Invalid choice! Please make a valid choice. \n\n");
               }
         }
       }
}

/*
OUTPUT:

1: Triangle Area
2: Rectangle Area
3: Exit
Make your choice: 1
enter dimension :
20
enter dimension :
50
area of triangle is :500.0
Make your choice: 2
enter dimension :
60
enter dimension :
40
area of rectangle is: 2400.0
Make your choice: 3
*/

