package com.prac1.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prac1.springdemo.dao.RatingDAO;
import com.prac1.springdemo.entity.entity.Rating;

@Service
public class RatingService {

	private RatingDAO ratingdao;
	
	@Autowired
	public RatingService(RatingDAO ratingdao)
	{
		this.ratingdao=ratingdao;
	}
	
	
	
	
	public void save(Rating emp) {
		System.out.println("Inside Save method :"+emp);
		ratingdao.save(emp);
	}


	public List<Rating> findAll() {
		// TODO Auto-generated method stub
		 return ratingdao.findAll();
	}
	
	public void delete(String emp) {
		ratingdao.deleteById(emp);
		
	}

}
