package com.fonyou.prueba.prueba.application.usercase;

import com.fonyou.prueba.prueba.application.dto.PruebaDto;
import com.fonyou.prueba.prueba.infraestructure.ports.input.service.ICrudCaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudCaseImpl implements ICrudCaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrudCaseImpl.class);


    @Override
    public PruebaDto saveUpdate(PruebaDto prueba) {
        return null;
    }

    @Override
    public List<PruebaDto> showAll() {
        return null;
    }

    @Override
    public Optional<PruebaDto> showByID(Long id) {
        return Optional.empty();
    }

    @Override
    public void deletePrueba(Long id) {

    }
}
