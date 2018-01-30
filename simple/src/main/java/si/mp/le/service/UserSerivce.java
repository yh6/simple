package si.mp.le.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import si.mp.le.dao.UserDAO;
import si.mp.le.vo.User;

@Service
public class UserSerivce {

	@Autowired
	private UserDAO udao;
	
	public List<User> getUser() {
		return udao.selectUserList();
	}
}
