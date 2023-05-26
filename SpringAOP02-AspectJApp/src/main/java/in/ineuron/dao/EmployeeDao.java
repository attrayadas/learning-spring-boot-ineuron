package in.ineuron.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public String saveEmployee() {

//		if (new Random().nextInt(15) < 10) {
//			throw new RuntimeException("DUMMY EXCEPTION");
//		}

		System.out.println("Employee Object is saved...");
		return "Employee data saved with the id: 5";
	}

}