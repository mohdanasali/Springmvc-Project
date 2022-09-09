package springmvc1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handler");
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public String enjoy() {
		System.out.println("this is enjoy handler");
		return "contact";
	}
}
