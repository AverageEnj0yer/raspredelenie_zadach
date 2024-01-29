package com.example.raspredelenie.repository;

import com.example.raspredelenie.entity.Zadachi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ZadachiRepository extends JpaRepository<Zadachi, Integer> {

}
