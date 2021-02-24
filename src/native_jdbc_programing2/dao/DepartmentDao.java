package native_jdbc_programing2.dao;

import java.util.List;

import native_jdbc_programing2.dto.Department;

public interface DepartmentDao {
	List<Department> selectByAll();
	
	Department selectByNo();
	int insert();
	int update();
	int delete();
	
	
}
