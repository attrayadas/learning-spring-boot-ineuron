package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootReadingYmlAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReadingYmlAppApplication.class, args);
	}

}

//Output:
//	Key :: testMsg
//	Value :: This is test msg
//	Key :: welcomeMsg
//	Value :: Welcome to iNeuron
//	Key :: greetMsg
//	Value :: Hiee, Good Morning
