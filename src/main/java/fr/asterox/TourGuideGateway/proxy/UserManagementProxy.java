package fr.asterox.TourGuideGateway.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.asterox.TourGuideGateway.DTO.UserPreferencesDTO;
import fr.asterox.TourGuideGateway.DTO.VisitedLocationDTO;

@FeignClient(name = "UserManagement", url = "localhost:9001")
public interface UserManagementProxy {

	@RequestMapping("/getLastLocation")
	public String getLastLocation(@RequestParam String userName);

	@RequestMapping("/getUserRewards")
	public String getUserRewards(@RequestParam String userName);

	@RequestMapping("/getVisitedLocations")
	public List<VisitedLocationDTO> getVisitedLocations(@RequestParam String userName);

	@RequestMapping("/getAllCurrentLocations")
	public String getAllCurrentLocations();

	@RequestMapping("/getUserPreferences")
	public UserPreferencesDTO getUserPreferences(@RequestParam String userName);
}
