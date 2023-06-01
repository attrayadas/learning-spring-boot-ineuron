package in.ineuron.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockService {

	private static final String REST_END_POINT = "http://localhost:1111/api/calc/calculate/{companyName}/{quantity}";

	public String getTotalStockPrice(String companyName, Integer quantity) {
		String response = null;
		WebClient webClient = WebClient.create();
		try {
			response = webClient.get()
								.uri(REST_END_POINT, companyName, quantity)
								.retrieve()
								.bodyToMono(String.class)
								.block();
		} catch (Exception e) {
			response="CompanyName not found";
		}

		return response;
	}
}
