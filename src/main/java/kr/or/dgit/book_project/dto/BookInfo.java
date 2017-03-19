package kr.or.dgit.book_project.dto;

public class BookInfo {
	private String bCode;
	private String bName;
	private String author;
	private String publisher;
	private int price;
	
	public BookInfo() {}

	public String getbCode() {
		return bCode;
	}

	public void setbCode(String bCode) {
		this.bCode = bCode;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return String.format("BookInfo [%s, %s, %s, %s, %s]", bCode, bName, author,
				publisher, price);
	}

	public BookInfo(String bCode, String bName, String author, String publisher, int price) {
		super();
		this.bCode = bCode;
		this.bName = bName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}	
	
}
