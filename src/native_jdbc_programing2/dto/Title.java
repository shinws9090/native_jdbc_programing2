package native_jdbc_programing2.dto;

public class Title {
	int tno;
	String tname;

	public Title(int tno) {
		this.tno = tno;
	}

	public Title(int tno, String tname) {
		this.tno = tno;
		this.tname = tname;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return String.format("Title [tno=%s, tname=%s]", tno, tname);
	}

}
