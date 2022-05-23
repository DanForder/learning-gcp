package com.example.gcpDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class GcpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpDemoApplication.class, args);
	}

}
