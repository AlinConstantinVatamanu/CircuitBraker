package com.nttdata.circuitbraker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.circuitbraker.entities.CircuitBraker;

@SpringBootApplication
public class CircuitbrakerApplication implements CommandLineRunner {

	private CircuitBraker circuitBraker;
	
	public static void main(String[] args) {
		SpringApplication.run(CircuitbrakerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CircuitBraker status1 = new CircuitBraker(1, 4, 25);
		System.out.println(status1.getStatus());
		
		CircuitBraker status2 = new CircuitBraker(0, 4, 50);
		System.out.println(status2.getStatus());
		
		CircuitBraker status3 = new CircuitBraker(5, 2, 20);
		System.out.println(status3.getStatus());
	}

}
