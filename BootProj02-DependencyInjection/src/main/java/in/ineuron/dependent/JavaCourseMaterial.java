package in.ineuron.dependent;

import org.springframework.stereotype.Component;

@Component(value = "java")
public final class JavaCourseMaterial implements ICourseMaterial {

	static {
		System.out.println("JavaCourseMaterial.class file is loading...");
	}

	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial :: Zero param constructor...");
	}

	@Override
	public String courseContent() {
		System.out.println("JavaMaterial CourseContent");
		return "1. oops 2. ExceptionHandling 3. Collection";
	}

	@Override
	public double price() {
		System.out.println("JavaCourseMaterial.price()");
		return 500;
	}

}
