package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootProj20Runner01Application {

	public static void main(String[] args) {
		SpringApplication.run(BootProj20Runner01Application.class, args);
	}

}

//Output:
//	PdfReportRunner.run()
//	Args[0] :: START
//	Arguments are :: [START, LOAD, END]
//
//	EmailReportRunner.run()
//	Args[0] :: START
//	Arguments are :: [START, LOAD, END]