package fr.asterox.TourGuideGateway.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.asterox.TourGuideGateway.DTO.LocationDTO;
import fr.asterox.TourGuideGateway.DTO.NearbyAttractionDTO;

@FeignClient(name = "Location", url = "localhost:9004")
public interface LocationProxy {
	@GetMapping("/trackLocation")
	public LocationDTO trackLocation(@RequestParam String userName);

	@GetMapping("/getNearbyAttractions")
	public List<NearbyAttractionDTO> getNearbyAttractions(@RequestParam String userName);
}
