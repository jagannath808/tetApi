package com.TestApi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TestApi.model.State;



public interface StateRepo extends JpaRepository<State,Integer> {
	List<State> findAllByCountry(int id);
}
