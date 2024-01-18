package com.fonyou.prueba.prueba.application.usercase;

import com.fonyou.prueba.prueba.application.dto.PruebaDto;
import com.fonyou.prueba.prueba.infraestructure.ports.input.repository.PruebaRepository;
import com.fonyou.prueba.prueba.infraestructure.ports.input.service.ICrudCaseService;
import com.fonyou.prueba.prueba.model.Prueba;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CrudCaseImpl implements ICrudCaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrudCaseImpl.class);

    @Autowired
    private PruebaRepository repository;

    private final ModelMapper mapper = new ModelMapper();
    @Override
    public PruebaDto saveUpdate(PruebaDto prueba) {
        LOGGER.info("## START SAVE PRUEBA ##");
        Object response = repository.saveAndFlush(mapper.map(prueba, Prueba.class));
        LOGGER.info("## SAVED PRUEBA ##");

        return mapper.map(response, PruebaDto.class);
    }

    @Override
    public List<PruebaDto> showAll() {
        LOGGER.info("## START READ PRUEBAS ##");
        List<PruebaDto> pruebas = repository.findAll().stream().map(estudiante -> mapper.map(estudiante, PruebaDto.class)).collect(Collectors.toList());
        LOGGER.info("## END OF READING PRUEBAS ##");

        return pruebas;
    }

    @Override
    public Optional<PruebaDto> showByID(Long id) {
        LOGGER.info("## START SEARCH PRUEBA ##");
        Optional<Prueba> response =  repository.findById(id);
        LOGGER.info("## END SEARCH PRUEBA ##");

        return response.map((element) -> mapper.map(element, PruebaDto.class));
    }

    @Override
    public void deletePrueba(Long id) {
        repository.deleteById(id);
    }
}
