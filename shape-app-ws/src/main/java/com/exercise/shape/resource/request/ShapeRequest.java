/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.shape.resource.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author mariesan
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShapeRequest {
    @JsonProperty("id")
    private Long id;

    @NotNull
    @NotEmpty
    @JsonProperty("typeShape")
    private String typeShape;

    @NotNull
    @JsonProperty("base")
    private Double base;

    @NotNull
    @JsonProperty("height")
    private Double height;

    
    @JsonProperty("diameter")
    private Double diameter;

    
    @JsonProperty("area")
    private Double area;

    public ShapeRequest() {
    }


    @JsonCreator
    public ShapeRequest(@JsonProperty("id") Long id,
                        @JsonProperty("typeShape") String typeShape,
                        @JsonProperty("base") Double base,
                        @JsonProperty("diameter") Double diameter,
                        @JsonProperty("area") Double area
    ) {
        this.id = id;
        this.typeShape = typeShape;
        this.base = base;
        this.height = height;
        this.diameter = diameter;
        this.area = area;

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
