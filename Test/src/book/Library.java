package book;
import java.util.*;
public class Library {
public static void main(String[] args)
{
	book[] books=new book[3];
	
	for (int i=0;i<=2;i++)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter title:");
		String title=input.nextLine();
		System.out.println("Enter author:");
		String author=input.nextLine();
		System.out.println("Enter no. of pages:");
		int noOfPages=input.nextInt();
		
		book b=new book(title, author, noOfPages);
		books[i]=b;
	}
	for(book b:books)
	{
		if(b!=null)System.out.println(b.toString());
	}
	books[1].borrow();
	for(book b:books)
	{
		if(b!=null)System.out.println(b.toString());
	}
	books[1].BookReturn();
	for(book b:books)
	{
		if(b!=null)System.out.println(b.toString());
	}
}
}
