package springmvc1.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home page");
		model.addAttribute("name", "Anas Ali");
		model.addAttribute("id", 10111);
		
		List<String>f= new ArrayList<String>();
		f.add("Tarun Kumar");
		f.add("Amit Singh");
		f.add("Raghav Singh");
		f.add("Salman");
		f.add("Shahrukh");
		model.addAttribute("friends", f);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is the about page");
		return "about";
	}
}
