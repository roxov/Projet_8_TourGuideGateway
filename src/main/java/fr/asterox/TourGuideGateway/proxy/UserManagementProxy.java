package fr.asterox.TourGuideGateway.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "UserManagement", url = "localhost:9001")
public interface UserManagementProxy {

	@RequestMapping("/getLastLocation")
	public String getLastLocation(@RequestParam String userName);

	@RequestMapping("/getRewards")
	public String getRewards(@RequestParam String userName);

}
