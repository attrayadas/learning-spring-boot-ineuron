package in.ineuron.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public Integer saveEmployee() { // #3
		System.out.println("Employee Object is saved...");
		return 10;
	}

}