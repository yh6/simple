package si.mp.le.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import si.mp.le.user.dao.UserDAO;
import si.mp.le.user.vo.User;

@Service
public class UserSerivce {

	
	private UserDAO udao;
	
	@Autowired
	public UserSerivce(@Qualifier("userDAO")UserDAO udao) {
		this.udao=udao;
	}
	@Autowired
	public void setUserDAO(UserDAO udao) {
		this.udao=udao;
	}
	public List<User> getUser() {
		return udao.selectUserList();
	}
}
