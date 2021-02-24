package native_jdbc_programing2.dao;

import java.util.List;

import native_jdbc_programing2.dto.Department;

public interface DepartmentDao {
	List<Department> selectByAll(Department department);
	
	Department selectByNo(Department department);
	int insert(Department department);
	int update(Department department);
	int delete(Department department);
	
	
}
