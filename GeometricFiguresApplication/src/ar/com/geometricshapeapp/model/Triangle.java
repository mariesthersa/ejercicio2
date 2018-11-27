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
public class Triangle implements Shape{
    private Double value2;
    private Double value1;
    
    public Triangle(Double valor1, Double valor2) {
        this.value1= valor1;
        this.value2= valor2;
    }

    public Double getValor2() {
        return value2;
    }

    public void setValor2(Double valor2) {
        this.value2 = valor2;
    }

    @Override
    public String getDescription() {
     return "Soy un Triangulo";
       
    }

    @Override
    public Double getArea() {
        return (this.value1*this.value2);
    }


    @Override
    public Double getDiameter() {
        return null;
    }

   

   
}
