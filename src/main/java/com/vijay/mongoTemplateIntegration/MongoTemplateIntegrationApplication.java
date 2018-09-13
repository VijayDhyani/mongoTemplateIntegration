package com.vijay.mongoTemplateIntegration;

import com.vijay.mongoTemplateIntegration.dal.PersonDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
public class MongoTemplateIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoTemplateIntegrationApplication.class, args);
	}

}
