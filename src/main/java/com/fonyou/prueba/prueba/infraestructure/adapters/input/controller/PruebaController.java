package com.fonyou.prueba.prueba.infraestructure.adapters.input.controller;



import com.fonyou.prueba.prueba.application.dto.PruebaDto;
import com.fonyou.prueba.prueba.infraestructure.ports.input.service.ICrudCaseService;
import com.fonyou.prueba.prueba.utils.Responce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.fonyou.prueba.prueba.utils.Constant.*;


@RestController
@RequestMapping("/api")
public class PruebaController {

    @Autowired
    private ICrudCaseService crudCaseService;

    @PostMapping("/saveupdate")
    public  ResponseEntity<Object> setCreateUpdateStudent(@RequestBody PruebaDto pruebaDto){
        Object response =  crudCaseService.saveUpdate(pruebaDto);
        return ResponseEntity.ok().body(new Responce(SUCCES_OK, RESPONSE_OK, response));
    }


    @GetMapping("/find/all")
    public ResponseEntity<Object> getAllStudent(){
        List<PruebaDto> response  = crudCaseService.showAll();
        if(!response.isEmpty()) {

            return ResponseEntity.ok().body(new Responce(SUCCES_OK, RESPONSE_OK, response));
        } else {

           return  ResponseEntity.badRequest().body(new Responce(SUCCES_ERROR, RESPONSE_NOT_OK, null));
        }
    }

    @GetMapping("/find/id/{id}")
    public ResponseEntity<Object> getStudentByID(@PathVariable Long id){
        Object response =  crudCaseService.showByID(id);
        return ResponseEntity.ok().body(new Responce(SUCCES_OK, RESPONSE_OK, response));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> setDeleteStudent(@PathVariable Long id){
        crudCaseService.deletePrueba(id);
        return  ResponseEntity.ok().body(new Responce(SUCCES_OK, RESPONSE_OK, DELETE_OK));
    }



}
