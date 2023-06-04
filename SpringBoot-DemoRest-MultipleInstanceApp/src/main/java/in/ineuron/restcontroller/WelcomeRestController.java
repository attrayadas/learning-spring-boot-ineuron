package in.ineuron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greet")
public class WelcomeRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg() {
		String msg = "Welcome to iNeuron";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
