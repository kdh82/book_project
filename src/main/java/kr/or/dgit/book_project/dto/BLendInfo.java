package kr.or.dgit.book_project.dto;

public class BLendInfo {
	private String bCode;
	private boolean isPosbl;
	private int bLendCount;
	
	public BLendInfo() {}

	public String getbCode() {
		return bCode;
	}

	public void setbCode(String bCode) {
		this.bCode = bCode;
	}

	public boolean isPosbl() {
		return isPosbl;
	}

	public void setPosbl(boolean isPosbl) {
		this.isPosbl = isPosbl;
	}

	public int getbLendCount() {
		return bLendCount;
	}

	public void setbLendCount(int bLendCount) {
		this.bLendCount = bLendCount;
	}

	@Override
	public String toString() {
		return String.format("BLendInfo [%s, %s, %s]", bCode, isPosbl, bLendCount);
	}

	public BLendInfo(String bCode, boolean isPosbl, int bLendCount) {
		super();
		this.bCode = bCode;
		this.isPosbl = isPosbl;
		this.bLendCount = bLendCount;
	}
	
	
}