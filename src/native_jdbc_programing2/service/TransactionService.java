package native_jdbc_programing2.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import native_jdbc_programing2.dto.Department;
import native_jdbc_programing2.dto.Title;
import native_jdbc_programing2.util.JdbcUtil;

public class TransactionService {

	public String transAddTitleAddDepartment(Title title, Department dept) {
		String titleSql = "insert into title values (?,?)";
		String deptSql = "insert into department values (?,?,?)";

		Connection con = null;
		try {
			con = JdbcUtil.getConnection();
			con.setAutoCommit(false);

			try (PreparedStatement tPstmt = con.prepareStatement(titleSql)) {
				tPstmt.setInt(1, title.getTno());
				tPstmt.setString(2, title.getTname());
				tPstmt.executeUpdate();
			}

			try (PreparedStatement dPstmt = con.prepareStatement(deptSql)) {
				dPstmt.setInt(1, dept.getDeptNo());
				dPstmt.setString(2, dept.getDeptName());
				dPstmt.setInt(3, dept.getFloor());
				dPstmt.executeUpdate();
			}

			con.commit();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			try {
				con.rollback();
				con.setAutoCommit(true);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		return null;
	}
}
