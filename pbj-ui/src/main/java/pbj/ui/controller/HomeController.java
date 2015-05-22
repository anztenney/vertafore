package pbj.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	String message = "Get more work done!";
	 
	@RequestMapping("/home")
	public ModelAndView home(@RequestParam(value = "name", required = false, defaultValue = "Today") String name) {
		//System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}
