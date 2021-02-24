package native_jdbc_programing2.Impl;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import native_jdbc_programing2.dao.DepartmentDao;
import native_jdbc_programing2.dto.Department;
import native_jdbc_programing2.util.JdbcUtil;

public class DepartmentDaoImpl implements DepartmentDao {
	private static final DepartmentDaoImpl instance = new DepartmentDaoImpl();
	
	public DepartmentDaoImpl getinstance() {
		return instance;
	}
	
	private DepartmentDaoImpl() {
	}

	private Department getDepartment(ResultSet rs) throws SQLException {
		int deptno = rs.getInt("deptno");
		String deptname = rs.getString("deptname");
		int floor = rs.getInt("floor");
		
		return new Department(deptno, deptname, floor);
	}

	@Override
	public List<Department> selectByAll(Department department) {
		String sql = "";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<Department> list = new ArrayList<Department>();
				do {
					list.add(getDepartment(rs));
				} while (rs.next());

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public Department selectByNo(Department department) {
		String sql = "";
		try(Connection con = JdbcUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1,department.getDeptno());
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(Department department) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Department department) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Department department) {
		// TODO Auto-generated method stub
		return 0;
	}

}
