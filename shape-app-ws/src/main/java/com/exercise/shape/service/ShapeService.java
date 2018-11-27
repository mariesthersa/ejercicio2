/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.shape.service;

import com.exercise.shape.model.Shape;
import com.exercise.shape.resource.response.ShapeResponse;
import java.util.Optional;
import com.exercise.shape.repository.ShapeRepository;
import com.exercise.shape.resource.request.ShapeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mariesan
 */
public class ShapeService {
     private ShapeRepository shapeRepository;

    @Autowired
    public ShapeService(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

//    public Shape getByType(String shape){
//        return shapeRepository.findShapeFromType(shape);
//    }

    public Optional<ShapeResponse> getById(Long id) {
        // retorna un objeto Shape y valida si no existe, devolver un valor vacio.
        Optional<Shape> shape = Optional.ofNullable(shapeRepository.findOne(id));
        Optional<ShapeResponse> response = shape.map(s -> Optional.of(toShapeResponse(s)))
                .orElse(Optional.empty());

        return response;
    }
    
    public Optional<ShapeResponse> getByTypeShape(String type) {
        // retorna un objeto Shape y valida si no existe, devolver un valor vacio.
        Optional<Shape> shape = Optional.ofNullable(shapeRepository.findShapeFromType(type));
        Optional<ShapeResponse> response = shape.map(s -> Optional.of(toShapeResponse(s)))
                .orElse(Optional.empty());

        return response;
    }
    

    private ShapeResponse toShapeResponse(Shape shape) {

        return new ShapeResponse(shape.getId(),
                shape.getTypeShape(), shape.getBase(),
                shape.getHeight(), shape.getDiameter(),
                shape.getArea());
    }
    
    @Transactional
    public ShapeResponse saveOrUpdate(ShapeRequest shapeRq){
        
        Shape newShape = new Shape(shapeRq.getTypeShape(), shapeRq.getBase(),shapeRq.getHeight(),shapeRq.getArea(), shapeRq.getDiameter());
        Shape save = shapeRepository.save(newShape);
        ShapeResponse response = toShapeResponse(save);
        return response;
    }
}
