package com.TestApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestApi.model.Country;

public interface CountryRepo extends JpaRepository<Country ,Integer> {

//	public int findIdByName(String name);
}
