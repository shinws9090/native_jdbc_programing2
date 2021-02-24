package native_jdbc_programing2.dao;

import java.util.List;

import native_jdbc_programing2.dto.Title;

public interface TitleDao {
	
	List<Title> selectByAll(Title title);
	
	int insert(Title title);
	int update(Title title);
	int delete(Title title);
	
}
