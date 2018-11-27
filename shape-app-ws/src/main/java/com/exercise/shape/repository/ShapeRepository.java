/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.shape.repository;


import com.exercise.shape.model.Shape;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author mariesan
 */

public interface ShapeRepository extends CrudRepository<Shape, Long> {

@Query("select s from Shape s where s.typeShape = :shape")
Shape findShapeFromType(@Param("shape") String shape);
}
