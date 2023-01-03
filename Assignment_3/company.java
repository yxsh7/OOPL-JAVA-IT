/*
SI32 Yash Kamthe
Design and develop inheritance for a given case study, identify objects and relationships 
and implement inheritance wherever applicable. Employee class has Emp_name, Emp_id, 
Address, Mail_id, and Mobile_no as members. Inherit the classes: Programmer, Team Lead, 
Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as 
the member of all the inherited classes . with 97% of BP as DA, 10 % of BP as HRA, 12% of 
BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their 
gross and net salary 
GITHUB: https://github.com/yxsh7
*/   
import java.util.*;

class Employee 
{
    Scanner sc = new Scanner(System.in);
    String employee_name;
    String addrees;
    String mail_id;
    long mobile_number;
    int employee_id;
    double basic_pay, net_salary, gross_salary, hra, da, pf, staff_club_fund;
    //

    Employee()
    {
        //
    }

    void input()
    {
        System.out.print("Name of Employee: ");
        employee_name=sc.nextLine();
        System.out.print("Address of Employee: ");
        addrees=sc.nextLine();
        System.out.print("Email of Employee: ");
        mail_id=sc.nextLine();
        System.out.print("Mobile Number of Employee:");
        mobile_number=sc.nextLong();
        System.out.print("Employee ID: ");
        employee_id=sc.nextInt();
    }

    void salary_calculation()
    {
        da = basic_pay * .97;
        hra = basic_pay * .10;
        pf = basic_pay * .12;
        staff_club_fund = basic_pay * 0.001;
        gross_salary = basic_pay + hra;
        net_salary = gross_salary - pf - staff_club_fund;
    }

    void display_employee_salary_slip()
    {
        System.out.println("BASIC PAY\tHRA\tPF\tGROSS SALARY\tNET SALARY\n");
        System.out.println(basic_pay+"\t"+hra+"\t"+pf+"\t"+gross_salary+"\t"+net_salary+"\n");
    }

    void display_employee_info()
    {
        System.out.println("EMPLOYEE NAME \tID\tADDRESS\tMOBILE\tEMAIL");
        System.out.println(employee_name+"\t\t"+employee_id+"\t"+addrees+"\t"+mobile_number+"\t"+mail_id+"\n");    
    }

}

class Programmer extends Employee
{
    void programmer_salary()
    {
        input();
        System.out.println("Enter Basic Pay of Programmer: ");
        basic_pay=sc.nextDouble();
    }
}

class TeamLead extends Employee
{
    void TeamLead_salary()
    {
        input();
        System.out.println("Enter Basic Pay of TeamLead: ");
        basic_pay=sc.nextDouble();
    }
}

class AssistantProjectManager extends Employee
{
    void AssistantProjectManager_salary()
    {
        input();
        System.out.println("Enter Basic Pay of Assistant Project Manager: ");
        basic_pay=sc.nextDouble();
    }
}

class ProjectManager extends Employee
{
    void ProjectManager_salary()
    {
        input();
        System.out.println("Enter Basic Pay of Project Manager: ");
        basic_pay=sc.nextDouble();
    }
}

public class company
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //creating arrays for storing data
        Programmer p[] = new Programmer[3];
        TeamLead t[] = new TeamLead[3];
        AssistantProjectManager a[] = new AssistantProjectManager[2];
        ProjectManager m[] = new ProjectManager[2];

        while(true)
        {
            System.out.println(" MAIN  MENU  \n\n1.PROGRAMMER \n2.TEAM LEAD \n3.ASSISTANT PROJECT MANAGER \n4.PROJECT MANAGER \n5.EXIT");
            int k=sc.nextInt();
            switch(k)
            {
            case 1:

                    System.out.print("\tPROGRAMMER  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM PROGRAMMER \n\tChoice::");
                    int o=sc.nextInt();
                    switch(o)
                    {
                        case 1:
                        for (int i=0;i<3;i++)
                        {
                            p[i]=new Programmer();
                            p[i].programmer_salary();
                            p[i].salary_calculation();
                        }
                        case 2:
                        for (int i=0;i<3;i++)
                        {
                            p[i].display_employee_info();
			                p[i].display_employee_salary_slip();
                        }
                        case 3:
                        break;
                    }
            break;    
            case 2:
		        System.out.print("\tTEAMLEAD  MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM TEAMLEAD SECTION  \n\tChoice::");
		        int n=sc.nextInt();
		        switch(n)
		        {
			        case 1:
			        for (int i=0;i<3;i++) 
			        {
				        t[i]=new TeamLead();
				        t[i].TeamLead_salary();
				        t[i].salary_calculation();				
			        }
			        case 2:
			        for (int i=0;i<3;i++) 
			        {
				        t[i].display_employee_info();
				        t[i].display_employee_salary_slip();
			        }
			        case 3:
			        break;
		        }
            break;
            case 3:
                System.out.print("\tASSISTANT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  ASSISTANT MANAGER \n\tChoice::");
                int x=sc.nextInt();
                switch(x)
                {
                    case 1:
			        for (int i=0;i<2;i++) 
			        {
				        a[i]=new AssistantProjectManager();
				        a[i].AssistantProjectManager_salary();
				        a[i].salary_calculation();				
			        }
			        case 2:
			        for (int i=0;i<2;i++) 
			        {
				        a[i].display_employee_info();
				        a[i].display_employee_salary_slip();
			        }
			        case 3:
			        break;
                }
            break;
            case 4:
                System.out.print("\tPROJECT MANAGER MENU .....\n\t1. INPUT \n\t2. DISPLAY  \n\t3. EXIT FROM  PROJECT  MANAGER  SECTION \n\tChoice::");
                int v=sc.nextInt();
                switch(v)
                {
                    case 1:
			        for (int i=0;i<2;i++) 
			        {
				        m[i]=new ProjectManager();
				        m[i].ProjectManager_salary();
				        m[i].salary_calculation();				
			        }
			        case 2:
			        for (int i=0;i<2;i++) 
			        {
				        m[i].display_employee_info();
				        m[i].display_employee_salary_slip();
			        }
			        case 3:
			        break;
                }
            case 5:
            System.exit(0);
            break;
            }
        }
    }
}
/*
OUTPUT:
 MAIN  MENU  

1.PROGRAMMER 
2.TEAM LEAD 
3.ASSISTANT PROJECT MANAGER 
4.PROJECT MANAGER 
5.EXIT
1
        PROGRAMMER  MENU .....
        1. INPUT
        2. DISPLAY
        3. EXIT FROM PROGRAMMER
        Choice::1
Name of Employee: yxsh_xd
Address of Employee: abc
Email of Employee: yashkamthe03@yahoo.com
Mobile Number of Employee:9999999999
Employee ID: 1
Enter Basic Pay of Programmer: 
500000 
Name of Employee: xyzz
Address of Employee: abcc
Email of Employee: something@gmail.com
Mobile Number of Employee:99999999
Employee ID: 2
Enter Basic Pay of Programmer: 
40000
Name of Employee: abcc
Address of Employee: ggg
Email of Employee: something@gmail.com
Mobile Number of Employee:9999999
Employee ID: 3
Enter Basic Pay of Programmer: 
300000
EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
yxsh_xd             1       abc     9999999999      yashkamthe03@gmail.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

500000.0        50000.0 60000.0 550000.0        489500.0

EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
xyzz            2       abcc    99999999        something@gmail.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

40000.0 4000.0  4800.0  44000.0 39160.0

EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
abcc            3       ggg     9999999 something@gmail.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

300000.0        30000.0 36000.0 330000.0        293700.0

 MAIN  MENU

1.PROGRAMMER
2.TEAM LEAD
3.ASSISTANT PROJECT MANAGER
4.PROJECT MANAGER
5.EXIT
1
        PROGRAMMER  MENU .....
        1. INPUT
        2. DISPLAY
        3. EXIT FROM PROGRAMMER
        Choice::2
EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
xyz             1       abc     9999999999      abc@yahoo.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

500000.0        50000.0 60000.0 550000.0        489500.0

EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
xyzz            2       abcc    99999999        something@gmail.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

40000.0 4000.0  4800.0  44000.0 39160.0

EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
abcc            3       ggg     9999999 something@gmail.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

300000.0        30000.0 36000.0 330000.0        293700.0

 MAIN  MENU

1.PROGRAMMER
2.TEAM LEAD
3.ASSISTANT PROJECT MANAGER
4.PROJECT MANAGER
5.EXIT
4
        PROJECT MANAGER MENU .....
        1. INPUT
        2. DISPLAY
        3. EXIT FROM  PROJECT  MANAGER  SECTION
        Choice::1
Name of Employee: xyz
Address of Employee: abc
Email of Employee: something@gmail.com
Mobile Number of Employee:0000000
Employee ID: 6
Enter Basic Pay of Project Manager: 
1000000
Name of Employee: ggg
Address of Employee: xyz
Email of Employee: something@gmail.com
Mobile Number of Employee:99999999
Employee ID: 8
Enter Basic Pay of Project Manager: 
6000000
EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
xyz             6       abc     0       something@gmail.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

1000000.0       100000.0        120000.0        1100000.0       979000.0

EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
ggg             8       xyz     99999999        something@gmail.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

6000000.0       600000.0        720000.0        6600000.0       5874000.0

 MAIN  MENU

1.PROGRAMMER
2.TEAM LEAD
3.ASSISTANT PROJECT MANAGER
4.PROJECT MANAGER
5.EXIT
4
        PROJECT MANAGER MENU .....
        1. INPUT
        2. DISPLAY
        3. EXIT FROM  PROJECT  MANAGER  SECTION
        Choice::2
EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
xyz             6       abc     0       something@gmail.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

1000000.0       100000.0        120000.0        1100000.0       979000.0

EMPLOYEE NAME   ID      ADDRESS MOBILE  EMAIL
ggg             8       xyz     99999999        something@gmail.com

BASIC PAY       HRA     PF      GROSS SALARY    NET SALARY

6000000.0       600000.0        720000.0        6600000.0       5874000.0

 MAIN  MENU

2.TEAM LEAD
3.ASSISTANT PROJECT MANAGER
4.PROJECT MANAGER
5.EXIT
5
*/
