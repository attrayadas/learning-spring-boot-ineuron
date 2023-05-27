package in.ineuron.runners;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements ApplicationRunner {

	@Value("${spring.application.name}")
	private String name;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Printing args in the form of Array
		System.out.println("From ApplicationRunner :: " + Arrays.asList(args.getSourceArgs()));

		// Printing non options args
		System.out.println("NonOptionalArgs :: " + args.getNonOptionArgs());

		// Printing option args
		System.out.println("OptionalArgs :: " + args.getOptionNames());

		// Printing option-name and option-value
		Set<String> optionNames = args.getOptionNames();
		for (String optionName : optionNames) {
			System.out.println(optionName + " :: " + args.getOptionValues(optionName));
		}

		if (args.getNonOptionArgs().contains("start")) {
			// logic for dumping emails
			System.out.println("Start taking Email Dump");
		}
		System.out.println();
		System.out.println("Data from Run configuration :: " + name); // properties file data will be overriden

		System.out.println("***********************************");
	}

}
