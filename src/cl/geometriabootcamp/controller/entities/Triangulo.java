package cl.geometriabootcamp.controller.entities;

import cl.geometriabootcamp.controller.Figura;

public class Triangulo extends Figura {

    protected double baseTriangulo;
    protected double alturaTriangulo;
    protected double areaTriangulo;

    public Triangulo(double baseTriangulo, double alturaTriangulo) {
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }

    public double getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(double baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public double getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setAlturaTriangulo(double alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    @Override
    public void calcularArea() {
        this.areaTriangulo = (this.baseTriangulo * this.alturaTriangulo) / 2;
        System.out.println("El área del triangulo es: " + getAreaTriangulo());
    }
}
