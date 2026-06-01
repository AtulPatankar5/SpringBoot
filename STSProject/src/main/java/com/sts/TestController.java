package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String handleHome() {
		return "home";
	}

	@GetMapping("/contact")
	public String handleContact() {
		return "contact";
	}
}
