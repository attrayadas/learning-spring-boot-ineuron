package in.ineuron.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AlertServiceRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command line runner");
		for (String arg : args) {
			System.out.println(arg);
		}
	}

}