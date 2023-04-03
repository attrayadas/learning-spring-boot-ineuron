package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component("company")
public class Company {
	private String name;
	private String location;
	private int size;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", size=" + size + "]";
	}

}
