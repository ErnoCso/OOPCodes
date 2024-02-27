
public class Book {
	private String author;
	private String title;
	private String publisher;
	private String copyrightDate;

	public Book(String title, String author, String publisher, String copyrightDate) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copyrightDate = copyrightDate;
	}
	public String getTitle() { 
		return title;
	}
	public String getAuthor() { 
		return author;
	}
	public String getPublisher() { 
		return publisher;
	}
	public String getCopyrigthDate() { 
		return copyrightDate;
	}
	public void setBook(String title, String author, String publisher, String copyrightDate) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copyrightDate = copyrightDate;
	}
	public String toString() {
		return "\n\nTitle: \t\t" + title + 
				"\nAuthor: \t" + author + 
				"\nPublisher: \t" + publisher + 
				"\nCopyright Date: " + copyrightDate;
	}

}
