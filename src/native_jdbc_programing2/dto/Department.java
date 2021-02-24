package native_jdbc_programing2.dto;

public class Department {
	int deptno;
	String deptname;
	int floor;
	
	public Department(int deptno) {
		this.deptno = deptno;
	}

	public Department(int deptno, String deptname, int floor) {
		this.deptno = deptno;
		this.deptname = deptname;
		this.floor = floor;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("Department [%s, %s, %s]", deptno, deptname, floor);
	}
	
	
	
}
