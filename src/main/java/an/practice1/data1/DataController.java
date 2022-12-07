package an.practice1.data1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@RequestMapping("/hi")
	public String hlo() {
		return "I am Working..!";
	}
	
	@GetMapping("/data")
	public Data get() {
		return new Data((long) 6617,"Aadhi", "API", "THIS");
	}

}
