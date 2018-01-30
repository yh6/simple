package si.mp.le.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import si.mp.le.common.DBCon;
import si.mp.le.vo.User;

@Repository
public class UserDAO {

	@Autowired
	private BasicDataSource bc;
	@Autowired
	private DBCon dbc;
	@Autowired
	private User user;

	public List<User> selectUserList() {
		List<User> list = new ArrayList<User>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = bc.getConnection(); 
			String sql = "select * from user_info where 1=1";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setAddress(rs.getString("address"));
				user.setUiAge(rs.getInt("uiage"));
				user.setUiId(rs.getString("uiid"));
				user.setUiName(rs.getString("uiname"));
				user.setUiNo(rs.getInt("uino"));
				user.setUiPwd(rs.getString("uipwd"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int inserUser() {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = bc.getConnection(); 
			String sql = "insert into user_info(uiname,uino,uiage,uiid,uipwd,address)\r\n"
					+ "values(?,?,?,?,?,?) ";
			ps = con.prepareStatement(sql);				
				ps.setString(1,user.getAddress());
				ps.setInt(2, user.getUiNo());
				ps.setString(3, user.getUiName());
				ps.setString(4, user.getUiId());
				ps.setInt(5, user.getUiAge());
				ps.setString(6, user.getUiPwd());
				return ps.executeUpdate();
			}catch (SQLException e) {
				e.printStackTrace();
		} 
		return 0;
		}
		
	public int updateUser() {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = bc.getConnection();
			String sql = "update user_info set uiname=?,uiage=?,address=? where uino=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUiName());
			ps.setInt(2, user.getUiAge());
			ps.setString(3, user.getAddress());
			ps.setInt(4, user.getUiNo());
			return ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public int deleteUser() {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = bc.getConnection();
			String sql = "delete from user_info where uino=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, user.getUiNo());
			return ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
	}
	return 0;
	}
}
