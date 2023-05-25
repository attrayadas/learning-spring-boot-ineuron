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
//	Employee Object is saved...
//	Transaction commited...
//
//	Employee retrieved from Database
//
//	Transaction begin...
//	Record got deleted...!
//	Transaction commited...