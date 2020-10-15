package car;
import java.util.*;
public class Garage {

	public static void main(String[] args) {
		//1. List cars
		//2. Enter car for sale
		//3. List all cars sold.
		//4. Exit
		int input=0;
		int noOfCars=0;
		Car[] cars=new Car[10];
		String make;
		String model;
		double engineSize;
		double price;
		Scanner in=new Scanner(System.in);
		while (input!=4)
		{
			System.out.println("Enter menu input:\n1. List all cars\n2. Enter car for sale\n3. List all cars sold\n4. Exit");			
			input=in.nextInt();
			in.nextLine();
			switch(input)
			{
				case 1:
					for(Car c: cars)
					{
						if(c!=null) System.out.println(c.toString());
					}
				break;
				case 2:
					if(noOfCars<9)
					{
						System.out.print("Enter make: ");
						make=in.nextLine();
						System.out.print("Enter model: ");
						model=in.nextLine();
						System.out.print("Enter engine size: ");
						engineSize=in.nextDouble();
						System.out.print("Enter price: ");
						price=in.nextDouble();	
						cars[noOfCars]= new Car(make,model,engineSize,price);
						noOfCars++;
					}
					else
					{
						System.out.println("Too many cars");
					}
				break;
				case 3:
					for(Car c: cars)
					{
						if(c!=null&&c.isSold()) System.out.println(c.toString());
					}
				break;
				case 4:
				System.exit(0);	
				break;
			}
		}
		
	}

}
