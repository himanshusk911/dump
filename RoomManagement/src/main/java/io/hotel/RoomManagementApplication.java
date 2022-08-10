package io.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RoomManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomManagementApplication.class, args);
	}

}
