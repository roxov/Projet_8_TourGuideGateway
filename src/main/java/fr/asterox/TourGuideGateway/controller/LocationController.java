package fr.asterox.TourGuideGateway.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.asterox.TourGuideGateway.DTO.LocationDTO;
import fr.asterox.TourGuideGateway.DTO.NearbyAttractionDTO;
import fr.asterox.TourGuideGateway.proxy.LocationProxy;

@RestController
public class LocationController {
	@Autowired
	LocationProxy locationProxy;

	private Logger logger = LoggerFactory.getLogger(LocationController.class);

	@GetMapping("/trackLocation")
	public LocationDTO trackLocation(@RequestParam @NotNull(message = "username is compulsory") String userName) {
		logger.debug("sending request to Location microservice to track location of user :" + userName);
		return locationProxy.trackLocation(userName);
	}

	@GetMapping("/getNearbyAttractions")
	public List<NearbyAttractionDTO> getNearbyAttractions(
			@RequestParam @NotNull(message = "username is compulsory") String userName) {
		logger.debug(
				"sending request to Location microservice to get the 5 closest attractions from user :" + userName);
		return locationProxy.getNearbyAttractions(userName);
	}
}
