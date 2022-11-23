/*
SI32 Yash Kamthe
Implement Factory design pattern for the given context. Consider Car building process, which requires many steps from allocating accessories to final makeup. These steps should be written as methods and should be called while creating an instance of a specific car type. Hatchback, Sedan, SUV could be the subclasses of Car class. Car class and its subclasses, CarFactory and Test Factory Pattern should be implemented.
GITHUB: https://github.com/yxsh7
*/
import java.util.*;

abstract class CarFactory
{
    String color;
	String fuel_choice;

    abstract void details(String color, String fuel_choice);
    abstract void accessories();

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your colour choice: ");
        color=sc.next();
	System.out.print("Enter your Fuel choice (PETROL/DIESEL): ");
	fuel_choice=sc.next();
    }

    public void car_details_display(CarFactory c)
    {
        c.details(color,fuel_choice);
        c.accessories();
    }
}

class hatchback extends CarFactory
{
    public void details(String color, String fuel_choice)
    {   
        System.out.println("--------------------------------------------------------------");
        System.out.println("CAR DETAILS: \nName: XUV 300(hatchback)\nHorsepower: 150 \nColor: "+color+"\nFUEL CHOICE: "+fuel_choice);
    }

    public void accessories()
    {
        System.out.println("\nACCESSORIES: \nAirbags: YES\nParking Camera: NO\nPower Windows: YES\nArm Rest: YES\nButton Start: YES\n");
        System.out.println("--------------------------------------------------------------");
    }
}

class sedan extends CarFactory 
{
	public void details(String Color, String fuel_choice)
	{
		System.out.println("--------------------------------------------------------------");
		System.out.println("CAR DETAILS: \nName: HONDA CITY(Sedan)\nHorsepower: 100 \nColor: "+color+"\nFUEL CHOICE: "+fuel_choice);
	}

	public void accessories()
	{
		System.out.println("\nACCESSORIES: \nAirbags: YES\nParking Camera: YES\nPower Windows: YES\nArm Rest: YES\nButton Start: YES\n");
		System.out.println("--------------------------------------------------------------");
	}
}

class SUV extends CarFactory
{
	public void details(String Color, String fuel_choice)
	{
		System.out.println("--------------------------------------------------------------");
		System.out.println("CAR DETAILS: \nName: INNOVA(SUV)\nHorsepower: 200 \nColor of car is: "+color+"\nFUEL CHOICE: "+fuel_choice);
	}

	public void accessories()
	{
		System.out.println("\nACCESSORIES: \nAirbags : YES\nParking Camera: NO\nPower Windows: YES\nArm Rest: YES\nButton Start: NO\n");
		System.out.println("--------------------------------------------------------------");
	}
}

public class car_production
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        CarFactory car; //object

        while(true){
            System.out.println("Enter type of car you want: \n1.HATCHBACK \n2.SEDAN\n3.SUV\n4.Exit");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    car = new hatchback();
                    car.input();
                    car.car_details_display(car);
                    break;
		case 2:
			car = new sedan();
			car.input();
			car.car_details_display(car);
			break;
		case 3:
			car = new SUV();
			car.input();
			car.car_details_display(car);
			break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}
/*
OUTPUT:
Enter type of car you want: 
1.HATCHBACK 
2.SEDAN
3.SUV
4.Exit
1
Enter your colour choice: YELLOW
Enter your Fuel choice (PETROL/DIESEL): PETROL
--------------------------------------------------------------
CAR DETAILS: 
Name: XUV 300(hatchback)
Horsepower: 150 
Color: YELLOW
FUEL CHOICE: PETROL

ACCESSORIES: 
Airbags: YES
Parking Camera: NO
Power Windows: YES
Arm Rest: YES
Button Start: YES

--------------------------------------------------------------
Enter type of car you want: 
1.HATCHBACK 
2.SEDAN
3.SUV
4.Exit
2
Enter your colour choice: black
Enter your Fuel choice (PETROL/DIESEL): diesel
--------------------------------------------------------------
CAR DETAILS: 
Name: HONDA CITY(Sedan)
Horsepower: 100 
Color: black
FUEL CHOICE: diesel

ACCESSORIES: 
Airbags: YES
Parking Camera: YES
Power Windows: YES
Arm Rest: YES
Button Start: YES

--------------------------------------------------------------
Enter type of car you want: 
1.HATCHBACK 
2.SEDAN
3.SUV
4.Exit
3
Enter your colour choice: yellow
Enter your Fuel choice (PETROL/DIESEL): petrol
--------------------------------------------------------------
CAR DETAILS: 
Name: INNOVA(SUV)
Horsepower: 200 
Color of car is: yellow
FUEL CHOICE: petrol

ACCESSORIES: 
Airbags : YES
Parking Camera: NO
Power Windows: YES
Arm Rest: YES
Button Start: NO

--------------------------------------------------------------
Enter type of car you want: 
1.HATCHBACK 
2.SEDAN
3.SUV
4.Exit
4

*/
