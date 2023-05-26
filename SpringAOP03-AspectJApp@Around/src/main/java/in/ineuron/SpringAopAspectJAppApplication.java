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
//	Before Transaction
//	Employee Object is saved...
//	DATA IS ::10
//	After Transaction