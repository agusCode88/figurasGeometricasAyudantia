package cl.geometriabootcamp.controller.entities;

import cl.geometriabootcamp.controller.Figura;

public class Rectangulo extends Figura {

    /**
     * 1) Atributos de una clase
     *    - variables o constantes
     *    - modificadores de acceso
      */

    protected double largoRectangulo;
    protected double anchoRectangulo;

    protected double areaRectangulo;

    /**
     * 2) Constructor o constructores de una clase
     *   - Son los encargados de darle vida al objeto en el programa
     */

    public Rectangulo(double largoRectangulo, double anchoRectangulo) {
        this.largoRectangulo = largoRectangulo;
        this.anchoRectangulo = anchoRectangulo;
    }

    /**
     * 3) Métodos de Acceso a las variables
     */

    public double getLargoRectangulo() {
        return largoRectangulo;
    }

    public void setLargoRectangulo(double largoRectangulo) {
        this.largoRectangulo = largoRectangulo;
    }

    public double getAnchoRectangulo() {
        return anchoRectangulo;
    }

    public void setAnchoRectangulo(double anchoRectangulo) {
        this.anchoRectangulo = anchoRectangulo;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    public void setAreaRectangulo(double areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
    }

    /**
     * 4) Comportamiento de una clase
     *   - Métodos heredados de una clase
     */

    @Override
    public void calcularArea() {
        this.areaRectangulo = this.anchoRectangulo * this.largoRectangulo;
        System.out.println("El área del rectángulo es: " + getAreaRectangulo() );
    }

    /**
     * 5) Métodos específicos de una clase
     *   - Funcionalidades específicas de la clase.
     */

}
