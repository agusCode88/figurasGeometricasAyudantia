package cl.geometriabootcamp.figuras.entities.poligonos;

import cl.geometriabootcamp.controller.Calculo;
import cl.geometriabootcamp.controller.FiguraGeometrica;
import cl.geometriabootcamp.figuras.interfaces.FiguraInterface;

public class Triangulo extends FiguraGeometrica{

    protected String nombreFigura;
    protected double baseTriangulo;
    protected double alturaTriangulo;
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;
    protected double areaTriangulo;
    protected  double perimetroTriangulo;
    protected double sumaAreaTriangulo;
    protected  double sumaPerimetroTriangulo;

    Calculo calculosFigura;


    public Triangulo(double baseTriangulo, double alturaTriangulo) {
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }

    public Triangulo(){
        calculosFigura = new Calculo();
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
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

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public void calcularArea() {
        this.areaTriangulo = (this.baseTriangulo * this.alturaTriangulo) / 2;
        System.out.println("El área del triangulo es: " + getAreaTriangulo());
    }

    @Override
    public void obtenerNombre() {
        System.out.println("Soy un: " + getNombreFigura());
    }

    @Override
    public void calcularPerimetro() {
        this.perimetroTriangulo = this.ladoA + this.ladoB + this.ladoC;
        System.out.println("El perímetro del triangulo es: " + this.perimetroTriangulo );
    }

    public void sumarPerimetroTriangulo(){
       this.sumaPerimetroTriangulo = calculosFigura.sumarPerimetro();
    }

    public void multiplicarAreaTriangulo(){
        this.sumaAreaTriangulo = calculosFigura.multiplicarArea();
    }
}
