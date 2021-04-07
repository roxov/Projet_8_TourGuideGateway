package fr.asterox.TourGuideGateway.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.asterox.TourGuideGateway.DTO.ProviderDTO;
import fr.asterox.TourGuideGateway.proxy.TripPricerProxy;

@RestController
public class TripPricerController {
	@Autowired
	TripPricerProxy tripPricerProxy;

	private Logger logger = LoggerFactory.getLogger(TripPricerController.class);

	@RequestMapping("/getTripDeals")
	public List<ProviderDTO> getTripDeals(@RequestParam String userName) {
		logger.debug("sending request to TripPricer microservice to get trip deals for user :" + userName);
		return tripPricerProxy.getTripDeals(userName);
	}
}
