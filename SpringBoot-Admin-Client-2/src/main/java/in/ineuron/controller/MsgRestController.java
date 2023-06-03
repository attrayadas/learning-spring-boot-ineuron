package in.ineuron.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/msg")
public class MsgRestController {

	@GetMapping("/greet/{name}")
	public String sayHi(@PathVariable String name) {
		return "Hi " + name + " :)";
	}
}
