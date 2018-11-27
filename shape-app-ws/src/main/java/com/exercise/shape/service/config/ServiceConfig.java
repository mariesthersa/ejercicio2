/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.shape.service.config;


import com.exercise.shape.repository.ShapeRepository;
import com.exercise.shape.service.ShapeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mariesan
 */
@Configuration
public class ServiceConfig {

    @Bean
    public ShapeService shapeService(ShapeRepository shapeRepository) {
        return new ShapeService(shapeRepository);
    }
}
