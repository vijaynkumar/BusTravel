package com.bus.travel.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.travel.dao.entity.Agency;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long>{

}
