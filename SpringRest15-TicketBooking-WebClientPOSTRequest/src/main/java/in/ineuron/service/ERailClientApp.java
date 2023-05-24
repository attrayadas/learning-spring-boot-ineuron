package in.ineuron.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ineuron.request.PassengerInfo;
import in.ineuron.response.Ticket;

@Service("service")
public class ERailClientApp {
	
	private static final String REST_END_URI = "http://localhost:8080/api/ticket/register";

	public void invokeRestApi() {
		WebClient client = WebClient.create();
		
		PassengerInfo body = new PassengerInfo();
		body.setFirstName("Nitin");
		body.setLastName("Manjunath");
		body.setJourneyDate("24/05/2023");
		body.setFrom("Bangalore");
		body.setTo("Pune");
		body.setTrainNumber("BLR-PUNE-4321");

		Ticket response = client.post().uri(REST_END_URI).accept(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(body))
				.retrieve().bodyToMono(Ticket.class).block();

		System.out.println(response);

	}
}
