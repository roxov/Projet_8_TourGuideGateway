package fr.asterox.TourGuideGateway.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.asterox.TourGuideGateway.DTO.ProviderDTO;

@FeignClient(name = "TripPricer", url = "localhost:9002")
public interface TripPricerProxy {
	// TODO : Cannot construct instance of `org.javamoney.moneta.Money`
	// dto.UserPreferencesDTO
	@RequestMapping("/getTripDeals")
	public List<ProviderDTO> getTripDeals(@RequestParam String userName);
}
