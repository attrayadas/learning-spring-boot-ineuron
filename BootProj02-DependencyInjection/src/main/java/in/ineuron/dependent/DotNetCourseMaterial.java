package in.ineuron.dependent;

import org.springframework.stereotype.Component;

@Component(value = "dotnet")
public final class DotNetCourseMaterial implements ICourseMaterial {

	static {
		System.out.println("DotNetCourseMaterial.class is loading...");
	}

	public DotNetCourseMaterial() {
		System.out.println("DotNetCourseMaterial :: Zero param constructor...");
	}

	@Override
	public String courseContent() {
		System.out.println("DotNetCourseMaterial.courseContent()");
		return "1. c#oops 2. c#ExceptionHandling 3. c#Collection";
	}

	@Override
	public double price() {
		return 250;
	}

}
