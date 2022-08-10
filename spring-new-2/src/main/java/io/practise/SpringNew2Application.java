package io.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.practise.dao.UserDao;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories(basePackageClasses=UserDao.class)
public class SpringNew2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringNew2Application.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public WebMvcConfigurer configure() {
		return new WebMvcConfigurer() {
			
			public void addCorsMappings(CorsRegistry reg) {
				reg.addMapping("/**").allowedOriginPatterns("http://localost:3000");
			}
		};
	}

}
