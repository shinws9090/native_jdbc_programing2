package native_jdbc_programing2.dao;

import java.util.List;

import native_jdbc_programing2.dto.Title;

public interface TitleDao {
	
	List<Title> selectByAll();
	
	int insert();
	int update();
	int delete();
	
}
