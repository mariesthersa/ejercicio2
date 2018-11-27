/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.geometricshapeapp;

import ar.com.geometricshapeapp.model.Circle;
import ar.com.geometricshapeapp.model.Shape;
import ar.com.geometricshapeapp.model.ShapeCreator;
import ar.com.geometricshapeapp.model.Triangle;

/**
 *
 * @author mariesan
 */
public  class ShapeFactory extends ShapeCreator{
      private static ShapeFactory instance;  
    private ShapeFactory() {
    
    }
    
    public static ShapeFactory getInstance(){
        if(instance == null){
            instance = new ShapeFactory();
        }
        return instance;
    }
    
    
    @Override
    public Shape createShape(String shapeSelected, double value1, double value2){
       
        switch(shapeSelected.toUpperCase()){
            case "TRIANGULO":
                 return new Triangle(value1, value2);
            case "CIRCULO":
                return new Circle(value1);
            default:
                    return  null; 
                
    }
          
       
}
    
}
