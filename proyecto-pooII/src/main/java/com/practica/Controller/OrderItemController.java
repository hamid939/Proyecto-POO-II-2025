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

import com.practica.Entity.OrderItem;
import com.practica.Service.IOrderItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/orderitems")
@RequiredArgsConstructor

public class OrderItemController {
	
	private final IOrderItemService service;
	
	@GetMapping
    public ResponseEntity<List<OrderItem>> findall(){
        List<OrderItem> orderitems = service.findAll();
        return ResponseEntity.ok(orderitems);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderItem> findById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<OrderItem> save(@RequestBody OrderItem OrderItemToSave){
        OrderItem orderItem = service.save(OrderItemToSave);
        return new ResponseEntity<>(orderItem, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderItem> update(@PathVariable Integer id, @RequestBody OrderItem OrderItemToSave){
        OrderItem orderItem = service.update(OrderItemToSave);
        return ResponseEntity.ok(orderItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
