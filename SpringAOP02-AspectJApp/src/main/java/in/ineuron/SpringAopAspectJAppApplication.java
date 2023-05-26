package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopAspectJAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopAspectJAppApplication.class, args);
	}

}

//Output:
//	Transaction begin...
//	Transaction rollbacked...DUMMY EXCEPTION
//	***Email Setup is done***

//				or

//	Transaction begin...
//	Employee Object is saved...
//	Transaction commited...
//	Data is: Employee data saved with the id: 5
//	***Email Setup is done***