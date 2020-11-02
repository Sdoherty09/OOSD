package dsaProject;
import java.util.Scanner;
public class CarWashDriver {
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	CarWash[] waitingList=new CarWash[0];
	CarWash[] tempList;
	CarWash currentCar;
	int menu;
	String name;
	String program;
	int increment=0;
	int add=0;
	do
	{
		System.out.println("1: Add a car\n2: How many cars\n3: List all cars\n4: Wash next car\n5: Next car to be washed\n6: Remove all cars");
		menu=input.nextInt();
		switch(menu)
		{
			case 1:
				input.nextLine();
				System.out.print("Add name: ");
				name=input.nextLine();
				System.out.print("Add program: ");
				program=input.nextLine();
				currentCar=new CarWash(name,program);
				tempList=new CarWash[waitingList.length+1]; //Temporary array with an incremented length
				for (int index=0;index<waitingList.length;index++)
				{
					tempList[index]=waitingList[index];
				}
				tempList[waitingList.length]=currentCar; //Final position contains inputted entries
				waitingList=tempList; //Update main array
			break;
			case 2:
				System.out.println("Amount of cars: "+waitingList.length);
			break;
			case 3:
				for(CarWash c:waitingList)
				{
					System.out.println(c.toString());
				}
			break;
			case 4:
				name=waitingList[0].getName();
				tempList=new CarWash[waitingList.length-1]; //Temporary array with a decremented length
				for(int index=0;index<waitingList.length-1;index++)
				{
					tempList[index]=waitingList[index+1]; //Left-shift array
				}
				waitingList=tempList; //Update main array
				System.out.println(name+"'s car washed.");
			break;
			case 5:
				System.out.println("Next car: "+waitingList[0]);
			break;
			case 6:
				input.nextLine();
				System.out.print("Select program: ");
				program=input.nextLine();
				for (int index=0;index<waitingList.length;index++) //Initial loop to count how many items to remove
				{
					if(waitingList[index].getProgram().equals(program))
					{
						increment++;						
					}
				}
				tempList=new CarWash[waitingList.length-increment]; //Expected length of updated array
				for (int index=0;index<waitingList.length;index++)
				{
					if(!(waitingList[index].getProgram().equals(program))) //Ignore entries with selected program and add the rest
					{
						tempList[add]=waitingList[index]; 
						add++;
					}
				}
				waitingList=tempList;
				System.out.println("Cars removed: "+increment);
			break;
			default:
				System.out.println("Invalid selection");
			break;
		}
	}
	while(menu>0);
}
}
