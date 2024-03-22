package cl.geometriabootcamp.controller.entities;

import cl.geometriabootcamp.controller.Figura;

 public class Circulo extends Figura {

     protected double radioCirculo;
     protected double areaCirculo;

     public Circulo(double radioCirculo) {
         this.radioCirculo = radioCirculo;
     }

     public double getRadioCirculo() {
         return radioCirculo;
     }

     public void setRadioCirculo(double radioCirculo) {
         this.radioCirculo = radioCirculo;
     }

     public double getAreaCirculo() {
         return areaCirculo;
     }

     @Override
     public void calcularArea() {
         this.areaCirculo = Math.PI * Math.pow(radioCirculo,2);
         System.out.println("El área del círculo es: " + getAreaCirculo());
     }
 }
