package in.ineuron.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
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

		ResponseEntity<String> responseEntity = template.exchange(
														serviceUrl,
														HttpMethod.GET,
														null,
														String.class,
														7, "MS Dhoni"); // Used var-args

		System.out.println("ResponseBody                :: " + responseEntity.getBody());
		System.out.println("Response Status Code Value  :: " + responseEntity.getStatusCodeValue());
		System.out.println("Response Status Code        :: " + responseEntity.getStatusCode().name());
		System.out.println("*************************************************");

	}

}