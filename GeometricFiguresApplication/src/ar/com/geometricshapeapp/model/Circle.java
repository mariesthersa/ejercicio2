/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.geometricshapeapp.model;

/**
 *
 * @author mariesan
 */
public class Circle implements Shape{
    private Double value1;

    public Circle(Double valor1) {
        this.value1 = valor1;
    }
    
    
    @Override
    public String getDescription() {
        return  "Soy un Circulo";
    }

    @Override
    public Double getArea() {
        return Math.PI*Math.pow(this.value1, 2);
    }



    @Override
    public Double getDiameter() {
        return this.value1*2;
    }
    
}
