package springmvc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc1.Model.User;
@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate template;
	
	@Transactional
	public String saveUser(User user) {
		String id = (String)this.template.save(user);
		return id;
	}
	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
}
