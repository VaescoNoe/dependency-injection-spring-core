package com.vargas.noe.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vargas.noe.di.autowire.AreaCalculatorService;


//@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class DependencyInjectionSpringCoreApplication {
	
	@Bean
	public String getApplicationName() {
		return "Aurelio Rules";
	}
	
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInjectionSpringCoreApplication.class);

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DependencyInjectionSpringCoreApplication.class, args);
		AreaCalculatorService aplication =context.getBean(AreaCalculatorService.class);
		log.info("Área total: {}",aplication.calcAreas());
 	}

}
