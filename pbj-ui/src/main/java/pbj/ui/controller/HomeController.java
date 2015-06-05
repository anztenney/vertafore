package pbj.ui.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	String message = "Get more work done!";
	 
	@RequestMapping("/home")
	public Map<String,Object> home(@RequestParam(value = "name", required = false, defaultValue = "Today") String name) {
		//System.out.println("in controller");
 
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("message", message);
		model.put("name", name);
		return model;
	}
}
