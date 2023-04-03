package in.ineuron.comp;

import java.util.List;

import in.ineuron.dto.Employee;

public interface IEmployeeDAO {
	public List<Employee> findAllEmployees() throws Exception;
}
