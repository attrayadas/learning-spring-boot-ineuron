package in.ineuron.model;

import lombok.Data;

@Data
public class Employee {
	private Integer eno;
	private String ename="Sachin Tendulkar";
	private String edesg;
	private Double salary;
	
	public Employee(){
		System.out.println("Zero Param Constructor is used by DS");
	}
}
