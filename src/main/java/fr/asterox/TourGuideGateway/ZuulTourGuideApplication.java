package fr.asterox.TourGuideGateway;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableFeignClients("fr.asterox")
public class ZuulTourGuideApplication {
	private static final Logger LOGGER = LogManager.getLogger(ZuulTourGuideApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Initializing API Gateway");
		SpringApplication.run(ZuulTourGuideApplication.class, args);
	}

}
