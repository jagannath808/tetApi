package com.TestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.TestApi.model.Country;
import com.TestApi.repo.CountryRepo;
import com.TestApi.repo.StateRepo;

@SpringBootApplication
public class TestApiApplication  implements CommandLineRunner{

	@Autowired
	CountryRepo countryRepo;
	
	@Autowired
	StateRepo stateRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(stateRepo.findAllByCountry(1));
		
		//(countryRepo.findIdByName("IND")));
		
	}

}
