package fr.asterox.TourGuideGateway;

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

	public static void main(String[] args) {
		SpringApplication.run(ZuulTourGuideApplication.class, args);
	}

}
