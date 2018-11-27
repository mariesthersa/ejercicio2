/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.shape.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author mariesan
 */
@Entity
@Table(name = "shape")
public class Shape implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TYPE_SHAPE")
    private String typeShape;
    @Column(name = "BASE")
    private Double base;
    @Column(name = "HEIGHT")
    private Double height;
    @Column(name = "DIAMETER")
    private Double diameter;
    //AREA
    private Double area;

    public Shape() {
    }

    public Shape(String typeShape, Double base, Double height, Double diameter, Double area) {
        this.typeShape = typeShape;
        this.base = base;
        this.height = height;
        this.diameter = diameter;
        this.area = area;
    }

    public Shape(Long id, String typeShape, Double base, Double height, Double diameter, Double area) {
        this.id = id;
        this.typeShape = typeShape;
        this.base = base;
        this.height = height;
        this.diameter = diameter;
        this.area = area;
    }

    public Shape(String typeShape, Double base, Double height) {
        this.typeShape = typeShape;
        this.base = base;
        this.height = height;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeShape() {
        return typeShape;
    }

    public void setTypeShape(String typeShape) {
        this.typeShape = typeShape;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    
    public Double getArea() {
        return area;
    }

  
    public void setArea(Double area) {
        
            this.area = area;
        
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("id=").append(id);
        sb.append(", typeShape=").append(typeShape).append('\'');
        sb.append(", base=").append(base);
        sb.append(", height=").append(height);
        sb.append("}");
        return sb.toString();
    }

}
