import cl.geometriabootcamp.controller.Figura;
import cl.geometriabootcamp.controller.entities.Circulo;
import cl.geometriabootcamp.controller.entities.Rectangulo;
import cl.geometriabootcamp.controller.entities.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figura> listaFigurasGeometricas = new ArrayList<>();
        ArrayList<Figura> lista2 = new ArrayList<>();
        Figura[] lista3 = new Figura[3];

        Figura triangulo = new Triangulo(5,10);
        Figura circulo = new Circulo(6);
        Figura rectangulo = new Rectangulo(6,6);

        listaFigurasGeometricas.add(triangulo);
        listaFigurasGeometricas.add(circulo);
        listaFigurasGeometricas.add(rectangulo);

        for(Figura figuraGeometrica : listaFigurasGeometricas){
            figuraGeometrica.calcularArea();
        }

    }
}