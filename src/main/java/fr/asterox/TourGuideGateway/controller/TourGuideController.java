package fr.asterox.TourGuideGateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TourGuideController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from TourGuide!";
	}

}
