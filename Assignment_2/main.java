/*
SI32 Yash Kamthe
Identify commonalities and differences between Publication, Book and Magazine classes. 
Title, Price, Copies are common instance variables and saleCopy is common method.
The differences are, Bookclass has author and orderCopies().
Magazine Class has data members as orderQty, Current issue and method receiveNewissue().Write a program 
to find how many copies of the given books are ordered and display total sale of publication.
GITHUB: https://github.com/yxsh7
*/

import java.util.*;

class publication {

	String title;
	int price;
	int copies;
	int total;
	
	Scanner sc=new Scanner(System.in);
	
	public void set_title(String title) {			
		this.title=title;
	}

	public void set_copies(int copies) {			
		this.copies=copies;
	}

	public String get_title() {			
		return title;
	}
	public int get_Total() {	
		return total;
	}
	
	public int get_Copies() {			
		return copies;
	}
	
	public int get_price() {
		return price;
	}

	void read_publication() {				
				
		System.out.print("title: ");
		title=sc.nextLine();
		System.out.print("price:  ");
		price=sc.nextInt();
		System.out.print("copies: ");
		copies=sc.nextInt();
	}
	
	void display() {					
		System.out.print(title+" "+price+" "+copies);
	}

    void sale_copy(int number) {
		if (number <= copies)		
		//if less than available
		{
			copies=copies-number;
			total=total + number*price;
			System.out.println("\tYOU PURCHASED  "+number +"  COPIES \n\tYOU HAVE TO PAY :  "+(price*number));
		}
		else	
			System.out.println("     INSUFFICIENT STOCK!!!!!!!!!");
	}
		
}	

class book extends publication {
	String Author;

    void order_copies(int number) {	
    //increase available copies of book by ordering 
		int x = get_Copies()+ number;
		set_copies(get_Copies() + number);	

		System.out.println("\n\tORDER SUCESSFUL....");
		System.out.println("\tCOPIES AVAILABLE : "+ x);
	}

	void display_book(){
		System.out.println("title price copy author");
		display();
		System.out.println(" "+Author);
	}

	void read_book() {			
		read_publication();
		System.out.print("enter Author: ");
		Author=sc.next();
	}

}

class magazine extends publication{
	int order_qty;	
	String issue_date;

	void receive_issue(String new_issue_date) {		
		System.out.println("ENTER NEW COPIES ORDERED: ");
		order_qty=sc.nextInt();
	

	set_copies(order_qty);
		issue_date=new_issue_date;
		System.out.println("\tTHE MAGAZINE "+get_title()+" \n\t WITH ISSUE DATE "+issue_date+"AVAILABLE");	
	}

	void read_mag() {
		read_publication();	
		System.out.print("Enter THe Current Issue Date [dd/mm/yyyy]");
		issue_date=sc.next();
	}
	
	void display_mag() {	 
		System.out.println("title price copy date");
		display();
		System.out.println(" "+issue_date);
	}	
	
}

public class main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	book b=new book();
	magazine m=new magazine();
	
	while(true)
	{
	System.out.println("1.BOOK \t 2.MAGAZINE \t 3.TOTAL SALE AMOUNT \t 4.REVENUE OF PUBLICATION \t 5.EXIT");
	System.out.print("Make your choice: "); 
	int ch; 
        ch = sc.nextInt(); // reading user's choice

	switch(ch)
	{
	case 1:
	System.out.print("BOOK MENU \n");
	System.out.print("1.DISPLAY  2.ENTER BOOK RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER COPIES FOR SHOP    ");
	System.out.print("Make your Choice: ");
	int choice_book;
	choice_book = sc.nextInt();
		switch(choice_book)
		{
		case 1:
		b.display_book();
		break;
		case 2:
		b.read_book();
		break;
        case 3:
		System.out.print("SALE COPIES TO CUSTOMER: ");
		int n1=sc.nextInt();
		b.sale_copy(n1);
		break;
        case 4:
		System.out.print("ORDER COPIES FOR SHOP: ");
		int n2=sc.nextInt();
	    b.order_copies(n2);
		break;           
		}
	break;

	case 2:
	System.out.print("MAGAZINE MENU");
	System.out.print("1.DISPLAY  2.ENTER MAGAZINE RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER NEW COPIES FOR SHOP WITH NEW ISSUE DATE  ");
	int choice_magazine;
	choice_magazine = sc.nextInt();
		switch(choice_magazine)
		{
		case 1:
		m.display_mag();
		break;
		case 2:
		m.read_mag();
		break;	
        case 3:
		System.out.println("SALE COPIES TO CUSTOMER: ");
		int n3=sc.nextInt();
		m.sale_copy(n3);
		break;
        case 4:
		System.out.println("ENTER THE NEW ISSUE DATE [dd/mm/yyyy]: ");
		String date=sc.next();
		m.receive_issue(date);
		break;
		}
	break;

	case 5:
	System.exit(0);

    case 3:
    System.out.println("\n\tTOTAL AMOUNT TO BE PAID BY CUSTOMER (BOOKS + MAGAZINES): "+(b.get_Total()+m.get_Total())+ "  ");
    break;

    case 4:
    System.out.println("\n\tTOTAL REVENUE OF PUBLICATION IS  :  "+ (b.get_Copies()*b.get_price() + m.get_Copies()*m.get_price()));
    break;

	default:
	System.out.println("Invalid choice! Please make a valid choice. \n\n");		
	}
	}
	}
	}

/*
OUTPUT: 
(EVERYTHING TESTED)

yk@yk-zorin-os:~/oop$
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 1
BOOK MENU 
1.DISPLAY  2.ENTER BOOK RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER COPIES FOR SHOP    Make your Choice: 2
title: book_1
price:  10
copies: 100
enter author book: xyz
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 1
BOOK MENU 
1.DISPLAY  2.ENTER BOOK RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER COPIES FOR SHOP    Make your Choice: 1
title price copy author
book_1 10 100 xyz
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 1
BOOK MENU 
1.DISPLAY  2.ENTER BOOK RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER COPIES FOR SHOP    Make your Choice: 3
SALE COPIES TO CUSTOMER: 5
        YOU PURCHASED  5  COPIES 
        YOU HAVE TO PAY :  50
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 1
BOOK MENU 
1.DISPLAY  2.ENTER BOOK RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER COPIES FOR SHOP    Make your Choice: 4
ORDER COPIES FOR SHOP: 50

        ORDER SUCESSFUL....
        COPIES AVAILABLE : 145
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 2
MAGAZINE MENU1.DISPLAY  2.ENTER MAGAZINE RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER NEW COPIES FOR SHOP WITH NEW ISSUE DATE  2
title: magazine_1
price:  20
copies: 200
Enter THe Current Issue Date [dd/mm/yyyy]7/7/2007
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 2
MAGAZINE MENU1.DISPLAY  2.ENTER MAGAZINE RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER NEW COPIES FOR SHOP WITH NEW ISSUE DATE  1
title price copy date
magazine_1 20 200 7/7/2007
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 2
MAGAZINE MENU1.DISPLAY  2.ENTER MAGAZINE RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER NEW COPIES FOR SHOP WITH NEW ISSUE DATE  3
SALE COPIES TO CUSTOMER: 
5
        YOU PURCHASED  5  COPIES 
        YOU HAVE TO PAY :  100
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 2
MAGAZINE MENU1.DISPLAY  2.ENTER MAGAZINE RECORD  3.SALE COPIES TO CUSTOMER  4.ORDER NEW COPIES FOR SHOP WITH NEW ISSUE DATE  4
ENTER THE NEW ISSUE DATE [dd/mm/yyyy]: 
10/7/2022
ENTER NEW COPIES ORDERED: 
50
        THE MAGAZINE magazine_1 
         WITH ISSUE DATE 10/7/2022AVAILABLE
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 3

        TOTAL AMOUNT TO BE PAID BY CUSTOMER (BOOKS + MAGAZINES): 150  
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 4

        TOTAL REVENUE OF PUBLICATION IS  :  2450
1.BOOK   2.MAGAZINE      3.TOTAL SALE AMOUNT     4.REVENUE OF PUBLICATION        5.EXIT
Make your choice: 5
*/
