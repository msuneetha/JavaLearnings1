package com.tourist.TouristApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tourist.TouristApp.entity.Tourist;

@Service
public interface ITouristService 
{
	public List<Tourist> getAllTourists();
	public Tourist getTouristById(Integer id);
	
	public String updateTourist(Tourist tourist);	
	public String updateTouristById(Integer id, Double budget);
	
	public String deleteTouristById(Integer id);
	public String registerTourist(Tourist tourist);
}
