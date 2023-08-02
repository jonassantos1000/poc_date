package br.com.poc.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DateApplication implements CommandLineRunner {
	
	@Autowired
	DateRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DateApplication.class, args);
	}

	@PostConstruct
	private void setTimeZone() {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT-0"));
	}

	@Override
	public void run(String... args) throws Exception {
		ZonedDateTime semZoneId = ZonedDateTime.now();
		ZonedDateTime comZoneId = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		repository.save(new DateEntity(semZoneId , comZoneId));
		repository.findAll().forEach(System.out::println);
	}
	
}
