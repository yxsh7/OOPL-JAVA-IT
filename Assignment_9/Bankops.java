/*
SI32 Yash Kamthe
Using concepts of Object-Oriented programming develop solution for any one
application
1) Banking system having following operations: 1. Create an account 2. Deposit
money 3. Withdraw money 4. Honor daily withdrawal limit 5. Check the balance 6.
Display Account information.
GITHUB:https://github.com/yxsh7
*/
import java.util.*;

class Account_operation
{
	public String name;
	public String type;
	public int age, account_number, account_id = 1000;
	public double balance;
	
	Scanner sc = new Scanner(System.in);

	public void create_account()
	{
		System.out.print("Enter Your Name: ");
		name = sc.nextLine();
		System.out.print("Enter your Account Type: ");
		type = sc.nextLine();
		System.out.print("Enter Your Age: ");
		age = sc.nextInt();
	
		if(age<18)
		{
			do
			{              
			System.out.println("\nMinimum Age is 18. Enter Again: ");      
			age=sc.nextInt();   
			}while(age<18);
		}

		
		System.out.print("Enter Account Balance: ");
		balance = sc.nextDouble();
		if(balance<1000)
		{
			do
			{
			System.out.print("\nMinimum Balance is 1000. Enter Again: ");
			balance = sc.nextInt();
			}while(balance<1000);
		}
		account_id++;
		account_number = account_id;
		System.out.println("\nAccount Created Successfully!\n");

	}

	public void deposit_money()
	{
		double deposit_money=0;
		System.out.print("\nEnter the amount to be deposited: ");
		deposit_money = sc.nextDouble();
		balance = balance + deposit_money;
		System.out.print("\nYour updated balance is: " + balance);
	}

	public void withdraw_money()
	{
		double withdraw_money=0;
		
		do
		{
			System.out.println("\nEnter amount to be withdrawn: ");
			withdraw_money = sc.nextDouble();
		
			if(withdraw_money > balance)
			{
				System.out.println("\nLow account balance, transaction failed. Your current balance is: " + balance);
			}
		}
		while(withdraw_money > balance);
		balance = balance - withdraw_money;
		System.out.print("\nYour updated balance is: " + balance);
	}

	public void current_balance()
	{
		System.out.println("\nYour current account balance is: "+balance);
	}

	public void account_information()
	{
		System.out.print("\nYour Account Information:"+"\nName: "+name+"\nAge: "+age+"\nAccount Type: "+type+"\nAccount Balance: "+balance);
	}


}

class Bankops
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	Account_operation obj = new Account_operation();
	int choice;
	while(true)
		{
		System.out.print("\n\nBANK MENU \n1: Create Account \n2: Withdraw Money \n3: Deposit Money \n4: Display Account Balance\n5: View Account Information \n6: Exit \nMake your Choice:");  
        	choice = sc.nextInt(); // reading user's choice
		switch(choice)
			{
			case 1:
			obj.create_account();
			break;
			case 2:
			obj.withdraw_money();
			break;
			case 3:
			obj.deposit_money();
			break;
			case 4:
			obj.current_balance();
			break;
			case 5:
			obj.account_information();
			break;
			case 6:
			System.exit(0);
			default:
			System.out.println("Invalid choice! Please make a valid choice. \n\n");
			}
		}
	}

}
/*
OUTPUT:
BANK MENU 
1: Create Account 
2: Withdraw Money 
3: Deposit Money 
4: Display Account Balance
5: View Account Information 
6: Exit 
Make your Choice:1
Enter Your Name: yash
Enter your Account Type: savings
Enter Your Age: 8

Minimum Age is 18. Enter Again: 
19
Enter Account Balance: 50

Minimum Balance is 1000. Enter Again: 5000

Account Created Successfully!



BANK MENU 
1: Create Account 
2: Withdraw Money 
3: Deposit Money 
4: Display Account Balance
5: View Account Information 
6: Exit 
Make your Choice:2

Enter amount to be withdrawn: 
100

Your updated balance is: 4900.0

BANK MENU 
1: Create Account 
2: Withdraw Money 
3: Deposit Money 
4: Display Account Balance
5: View Account Information 
6: Exit 
Make your Choice:3

Enter the amount to be deposited: 500

Your updated balance is: 5400.0

BANK MENU 
1: Create Account 
2: Withdraw Money 
3: Deposit Money 
4: Display Account Balance
5: View Account Information 
6: Exit 
Make your Choice:4

Your current account balance is: 5400.0


BANK MENU 
1: Create Account 
2: Withdraw Money 
3: Deposit Money 
4: Display Account Balance
5: View Account Information 
6: Exit 
Make your Choice:5

Your Account Information:
Name: yash
Age: 19
Account Type: savings
Account Balance: 5400.0

BANK MENU 
1: Create Account 
2: Withdraw Money 
3: Deposit Money 
4: Display Account Balance
5: View Account Information 
6: Exit 
Make your Choice:6

*/
