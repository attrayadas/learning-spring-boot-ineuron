package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.info")
public class Company1 {
	
	@Value("${name}")
	private String name;
	
	@Value("${type}")
	private String type;
	
	@Value("${location}")
	private String location;

	static {
		System.out.println("Comany.class file is loading...");
	}

	public Company1() {
		System.out.println("Company object is instantiated...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Company.setName()");
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("Company.setType()");
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		System.out.println("Company.setLocation()");
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", type=" + type + ", location=" + location + "]";
	}

}
