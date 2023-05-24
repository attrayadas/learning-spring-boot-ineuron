package in.ineuron.runner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.ineuron.model.Actor;

@Component
public class ActorServiceConsumingRunner_GettingJsonData implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("ActorServiceConsumingRunner_GettingJsonData.run()");

		RestTemplate template = new RestTemplate();
		String serviceUrl = "http://localhost:8080/api/actor/find/{id}";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 7);
		ResponseEntity<Actor> responseEntity = template.getForEntity(serviceUrl, Actor.class, map);

		System.out.println("ResponseBody                :: " + responseEntity.getBody());
		System.out.println("ResponseStatus Code Value   :: " + responseEntity.getStatusCodeValue());
		System.out.println("ResponseStatus Code         :: " + responseEntity.getStatusCode().name());
		System.out.println("*************************************************");

	}
}