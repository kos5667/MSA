package org.riot.apicore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"org.riot"})
@ComponentScan(basePackages = { "org.riot" })
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${spring.profiles.active}")
	String profiles;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				logger.info("=== application propertie ===");
				logger.info("profiles = " + profiles);
			}
		};
	};
}
