package si.mp.le.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iot.test.vo.UserClass;

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
	
	public List<User> userList(){
		List<User> list = new ArrayList<User>();
		return userList();
	}
	public List<User> selectUserList() {
		List<User> list = new ArrayList<User>();
    	String sql = "select * from user_info uino=1";	
    	Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = bc.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				UserClass uc = new UserClass();
				uc.setAddress(rs.getString("address"));
				uc.setCiDesc(rs.getString("cidesc"));
				uc.setCiName(rs.getString("ciname"));
				uc.setCiNo(rs.getInt("cino"));
				uc.setUiAge(rs.getInt("uiage"));
				uc.setUiId(rs.getString("uiid"));
				uc.setUiName(rs.getString("uiname"));
				uc.setUiNo(rs.getInt("uino"));
				uc.setUiPwd(rs.getString("uipwd"));
				uc.setUiRegdate(rs.getString("uiregdate"));
				userList.add(uc);
			
		}
		System.out.println(dbc.getConnection());
		user.setName("홍길동");
		user.setAge(30);
		return selectuser;
	
	}
	
}
