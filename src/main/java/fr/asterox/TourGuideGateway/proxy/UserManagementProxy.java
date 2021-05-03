package fr.asterox.TourGuideGateway.proxy;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.asterox.TourGuideGateway.DTO.UserPreferencesDTO;
import fr.asterox.TourGuideGateway.DTO.VisitedLocationDTO;

@FeignClient(name = "UserManagement", url = "localhost:9001")
public interface UserManagementProxy {

	@GetMapping("/getLastLocation")
	public String getLastLocation(@RequestParam @NotNull(message = "username is compulsory") String userName);

	@GetMapping("/getUserRewards")
	public String getUserRewards(@RequestParam @NotNull(message = "username is compulsory") String userName);

	@GetMapping("/getVisitedLocations")
	public List<VisitedLocationDTO> getVisitedLocations(
			@RequestParam @NotNull(message = "username is compulsory") String userName);

	@GetMapping("/getAllCurrentLocations")
	public String getAllCurrentLocations();

	@GetMapping("/getUserPreferences")
	public UserPreferencesDTO getUserPreferences(
			@RequestParam @NotNull(message = "username is compulsory") String userName);
}
