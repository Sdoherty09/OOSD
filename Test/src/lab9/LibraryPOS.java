package lab9;

public class LibraryPOS {

	public static void main(String[] args) {
		Book b=new Book("Pearson","Java Programming",200);
		CD c=new CD("Faithless","faithless 2.0",12);
		LibraryItem[] items = new LibraryItem[2];
		items[0]=b;
		items[1]=c;
		for (LibraryItem l:items) System.out.println(l.toString());
		double totalLoanPrice=0;
		for (LibraryItem x:items) totalLoanPrice+=x.calculatePrice();
		System.out.println("Total Price: "+totalLoanPrice);
	}

}
