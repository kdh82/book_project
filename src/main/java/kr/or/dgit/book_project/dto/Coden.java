package kr.or.dgit.book_project.dto;

public class Coden {
	private String cCode;
	private String cName;
	
	public Coden() {}

	public String getcCode() {
		return cCode;
	}

	public void setcCode(String cCode) {
		this.cCode = cCode;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return String.format("Coden [%s, %s]", cCode, cName);
	}

	public Coden(String cCode, String cName) {
		super();
		this.cCode = cCode;
		this.cName = cName;
	}
	
	
}
