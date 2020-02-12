package com.bus.travel.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.travel.dao.entity.TripSchedule;

@Repository
public interface TripScheduleRepository extends JpaRepository<TripSchedule, Long>{

}
