package com.fonyou.estudiante.estudiante.infraestructure.ports.input.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<com.fonyou.estudiante.estudiante.domain.model.Prueba, Long> {
}