package fr.asterox.TourGuideGateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TourGuideController {

	private Logger logger = LoggerFactory.getLogger(TourGuideController.class);

	@RequestMapping("/")
	public String index() {
		logger.debug("getting the home page of Tour Guide");
		return "Greetings from TourGuide!";
	}

}
