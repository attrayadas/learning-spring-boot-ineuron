package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbApacheKafkaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbApacheKafkaAppApplication.class, args);
	}

}

//Input:
//	[
//	    {  
//	        "customerId":10,
//	        "customerName": "dhoni",
//	        "customerEmail": "navin@gmail.com"
//	    }
//	]
//			
//Output:
//	************Msg published to Kafka topic***************
//	***Msg recieved from Kafka Topic ::Customer(customerId=10, customerName=dhoni, customerEmail=navin@gmail.com)


//Input:
//	[
//	    {  
//	        "customerId":10,
//	        "customerName": "dhoni",
//	        "customerEmail": "navin@gmail.com"
//	    },
//	    {  
//	        "customerId":11,
//	        "customerName": "sahin",
//	        "customerEmail": "sachin@gmail.com"
//	    },
//	    {  
//	        "customerId":12,
//	        "customerName": "kohli",
//	        "customerEmail": "kohli@gmail.com"
//	    }
//	]
//			
//Output:
//	************Msg published to Kafka topic***************
//	************Msg published to Kafka topic***************
//	************Msg published to Kafka topic***************
//	***Msg recieved from Kafka Topic ::Customer(customerId=10, customerName=dhoni, customerEmail=navin@gmail.com)
//	***Msg recieved from Kafka Topic ::Customer(customerId=11, customerName=sahin, customerEmail=sachin@gmail.com)
//	***Msg recieved from Kafka Topic ::Customer(customerId=12, customerName=kohli, customerEmail=kohli@gmail.com)
	