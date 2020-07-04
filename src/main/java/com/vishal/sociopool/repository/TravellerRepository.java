package com.vishal.sociopool.repository;

import com.vishal.sociopool.entity.Traveller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravellerRepository extends JpaRepository<Traveller, Integer> {
}
