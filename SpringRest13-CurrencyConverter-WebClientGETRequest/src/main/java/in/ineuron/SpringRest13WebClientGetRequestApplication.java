//  Before running this application, start the "SpringRest12-CurrencyConverter-WebClientProviderApp" application

package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.service.CurrencyService;

@SpringBootApplication
public class SpringRest13WebClientGetRequestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringRest13WebClientGetRequestApplication.class, args);

		CurrencyService bean = context.getBean("service", CurrencyService.class);

		String to = "INR";
		String from = "USD";
		
		bean.invokeRestApiSync(from, to);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

		bean.invokeRestApiASync(from, to);

	}

}

//Output:
//	*****Synchronous: REST call started*****
//	CurrencyResponse(currencyId=1, currencyFrom=USD, currencyTo=INR, currencyValue=83)
//	*****Synchronous: REST call ended*****
//	+++++++++++++++++++++++++++++++++++++++++++++++++++
//	*****ASynchronous: REST call started*****
//	*****ASynchronous: REST call ended*****
//	CurrencyResponse(currencyId=1, currencyFrom=USD, currencyTo=INR, currencyValue=83)