//  Before running this application, start the "SpringRest09-RestTemplateProviderApp" application 

package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRest10ConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRest10ConsumerAppApplication.class, args);
	}

}

//Output:
//	ActorServiceConsumingRunner.run()
//	ResponseBody                :: Good Night Attraya
//	Response Status Code Value  :: 200
//	Response Status Code        :: OK
//	*************************************************
//	ActorServiceConsumingRunner_GettingJsonData.run()
//	ResponseBody                :: Actor(aid=7, name=nitin, age=29.0, type=Teacher)
//	ResponseStatus Code Value   :: 200
//	ResponseStatus Code         :: OK
//	*************************************************
//	ActorServiceConsumingRunner_PathVariable.run()
//	ResponseBody                :: Good Night MS Dhoni; Associated id is 7
//	Response Status Code Value  :: 200
//	Response Status Code        :: OK
//	*************************************************
//	ActorServiceConsumingRunner_PostingJsonData.run()
//	ResponseBody                :: Actor data is: Actor(aid=45, name=Rohith, age=36.0, type=batsman)
//	Response Status Code Value  :: 201
//	Response Status Code        :: CREATED
//	*************************************************