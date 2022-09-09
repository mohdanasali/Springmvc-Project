package springmvc1.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.Service.UserService;
import springmvc1.Model.User;
@Component
@Controller
public class MyController {
   
    @Autowired(required=true)
	private UserService userservice;
	
	@RequestMapping(path="/contact")
	public String showForm() {
		return "contact";
	}
	@RequestMapping(path="/processform" ,method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model){
	System.out.println(user);
	if(user.getUsername().isBlank()) {
		return"redirect:/contact";
	}
	model.addAttribute("user",user);
	this.userservice.create(user);
	return "sucess";
		
	}
}
/* 
	public String handleForm(
			@RequestParam(name="email",required=false) String email ,
			@RequestParam("username")String username,
			@RequestParam("password")String password ,Model model)
	          {
		
		System.out.println("email "+email);
		System.out.println("usename "+username);
		System.out.println("passowrd "+password);
		model.addAttribute("email", email);
		model.addAttribute("username", username);
		model.addAttribute("password",password);
		return "sucess";
	}






*/








