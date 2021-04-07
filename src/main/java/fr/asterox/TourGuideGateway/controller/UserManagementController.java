package fr.asterox.TourGuideGateway.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.asterox.TourGuideGateway.DTO.UserPreferencesDTO;
import fr.asterox.TourGuideGateway.DTO.VisitedLocationDTO;
import fr.asterox.TourGuideGateway.proxy.UserManagementProxy;

@RestController
public class UserManagementController {
	@Autowired
	UserManagementProxy userManagementProxy;

	private Logger logger = LoggerFactory.getLogger(UserManagementController.class);

	@RequestMapping("/getLastLocation")
	public String getLastLocation(@RequestParam String userName) {
		logger.debug("sending request to UserManagement microservice to get last location of user :" + userName);
		return userManagementProxy.getLastLocation(userName);
	};

	@RequestMapping("/getUserRewards")
	public String getUserRewards(@RequestParam String userName) {
		logger.debug("sending request to UserManagement microservice to get rewards of user :" + userName);
		return userManagementProxy.getUserRewards(userName);
	}

	@RequestMapping("/getVisitedLocations")
	public List<VisitedLocationDTO> getVisitedLocations(@RequestParam String userName) {
		logger.debug("sending request to UserManagement microservice to get the list of locations visited by user :"
				+ userName);
		return userManagementProxy.getVisitedLocations(userName);
	}

	@RequestMapping("/getAllCurrentLocations")
	public String getAllCurrentLocations() {
		logger.debug("sending request to UserManagement microservice to get the last location of all users");
		return userManagementProxy.getAllCurrentLocations();
	}

	@RequestMapping("/getUserPreferences")
	public UserPreferencesDTO getUserPreferences(@RequestParam String userName) {
		logger.debug("sending request to UserManagement microservice to get user preferences of user :" + userName);
		return userManagementProxy.getUserPreferences(userName);
	}
}
