package com.fonyou.prueba.prueba.infraestructure.ports.input.service;

import com.fonyou.prueba.prueba.application.dto.PruebaDto;

import java.util.List;
import java.util.Optional;

public interface ICrudCaseService {
   PruebaDto saveUpdate(PruebaDto prueba);
   List<PruebaDto> showAll();
   Optional<PruebaDto> showByID(Long id);
   void deletePrueba(Long id);
}
