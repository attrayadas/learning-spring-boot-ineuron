package in.ineuron.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		logger.info("***** getWelcomeMsg() started *****");
		String msg = "Welcome to iNeuron :)";
		logger.info("***** getWelcomeMsg() started *****");
		return msg;
	}

}
