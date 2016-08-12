package org.springframework.samples.mvc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	@RequestMapping("/create")
	public @ResponseBody String WelcomeSlogan() {
		return "Welcome to the funny pool!";
	}

//	public void createFunnyPollRoom(FunnyPollRequest request){

//	}

}
