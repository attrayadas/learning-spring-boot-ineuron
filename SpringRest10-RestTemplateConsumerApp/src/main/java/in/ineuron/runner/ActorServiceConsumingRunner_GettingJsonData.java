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

//Output:
//	ActorServiceConsumingRunner.run()
//	ResponseBody                :: Good Night Attraya
//	Response Status Code Value  :: 200
//	Response Status Code        :: OK
//	*************************************************
//	ActorServiceConsumingRunner_GettingJsonData.run()
//	ResponseBody                :: Actor(aid=7, name=nitin, age=29.0, type=Teacher)
//	ResponseStatus Code Value   :: 200
//	ResponseStatus Code         :: OK
//	*************************************************
//	ActorServiceConsumingRunner_PathVariable.run()
//	ResponseBody                :: Good Night Dhoni; Associated id is 10
//	Response Status Code Value  :: 200
//	Response Status Code        :: OK
//	*************************************************
//	ActorServiceConsumingRunner_PostingJsonData.run()
//	ResponseBody                :: Actor data is: Actor(aid=3, name=Sachin Tendulkar, age=54.0, type=batsman)
//	Response Status Code Value  :: 201
//	Response Status Code        :: CREATED
//	*************************************************