package cl.geometriabootcamp.figuras.entities.poligonos;

import cl.geometriabootcamp.controller.Calculo;
import cl.geometriabootcamp.controller.Figura;
import cl.geometriabootcamp.figuras.interfaces.FiguraInterface;

public class Cuadrado extends Figura  {

    protected String nombreFigura;
    protected double ladoA;
    protected double ladoB;
    protected double areaCuadrado;
    protected double perimetroCuadrado;
    Calculo calculosFigura;


    public Cuadrado(){
        calculosFigura = new Calculo();
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public void calcularArea() {
        this.areaCuadrado = this.ladoA * this.ladoB;
    }

    public void sumaPerimetro(){
        this.perimetroCuadrado = calculosFigura.sumarPerimetro();
    }

    public void multiplicarArea(){
        this.areaCuadrado =  calculosFigura.multiplicarArea();
    }


}
