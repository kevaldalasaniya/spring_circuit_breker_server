package com.kd.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@SpringBootApplication
public class ServerStarter {
	public static void main(String[] args) {
		SpringApplication.run(ServerStarter.class, args);
		
	}
	
}
