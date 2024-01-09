package in.williamIT.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/contact")
	public String getContactMsg() {
		return "Call us:+91 9994036645";
	}

	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Hi!Bea, Good Morning";
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Hi!Bene,How are you";
	}

}
