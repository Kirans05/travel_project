package com.merchant.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.merchant.api.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class MerchantFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantFrontApplication.class, args);
	}

}
