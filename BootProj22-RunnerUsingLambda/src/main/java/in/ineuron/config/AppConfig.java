package in.ineuron.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ineuron.methodref.SampleTest;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner runA() {
		// Syntax: new CommandLineRunner(){.....}
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				System.out.println("HELLO :: " + Arrays.asList(args));
			}
		};
	}

	/* Writing the above code using lambda expression: */

	@Bean
	public CommandLineRunner runB() {
		// Syntax: Interface obj =(params)->{MethodBody;}
		return (args) -> {
			System.out.println("FROM RUNNER :: " + Arrays.asList(args));
		};
	}

	/* Writing the above code using method referencing: */

	@Bean
	public CommandLineRunner runC() {
		// Syntax: ClassName :: methodName
		return SampleTest::test;
	}

}