package in.ineuron.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/test") // Global Request Path
public class TestController {

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String showHome() {
//		return "home";
//	}

	/** Taking @RequestMapping without requestpath takes "/" as default path */
//	@RequestMapping
//	public String showHome() {
//		return "home";
//	}

	/** The request path of handler method is caseSensitive. */
	@RequestMapping(value = "/REPORT", method = RequestMethod.GET)
	public String showReport(Map<String, Object> model) {
		System.out.println("TestController.showReport()");
		return "";
	}

	@GetMapping(value = "/report")
	public String showReport1(Map<String, Object> model) {
		System.out.println("TestController.showReport1()");
		return "display";
	}

	@RequestMapping(value = "/report1", method = RequestMethod.POST)
	public String showReport2(Map<String, Object> model) {
		System.out.println("TestController.showReport2()");
		return "display";
	}

	@RequestMapping(value = "/report1", method = RequestMethod.GET)
	public String showReport3(Map<String, Object> model) {
		System.out.println("TestController.showReport3()");
		return "display1";
	}

	/** One Handler class can have multiple request paths */
	@GetMapping(value = { "/report2", "/report3", "/report4" })
	public String showReport4(Map<String, Object> model) {
		System.out.println("TestController.showReport4()");
		return "display1";
	}

	/** Can have same request path, but mode should be different */
	@GetMapping(value = "report5")
	public String showReport5(Map<String, Object> model) {
		System.out.println("TestController.showReport5()");
		return "display";
	}

	@PostMapping(value = "report5")
	public String showReport6(Map<String, Object> model) {
		System.out.println("TestController.showReport6()");
		return "display";
	}

}
