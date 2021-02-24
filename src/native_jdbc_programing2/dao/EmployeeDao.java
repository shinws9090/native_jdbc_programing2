package native_jdbc_programing2.dao;

import java.util.List;

import native_jdbc_programing2.dto.Employee;

public interface EmployeeDao {
	List<Employee> selectByAll();
	List<Employee> selectByJoinAll();
	
	int insert();
	int update();
	int delete();
	
	
}
