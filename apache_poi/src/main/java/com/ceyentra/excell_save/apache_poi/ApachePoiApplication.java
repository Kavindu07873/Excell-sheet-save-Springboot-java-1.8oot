package com.ceyentra.excell_save.apache_poi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApachePoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApachePoiApplication.class, args);
	}

}
