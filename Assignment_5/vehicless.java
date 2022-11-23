/*
SI32 Yash Kamthe
Design and develop a context for given case study and implement an 
interface for Vehicles Consider the example of vehicles like bicycle,
car and bike. All Vehicles have common functionalities such as Gear Change,
Speed up and apply breaks. Make an interface and put all these common functionalities.
Bicycle, Bike, Car classes should be implemented for all these functionalities in their 
own class in their own way
GITHUB: https://github.com/yxsh7
*/

import java.util.*;

interface vehicle 
{
	void gear_change(int a);		
	void speed_up(int a);
	void apply_brakes(int a);
	void display();
}

class bicycle implements vehicle 
{
	int speed;
	int gear;

	public void gear_change(int gear_choose)
	{
		// bicycle with 24 gears
		if(gear_choose<25 && gear_choose>0)
		{
			gear=gear_choose;
			System.out.println("GEAR SET TO: "+gear);
		}
		else
			System.out.println("Choose Gear Between 1 to 25");
	}

	public void speed_up(int increase_speed)
	{ 
        speed = speed + increase_speed;
    	}

	public void apply_brakes(int decrease_speed)
	{ 
        speed = speed - decrease_speed;
    	}

	public void display()
	{
         System.out.println("BICYCLE SPEED: " + speed + " BICYCLE GEAR: " + gear);
    	}
	
}

class bike implements vehicle
{
	int speed;
	int gear;
	
	public void gear_change(int gear_choose)
	{
		// bike with 6 gears
		if(gear_choose<7 && gear_choose>0)
		{
			gear=gear_choose;
			System.out.println("GEAR SET TO: "+gear);
		}
		else
			System.out.println("Choose Gear Between 1 to 6");
	}

	public void speed_up(int increase_speed)
	{ 
        speed = speed + increase_speed;
    	}

	public void apply_brakes(int decrease_speed)
	{ 
        speed = speed - decrease_speed;
    	}

	public void display()
	{
         System.out.println("BIKE SPEED: " + speed + "BIKE GEAR: " + gear);
    	}
	
}

class car implements vehicle
{
	int speed;
	int gear;

	public void gear_change(int gear_choose)
	{
		// car with 6 gears
		if(gear_choose<7 && gear_choose>0)
		{
			gear=gear_choose;
			System.out.println("GEAR SET TO: "+gear);
		}
		else
			System.out.println("Choose Gear Between 1 to 6");
	}

	public void speed_up(int increase_speed)
	{ 
        speed = speed + increase_speed;
    	}

	public void apply_brakes(int decrease_speed)
	{ 
        speed = speed - decrease_speed;
    	}

	public void display()
	{
         System.out.println("CAR SPEED: " + speed + "CAR GEAR: " + gear);
    	}
	
}

class vehicless
{
public static void main(String[] args) 
{


    Scanner sc=new Scanner(System.in);		
    
    vehicle v=null;			
    int y;			
    bb:		
    do {
        System.out.print("  SELECT VEHICLE  \n\t1.BICYCLE \n\t2.CAR  \n\t3.BIKE \n\t4.Exit \nChoice::");
         y=sc.nextInt();
         
        if(y==1)		
            v=new bicycle();	
        else if(y==2)
            v= new car();	
        else if(y==3)
            v=new bike();		
        else if(y==4)
            break bb;			
        else
            System.out.println("INVALID INPUT");
        
        if(0<y&&y<4) {
        aa:		
            do {
                System.out.print(" \tPress 1. Speed Up \n\tPress 2. Change gear \n\tPress 3. Apply Brakes  "
                    + "\n\tPress 4. Display Vehicle Status \n\tPress 5. change Vehicle /Exit \nChoice::");
                int z=sc.nextInt();  		
            switch(z)
            {
            case 1:
		System.out.print("Enter Speed: ");
                int b = sc.nextInt();
                v.speed_up(b);
                break;
            case 2:
                System.out.print("Enter the gear you want:    ");
                int a=sc.nextInt();
                v.gear_change(a);
                break;
                
            case 3:
		System.out.print("Enter Speed to be reduced from Original Speed: ");
                int c = sc.nextInt();
                v.apply_brakes(c);
                break;
            case 4:
                v.display();
                break;
            case 5:
                break aa;		
            default:
                    System.out.println("Invalid Input"); 
            }
            }while(true);
        }   
    }while(y!=4); 
}
}
/*
OUTPUT:

  SELECT VEHICLE  
	1.BICYCLE 
	2.CAR  
	3.BIKE 
	4.Exit 
Choice::1
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::1
Enter Speed: 20
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::2
Enter the gear you want:    16
GEAR SET TO: 16
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::4
BICYCLE SPEED: 20 BICYCLE GEAR: 16
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::3
Enter Speed to be reduced from Original Speed: 10
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::4
BICYCLE SPEED: 10 BICYCLE GEAR: 16
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::5
  SELECT VEHICLE  
	1.BICYCLE 
	2.CAR  
	3.BIKE 
	4.Exit 
Choice::2
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::1
Enter Speed: 50
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::2
Enter the gear you want:    7
Choose Gear Between 1 to 6
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::2
Enter the gear you want:    4
GEAR SET TO: 4
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::4
CAR SPEED: 50CAR GEAR: 4
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::5
  SELECT VEHICLE  
	1.BICYCLE 
	2.CAR  
	3.BIKE 
	4.Exit 
Choice::3
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::1
Enter Speed: 100
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::2
Enter the gear you want:    3
GEAR SET TO: 3
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::4
BIKE SPEED: 100BIKE GEAR: 3
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::3
Enter Speed to be reduced from Original Speed: 50
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::4
BIKE SPEED: 50BIKE GEAR: 3
 	Press 1. Speed Up 
	Press 2. Change gear 
	Press 3. Apply Brakes  
	Press 4. Display Vehicle Status 
	Press 5. change Vehicle /Exit 
Choice::5
  SELECT VEHICLE  
	1.BICYCLE 
	2.CAR  
	3.BIKE 
	4.Exit 
Choice::4

*/
