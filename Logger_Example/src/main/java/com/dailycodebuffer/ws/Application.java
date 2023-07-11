package com.dailycodebuffer.ws;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

  }
	@Scheduled(fixedDelay = 2000)
	public void scheduledRun() {
		System.out.println("Current Scheduled Time" +new Date());
	}

}
