package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMvcProj1DisplayingHomePageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj1DisplayingHomePageApplication.class, args);

	}

}

/** 
 * a. The request path of handler method must start with "/".
 * b. The request path of handler method is caseSensitive.
 * c. Multiple request have same request path with different request methods like POST/GET
 * d. Taking @RequestMapping without requestpath takes "/" as default path
 * e. One Handler class can have multiple request paths
 * f. RequestMapping with Mode should be unique with respect to controller class.
 * g. In SpringMVC max two methods can be taken without requestpath(One with GET request and another one with POST request)
 * h. If two controller class have two handler methods with same request type and request mode then we need to differentiate them at the Controller level using "global request path"
 * i. We can inject ServletContext object, ServletConfig object, HttpSession object to Controller class using @Autowired annotation
 * j. We cannot take ServletContext,ServletConfig object as a parameter of handler method becoz they are global objects which go for @Autowired injections  more over they are not valid parameter types for handler methods,but we can take HttpSession type parameter in handler methods
 */