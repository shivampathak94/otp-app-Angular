package com.prac1.springdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prac1.springdemo.entity.entity.Rating;

public interface RatingDAO extends JpaRepository<Rating, String> {

}
