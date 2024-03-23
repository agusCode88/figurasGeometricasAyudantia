package cl.geometriabootcamp.figuras.entities;

import cl.geometriabootcamp.controller.Figura;
import cl.geometriabootcamp.controller.FiguraGeometrica;
import cl.geometriabootcamp.figuras.interfaces.FiguraInterface;

public class Circulo extends Figura implements FiguraInterface{

     protected String nombreFigura;
     protected double radioCirculo;
     protected double areaCirculo;

     protected  double diametro;

     protected double perimetroCirculo;

     public Circulo(double radioCirculo) {
         this.radioCirculo = radioCirculo;
     }

     public Circulo(){

     }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public double getRadioCirculo() {
         return radioCirculo;
     }

     public void setRadioCirculo(double radioCirculo) {
         this.radioCirculo = radioCirculo;
     }

     public double getDiametro() {
         return diametro;
     }

     public void setDiametro(double diametro) {
         this.diametro = diametro;
     }

     public double getAreaCirculo() {
         return areaCirculo;
     }

    @Override
    public double calcularArea() {
        return Math.PI * radioCirculo * radioCirculo;
    }

    @Override
    public double obtenerPerimetro() {
        return 0;
    }
}
