package fr.asterox.TourGuideGateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.asterox.TourGuideGateway.proxy.UserManagementProxy;

@RestController
public class UserManagementController {
	@Autowired
	UserManagementProxy usersManagementProxy;

	@RequestMapping("/getLastLocation")
	public String getLastLocation(@RequestParam String userName) {
		return usersManagementProxy.getLastLocation(userName);
	};

	@RequestMapping("/getRewards")
	public String getRewards(@RequestParam String userName) {
		return usersManagementProxy.getRewards(userName);
	}
}
