package com.example.gcpDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GcpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpDemoApplication.class, args);
	}

}
