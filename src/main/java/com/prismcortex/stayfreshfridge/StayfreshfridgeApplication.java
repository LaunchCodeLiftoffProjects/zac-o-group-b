package com.prismcortex.stayfreshfridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class StayfreshfridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StayfreshfridgeApplication.class, args);
	}

	@Controller
	public class HomePage {

		@RequestMapping("")
		public String underConstuction (Model model) {
			model.addAttribute("title", "Stay Fresh Fridge Coming Soon...");
			return "comingsoon";
		}
	}

}
