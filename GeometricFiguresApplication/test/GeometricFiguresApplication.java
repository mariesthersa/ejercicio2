
import ar.com.geometricshapeapp.ShapeFactory;
import ar.com.geometricshapeapp.model.ShapeCreator;
import ar.com.geometricshapeapp.model.Shape;
import ar.com.geometricshapeapp.model.Triangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author mariesan
 */
public class GeometricFiguresApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Shape shapeSelected1 = ShapeFactory.getInstance().createShape("triAngulo", 0, 0);
       Shape shapeSelected2 = ShapeFactory.getInstance().createShape("ciculo", 0, 0);
       try{
                System.out.println(shapeSelected1.getDescription());
                System.out.println(shapeSelected1.getDiameter()); 
          } catch (NullPointerException e) {
                System.out.println("La figura no existe");
            }
     
        
    }
    
}
