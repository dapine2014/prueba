package com.fonyou.prueba.prueba.infraestructure.ports.input.repository;

import com.fonyou.prueba.prueba.model.Prueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba, Long> {
}