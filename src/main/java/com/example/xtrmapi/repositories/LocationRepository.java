package com.example.xtrmapi.repositories;

import com.example.xtrmapi.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> {

    List<Location> findBySport(String sport);
}
