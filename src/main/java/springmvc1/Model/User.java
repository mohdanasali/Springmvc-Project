package springmvc1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="user")
public class User {
    
	@Id
	String email;
	String username;
	String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(String email, String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		 return "email: '" + this.email +"\n"+ "', username: '" + this.username + "', password: '" + this.password + "'";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
