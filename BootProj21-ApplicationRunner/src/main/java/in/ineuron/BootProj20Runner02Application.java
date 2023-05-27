package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootProj20Runner02Application {

	public static void main(String[] args) {
		SpringApplication.run(BootProj20Runner02Application.class, args);
	}

}

//Input: Run Configurations > Arguments: --port=9999 start --code=abc execute --loc=xyz --spring.application.name=FROMOUT

//Output:
//	From ApplicationRunner :: [--spring.output.ansi.enabled=always, --port=9999, start, --code=abc, execute, --loc=xyz, --spring.application.name=FROMOUT]
//	NonOptionalArgs :: [start, execute]
//	OptionalArgs :: [spring.output.ansi.enabled, loc, code, port, spring.application.name]
//	spring.output.ansi.enabled :: [always]
//	loc :: [xyz]
//	code :: [abc]
//	port :: [9999]
//	spring.application.name :: [FROMOUT]
//	Start taking Email Dump
//
//	Data from Run configuration :: FROMOUT
//	***********************************
//	From Command Line Runner ::[--spring.output.ansi.enabled=always, --port=9999, start, --code=abc, execute, --loc=xyz, --spring.application.name=FROMOUT]
//	***********************************