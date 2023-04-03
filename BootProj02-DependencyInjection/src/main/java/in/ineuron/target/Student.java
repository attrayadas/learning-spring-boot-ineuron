package in.ineuron.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.ineuron.dependent.ICourseMaterial;

@Component(value = "student")
public class Student {

	static {
		System.out.println("Student.class is loading...");
	}

	public Student() {
		System.out.println("Student object is instantiated...");
	}

	@Autowired
	@Qualifier("courseId")
	private ICourseMaterial material;

	public void preparation(String examName) {
		System.out.println("Preparation started :: " + examName);
		String courseContent = material.courseContent();
		double price = material.price();
		System.out.println("Preparation is going on using :: " + courseContent + " material with price :: " + price);
		System.out.println("Preparation completed for :: " + examName);
	}

	public ICourseMaterial getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Student [material=" + material + "]";
	}

}
