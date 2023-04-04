package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.BillGenerator;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		BillGenerator billGenerator = context.getBean(BillGenerator.class);
		System.out.println(billGenerator);

		((ConfigurableApplicationContext) context).close();
	}
}

//Output:
//	BillGenerator [billAmount=140.0, hotelName=A2B, info=ItemsInfo [idlyPrice=25.0, vadaPrice=25.0, dosaPrice=90.0]]