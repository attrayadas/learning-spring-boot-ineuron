package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/demo") // Global Request Path
public class DemoController {

	@GetMapping(value = "/report")
	public String showReport1(Map<String, Object> model) {
		System.out.println("DemoController.showReport1()");
		return "display";
	}

}
