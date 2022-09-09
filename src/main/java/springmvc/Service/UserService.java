package springmvc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import springmvc.Dao.UserDao;
import springmvc1.Model.User;

@Service("userService")
@Component
public class UserService {

	@Autowired
	private  UserDao dao;

	public String  create(User user) {
		return this.dao.saveUser(user);
	}
	
	
}
