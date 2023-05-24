package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRest16HateosAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRest16HateosAppApplication.class, args);
	}

}

//Input: http://localhost:4444/api/books/getBook/ISBN-111
//	
//Output:
//{
//    "isbn": "ISBN-111",
//    "name": "Spring",
//    "price": 234.5,
//    "author": "RodJhonson",
//    "_links": {
//        "allBooks": {
//            "href": "http://localhost:4444/api/books/allBooks"
//        }
//    }
//}