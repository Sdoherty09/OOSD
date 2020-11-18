package lab4;

import java.util.Scanner;

public class MyHr {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String fName;
		String lName;
		String empType;
		String comCarType;
		int choice=0;
		Employee[] employees=new Employee[5];
		Office[] offices=new Office[3];
		int empCount=0;
		for(int index=0;index<=2;index++)
		{
			offices[index]=new Office();
		}
		while(choice!=4)
		{
			System.out.println("Select option:\n1. List all offices\n2. Create new employee record\n3. List all employees\n4. Exit");
			choice=in.nextInt();
			switch (choice)
			{
			case 1:
				for(Office o:offices)
				{
					System.out.println(o.toString());
				}
			break;
			case 2:
				in.nextLine();
				System.out.print("Enter first name:" );
				fName=in.nextLine();
				System.out.print("Enter last name:" );
				lName=in.nextLine();
				System.out.print("Enter employee type:" );
				empType=in.nextLine();
				if(empType.equalsIgnoreCase("manager"))
				{
					System.out.print("Enter car type: ");
					comCarType=in.nextLine();
					employees[empCount]=new Employee(fName,lName,empType,comCarType);
				}
				else
				{
					employees[empCount]=new Employee(fName,lName,empType);
				}
			break;
			case 3:
				for(Employee emp:employees)
				{
					if(emp!=null) System.out.println(emp.toString());
				}
			break;
			case 4:
				System.out.println("Bye");
			break;
			default:
				System.out.println("Invalid choice");
			break;
			}
		}
		in.close();
	}

}
