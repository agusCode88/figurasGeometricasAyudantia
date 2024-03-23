package cl.geometriabootcamp.figuras.entities;

import cl.geometriabootcamp.controller.FiguraGeometrica;
import cl.geometriabootcamp.figuras.interfaces.FiguraInterface;

public class Rectangulo extends FiguraGeometrica  {

    /**
     * 1) Atributos de una clase
     *    - variables o constantes
     *    - modificadores de acceso
      */
    protected String nombreFigura;
    protected double largoRectangulo;
    protected double anchoRectangulo;

    protected double areaRectangulo;

    protected  double perimetroRectangulo;

    /**
     * 2) Constructor o constructores de una clase
     *   - Son los encargados de darle vida al objeto en el programa
     */

    public Rectangulo(double largoRectangulo, double anchoRectangulo) {
        this.largoRectangulo = largoRectangulo;
        this.anchoRectangulo = anchoRectangulo;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
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
    public double calcularArea() {
        return this.anchoRectangulo * this.largoRectangulo;
    }

    @Override
    public double obtenerPerimetro() {
        return 0;
    }
    /**
     * 5) Métodos específicos de una clase
     *   - Funcionalidades específicas de la clase.
     */

}
