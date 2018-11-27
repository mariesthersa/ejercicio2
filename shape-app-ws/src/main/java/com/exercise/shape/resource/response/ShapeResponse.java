/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.shape.resource.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author mariesan
 */
public class ShapeResponse {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("typeShape")
    private String typeShape;
    @JsonProperty("base")
    private Double base;
    @JsonProperty("height")
    private Double height;
    @JsonProperty("diameter")
    private Double diameter;
    @JsonProperty("area")
    private Double area;

    public ShapeResponse(Long id, String typeShape, Double base, Double height, Double diameter, Double area) {
        this.id = id;
        this.typeShape = typeShape;
        this.base = base;
        this.height = height;
        this.diameter = diameter;
        this.area = area;
    }

    public ShapeResponse() {
    }

    public Long getId() {
        return id;
    }

    public String getTypeShape() {
        return typeShape;
    }

    public Double getBase() {
        return base;
    }

    public Double getHeight() {
        return height;
    }

    public Double getDiameter() {
        return diameter;
    }

    public Double getArea() {
        return area;
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
