package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.IPurchaseOrder;

@SpringBootApplication
public class BootProj24MailAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProj24MailAppApplication.class, args);

		IPurchaseOrder order = context.getBean(IPurchaseOrder.class);

		try {
			String msg = order.purchase(new String[] { "Fossil-Chronography", "USPOLO-Tshirt", "LouisPhilippe-Shoes" },
					new double[] { 12000.0, 5000.0, 6000.0 }, new String[] { "attrayaghoshdas@gmail.com",
							"nithinvanga01@gmail.com", "nilesh7345kaka@gmail.com" });

			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) context).close();
	}

}