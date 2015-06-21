package beer.chooser.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.social.config.annotation.SocialConfigurer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.google.common.collect.Sets;

/*
 * @author: Alejandro Chang alejochang@gmail.com
 * 
 * Main application class annotated with all the required configurations for:
 *  - Spring Data MongoDB to integrate with MongoDB DB
 *  - Spring Boot to create a stand-alone application.
 */
@Configuration
@EnableAutoConfiguration
@EnableMongoRepositories
@ConfigurationProperties("application.properties")
@ComponentScan("beer.chooser.rest")
public class BeerChooserApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BeerChooserApp.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BeerChooserApp.class);
		
	}
}
