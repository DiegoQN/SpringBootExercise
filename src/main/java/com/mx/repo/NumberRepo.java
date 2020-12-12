package com.mx.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mx.model.Number;

@Repository
public interface NumberRepo extends JpaRepository<Number, Integer>{

}