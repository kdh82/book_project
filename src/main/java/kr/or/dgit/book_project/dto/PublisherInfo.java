package kr.or.dgit.book_project.dto;

public class PublisherInfo {
	private String publisher;
	private String pName;
	private String pTel;
	
	public PublisherInfo() {}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpTel() {
		return pTel;
	}

	public void setpTel(String pTel) {
		this.pTel = pTel;
	}

	@Override
	public String toString() {
		return String.format("PublisherInfo [%s, %s, %s]", publisher, pName, pTel);
	}

	public PublisherInfo(String publisher, String pName, String pTel) {
		super();
		this.publisher = publisher;
		this.pName = pName;
		this.pTel = pTel;
	}
	
	
}
