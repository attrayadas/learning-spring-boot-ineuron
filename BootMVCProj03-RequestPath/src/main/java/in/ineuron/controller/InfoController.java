package in.ineuron.controller;

import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/info") // Global Request Path
public class InfoController {

	@Autowired
	private ServletContext sc;

	@Autowired
	private ServletConfig cg;

	@Autowired
	private HttpSession ses;

	@GetMapping(value = "/details")
	public String showReport1(Map<String, Object> model) {
		System.out.println("InfoController.showReport1()");
		System.out.println("WebApp name is: " + sc.getContextPath());
		System.out.println("DS Logical name is: " + cg.getServletName());
		System.out.println("Session Id: " + ses.getId());
		return "display";
	}

}
