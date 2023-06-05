package in.ineuron.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HELLO-SERVICE")
public interface HelloClient {

	@GetMapping("/hello/{name}")
	public String invokeHelloService(@PathVariable String name);

}
