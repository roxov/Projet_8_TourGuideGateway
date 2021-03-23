package fr.asterox.TourGuideGateway.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "TripPricer", url = "localhost:9002")
public interface TripPricerProxy {

}
