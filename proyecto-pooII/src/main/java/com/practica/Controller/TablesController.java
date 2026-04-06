package com.practica.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.Entity.Tables;
import com.practica.Service.ITablesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/tables")
@RequiredArgsConstructor

public class TablesController {
	
	private final ITablesService service;
	
	@GetMapping
    public ResponseEntity<List<Tables>> findall(){
        List<Tables> Tables = service.findAll();
        return ResponseEntity.ok(Tables);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tables> findById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Tables> save(@RequestBody Tables TablesToSave){
        Tables tables = service.save(TablesToSave);
        return new ResponseEntity<>(tables, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tables> update(@PathVariable Integer id, @RequestBody Tables TablesToSave){
        Tables tables = service.update(TablesToSave);
        return ResponseEntity.ok(tables);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
