package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.client.HelloClient;

@RestController
public class HiRestController {

	@Autowired
	private HelloClient client;

	@GetMapping("/hi/{name}")
	public String sayHi(@PathVariable("name") String name) {

		System.out.println("Implementation classname of HelloClient is :: " + client.getClass().getName());
		String hiMsg = "Hi";
		
		String helloMsg = client.invokeHelloService(name);

		return hiMsg + "---- " +helloMsg+ " " + name + ", how are you ?";
	}
}
