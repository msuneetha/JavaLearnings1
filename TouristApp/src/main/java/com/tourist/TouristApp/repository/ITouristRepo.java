package com.tourist.TouristApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourist.TouristApp.entity.Tourist;

@Repository
public interface ITouristRepo extends JpaRepository<Tourist, Integer>
{

}
