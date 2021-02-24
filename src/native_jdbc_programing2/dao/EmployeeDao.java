package native_jdbc_programing2.dao;

import java.util.List;

import native_jdbc_programing2.dto.Employee;

public interface EmployeeDao {
	List<Employee> selectByAll(Employee employee);
	List<Employee> selectByJoinAll(Employee employee);
	
	int insert(Employee employee);
	int update(Employee employee);
	int delete(Employee employee);
	
	
}
