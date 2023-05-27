package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootProj20Runner02Application {

	public static void main(String[] args) {
		SpringApplication.run(BootProj20Runner02Application.class, args);
	}

}
//Input: Run Configurations > Arguments: SACHIN RAMESH TENDULKAR

//Output:
//	HELLO :: [SACHIN, RAMESH, TENDULKAR]
//	FROM RUNNER :: [SACHIN, RAMESH, TENDULKAR]
//	FROM METHOD REF ::[SACHIN, RAMESH, TENDULKAR]