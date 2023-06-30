package in.ineuron.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.ineuron.service.IWishMessageService;

@Controller
public class WishMessageController {

	@Autowired
	private IWishMessageService service;

	/** String */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
		return "home"; // String---> LVN
	}

	/** ModelAndView */
//	@RequestMapping(value = "/wish", method = RequestMethod.GET)
//	public ModelAndView showWishMessage() {
//
//		// call service to get the information
//		String msg = service.generateWishMessage();
//
//		// Send the data from controller to View
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("msg", msg);
//		mav.setViewName("display");
//
//		return mav; // ViewName ---> LVN
//	}

	/**
	 * String & (Model model): Preferable to keep String as return type as it's more
	 * readable
	 */
//	@RequestMapping(value = "/wish", method = RequestMethod.GET)
//	public String showWishMessage(Model model) {
//		System.out.println("Implemenation class name is :: " + model.getClass().getName());
//		String msg = service.generateWishMessage();
//		model.addAttribute("msg", msg);
//		return "display";
//	}

	/**
	 * String & (Map map): --------------------------------------------------->BEST APPROACH
	 */
//	@RequestMapping(value = "/wish", method = RequestMethod.GET)
//	public String showWishMessage(Map<String, Object> model) {
//		System.out.println("Implemenation class name is :: " + model.getClass().getName());
//		String msg = service.generateWishMessage();
//		model.put("msg", msg);
//		return "display";
//	}

	/**
	 * Since, return type is void and incoming request is "/wish", then it takes
	 * "wish" as LVN.
	 */
//	@RequestMapping(value = "/wish", method = RequestMethod.GET)
//	public void showWishMessage(Map<String, Object> model) {
//		System.out.println("Implemenation class name is :: " + model.getClass().getName());
//		String msg = service.generateWishMessage();
//		model.put("msg", msg);
//		return;
//	}

	/** Not preferrable, but possible */
//	@RequestMapping(value = "/wish", method = RequestMethod.GET)
//	public void generateMessage(HttpServletResponse response) throws Exception {
//		String wmg = service.generateWishMessage();
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<b>WishMessage :: " + wmg + "</b>");
//	}

	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public Map<String, Object> generateMessage() throws Exception {
		String msg = service.generateWishMessage();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", msg);
		return map;

	}

}

//To run: 
//	Uncomment each method one at a time to explore the various Controller methods
