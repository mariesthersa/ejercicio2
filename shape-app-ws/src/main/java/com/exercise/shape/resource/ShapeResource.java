/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.shape.resource;



import com.exercise.shape.resource.request.ShapeRequest;
import com.exercise.shape.resource.response.ShapeResponse;
import com.exercise.shape.service.ShapeService;
import java.util.Optional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mariesan
 */
@RestController
public class ShapeResource {

    private ShapeService shapeService;

    @Autowired
    public ShapeResource(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

//    @GetMapping(value = "/shape/{id}", produces = "application/json")
//    public @ResponseBody ResponseEntity<?> getById(@PathVariable("id") Long id) {
//        Optional<ShapeResponse> shapeResponse = shapeService.getById(id);
//        if (shapeResponse.isPresent()) {
//            return ResponseEntity.ok(shapeResponse.get());
//        } else {
//            return ResponseEntity.badRequest().contentType(MediaType.TEXT_PLAIN).body("La figura no existe");
//        }
//    }
    
    @GetMapping(value = "/shape/{type}", produces = "application/json")
    public @ResponseBody ResponseEntity<?> getByTypeShape(@PathVariable("type") String type) {
        Optional<ShapeResponse> shapeResponse = shapeService.getByTypeShape(type);
        if (shapeResponse.isPresent()) {
            return ResponseEntity.ok(shapeResponse.get());
        } else {
            return ResponseEntity.badRequest().contentType(MediaType.TEXT_PLAIN).body("La figura no existe, por favor registrela");
        }
    }
    
    @PostMapping(value="/shape", produces = "application/json"  , consumes = "application/json")
    public ResponseEntity<?> saveShape(@RequestBody @Valid ShapeRequest shapeRequest){
        ShapeResponse shapeResponse = shapeService.saveOrUpdate(shapeRequest);
        
        return ResponseEntity.ok(shapeResponse);
    }

}
