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

import com.practica.Entity.State;
import com.practica.Service.IStateService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/states")
@RequiredArgsConstructor

public class StateController {
	
	private final IStateService service;
	
	@GetMapping
    public ResponseEntity<List<State>> findall(){
        List<State> States = service.findAll();
        return ResponseEntity.ok(States);
    }

    @GetMapping("/{id}")
    public ResponseEntity<State> findById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<State> save(@RequestBody State StateToSave){
        State state = service.save(StateToSave);
        return new ResponseEntity<>(state, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<State> update(@PathVariable Integer id, @RequestBody State StateToSave){
        State state = service.update(StateToSave);
        return ResponseEntity.ok(state);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
