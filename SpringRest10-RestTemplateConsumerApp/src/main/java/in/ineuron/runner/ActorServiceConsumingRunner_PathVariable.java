package in.ineuron.runner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner_PathVariable implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("ActorServiceConsumingRunner_PathVariable.run()");

		RestTemplate template = new RestTemplate();
		String serviceUrl = "http://localhost:8080/api/actor/wish/{id}/{name}";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 10);
		map.put("name", "Dhoni");
		ResponseEntity<String> responseEntity = template.getForEntity(serviceUrl, String.class, map);

		System.out.println("ResponseBody                :: " + responseEntity.getBody());
		System.out.println("Response Status Code Value  :: " + responseEntity.getStatusCodeValue());
		System.out.println("Response Status Code        :: " + responseEntity.getStatusCode().name());
		System.out.println("*************************************************");

	}

}