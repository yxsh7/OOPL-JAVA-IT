/*
SI32 Yash Kamthe
Implement a program for maintaining a database of student records using Files.
Student has Student_id, name, Roll_no, Class, marks and address. Display the data for
few students.
1. Create Database 3. Delete Records
2. Display Database 4. Update Record
5. Search Record
GITHUB:https://github.com/yxsh7
*/
import java.util.*;
import java.io.*;

class Records 
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void addRecords() throws IOException
	{
	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt",true)));
	String student_name, roll_no, student_Class, address, marks;
	int student_id;
 	
	System.out.print("\nEnter name: ");
  	student_name = br.readLine();

	System.out.print("Student_id: ");
  	student_id = Integer.parseInt(br.readLine());

	System.out.print("Roll Number: ");
  	roll_no = br.readLine();

	System.out.print("Class: ");
  	student_Class = br.readLine();

	System.out.print("Address: ");
  	address = br.readLine();

	System.out.print("Marks: ");
  	marks = br.readLine();
  	
  	pw.println(student_name+" "+student_id+" "+roll_no+" "+student_Class+" "+address+" "+marks);
	System.out.print("\nRecords added successfully! \n");
	pw.close();
	}

	public void readRecords() throws IOException  
	{
		BufferedReader file = new BufferedReader(new FileReader("studentRecords.txt")); 
		String name;
		while((name = file.readLine()) != null)  
		{
			System.out.println(name); 
			System.out.println("");   
		}   
		file.close(); 
	}
	
	public void delete() throws IOException
	{
	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt")));
	pw.close();
	System.out.println("\n Records cleared Sucessfully \n");
	}
	
	public void searchRecords() throws IOException
	{
	BufferedReader file = new BufferedReader(new   FileReader("studentRecords.txt")); 
	String name; 
	int flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter ID of student: "); 
	String searchname=sc.next();  
	while((name = file.readLine()) != null)  
		{   
		String[] line = name.split(" "); 
		if(searchname.equalsIgnoreCase(line[1]))
			{   
			System.out.println("Record found");    
			System.out.println(name);    
			System.out.println("");  
			flag=1;    
			break;   
			}  
		} 
		if(flag==0)   
		System.out.println("Record not found");
		file.close(); 		
	} 
	
	public void updateRecords() throws IOException 
	{ 
	BufferedReader file1 = new BufferedReader(new FileReader("studentRecords.txt"));  
	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("new.txt",true))); 
	String name;
	int flag=0;  
	Scanner sc=new Scanner(System.in); 
	System.out.print("Enter the name of the student you want to update: "); 
	String searchname=sc.next();     
	while((name = file1.readLine()) != null) 
	 	{  
		String[] line = name.split(" ");
  		if(!searchname.equalsIgnoreCase(line[0]))
  			{ 
			pw.println(name); 
			flag=0;   
			} 
		else   
			{    
			System.out.println("Record found");  
			System.out.print("Enter updated marks: ");     
			String up_mark=sc.next();    
			pw.println(line[0]+" "+line[1]+" "+line[2]+" "+line[3]+" "+line[4]+" "+up_mark);   
			flag=1; 
			}     
		} 
		file1.close(); 
		pw.close();   
		File delName =  new File("studentRecords.txt");
		File oldName =  new File("new.txt");   
		File newName =   new File("studentRecords.txt");  
		if(delName.delete())         
		System.out.println("record updated successfully"); 
		else     
		System.out.println("Error"); 
				
		if (oldName.renameTo(newName))          
		System.out.println("//////////////////////////////");  //file renamed sucessfully.
		else             
		System.out.println("Error");	
		} 

}
public class Main
{
	public static void main(String args[]) throws IOException
	{
	Records r = new Records();
	Scanner sc =new Scanner(System.in);

	while(true) 
		{
		System.out.print("\nSTUDENT RECORDS DATABASE\n1. Add Records\n2. Display Records \n3. Delete Records \n4. Search Records \n5. Update Records \n6. Exit(No Data Loss) \nEnter your choice : ");
		int choice = sc.nextInt();
		
		switch(choice)  
			{   
			case 1: 
			r.addRecords();
			break;
			case 2:
			r.readRecords();
			break;
			case 3:
			r.delete();
			break;
			case 4:
			r.searchRecords();
			break;
			case 5:
			r.updateRecords();
			break;
			case 6:
			System.exit(0);
			default:  
			System.out.println("\nInvalid Choice !");
			break; 
			}
		}
	}
}
/*
OUTPUT:
STUDENT RECORDS DATABASE
1. Add Records
2. Display Records 
3. Delete Records 
4. Search Records 
5. Update Records 
6. Exit(No Data Loss) 
Enter your choice : 1

Enter name: yash
Student_id: 1
Roll Number: 20
Class: 10
Address: xyz
Marks: 95

Records added successfully! 

STUDENT RECORDS DATABASE
1. Add Records
2. Display Records 
3. Delete Records 
4. Search Records 
5. Update Records 
6. Exit(No Data Loss) 
Enter your choice : 1

Enter name: varad
Student_id: 10
Roll Number: 45
Class: 10
Address: abc
Marks: 98

Records added successfully! 

STUDENT RECORDS DATABASE
1. Add Records
2. Display Records 
3. Delete Records 
4. Search Records 
5. Update Records 
6. Exit(No Data Loss) 
Enter your choice : 2
yash 1 20 10 xyz 95

varad 10 45 10 abc 98


STUDENT RECORDS DATABASE
1. Add Records
2. Display Records 
3. Delete Records 
4. Search Records 
5. Update Records 
6. Exit(No Data Loss) 
Enter your choice : 4
Enter ID of student: 10
Record found
varad 10 45 10 abc 98


STUDENT RECORDS DATABASE
1. Add Records
2. Display Records 
3. Delete Records 
4. Search Records 
5. Update Records 
6. Exit(No Data Loss) 
Enter your choice : 5
Enter the name of the student you want to update: yash
Record found
Enter updated marks: 99
record updated successfully
//////////////////////////////

STUDENT RECORDS DATABASE
1. Add Records
2. Display Records 
3. Delete Records 
4. Search Records 
5. Update Records 
6. Exit(No Data Loss) 
Enter your choice : 3

 Records cleared Sucessfully 


STUDENT RECORDS DATABASE
1. Add Records
2. Display Records 
3. Delete Records 
4. Search Records 
5. Update Records 
6. Exit(No Data Loss) 
Enter your choice : 2

STUDENT RECORDS DATABASE
1. Add Records
2. Display Records 
3. Delete Records 
4. Search Records 
5. Update Records 
6. Exit(No Data Loss) 
Enter your choice : 6

*/
