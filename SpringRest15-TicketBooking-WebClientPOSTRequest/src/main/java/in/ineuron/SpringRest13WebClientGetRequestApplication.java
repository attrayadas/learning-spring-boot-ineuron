//  Before running this application, start the "SpringRest14-TicketBooking-WebClientProviderApp" application

package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.service.ERailClientApp;

@SpringBootApplication
public class SpringRest13WebClientGetRequestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringRest13WebClientGetRequestApplication.class, args);

		ERailClientApp bean = context.getBean(ERailClientApp.class);
		
		bean.invokeRestApi();
	}

}

//Output:
//	Ticket(ticketId=LBS18274, ticketStatus=booked, ticketPrice=3456.7, passengerName=Nitin Manjunath, from=Bangalore, to=Pune, journeyDate=24/05/2023, trainNumber=BLR-PUNE-4321)