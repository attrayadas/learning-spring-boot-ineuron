package in.ineuron.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
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

		ResponseEntity<Actor> responseEntity = template.exchange(serviceUrl,
																HttpMethod.GET,
																null, 
																Actor.class,
																7);

		System.out.println("ResponseBody                :: " + responseEntity.getBody());
		System.out.println("ResponseStatus Code Value   :: " + responseEntity.getStatusCodeValue());
		System.out.println("ResponseStatus Code         :: " + responseEntity.getStatusCode().name());
		System.out.println("*************************************************");

	}
}