package Book;

public class Book {

	private String title;
	private String author;
	private int noOfPages;
	private int edition;
	private int chapters;
	private char status;
	public Book()
	{
		
	}
	public Book(String title, String author, int noOfPages, int edition, int chapters, char status) {
		setTitle(title);
		setAuthor(author);
		setNoOfPages(noOfPages);
		setEdition(edition);
		setChapters(chapters);
		setStatus('A');
	}
	public Book(String title, String author, int noOfPages, int edition,char status) {
		setTitle(title);
		setAuthor(author);
		setNoOfPages(noOfPages);
		setEdition(edition);
		setStatus('A');
	}
	public Book(String title, String author, int noOfPages, int edition,char status) {
		setTitle(title);
		setAuthor(author);
		setNoOfPages(noOfPages);
		setEdition(edition);
		setStatus('A');
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getChapters() {
		return chapters;
	}
	public void setChapters(int chapters) {
		if(chapters>0&&chapters<10)
		{
			this.chapters = chapters;
		}
		else
		{
			System.out.println("Chapters not in range.");
		}
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public void borrow()
	{
		setStatus('B');
	}
	public void BookReturn()
	{
		setStatus('A');
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", noOfPages=" + noOfPages + ", edition=" + edition
				+ ", chapters=" + chapters + ", status=" + status + "]";
	}
	
}
