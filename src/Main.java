import cl.geometriabootcamp.controller.FiguraGeometrica;
import cl.geometriabootcamp.controller.Figura;
import cl.geometriabootcamp.figuras.entities.Circulo;
import cl.geometriabootcamp.figuras.entities.Rectangulo;
import cl.geometriabootcamp.figuras.entities.poligonos.Cuadrado;
import cl.geometriabootcamp.figuras.entities.poligonos.Triangulo;
import cl.geometriabootcamp.figuras.interfaces.FiguraInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(5, 3);
        Circulo circulo = new Circulo(4);

        //1) Calcular y mostrar área de Rectangulo y Circulo
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del Círculo: " + circulo.calcularArea());

        // 2) Implementación de una interfaz FiguraInterface
        List<FiguraInterface> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(5, 3));
        figuras.add(new Circulo(4));

        // Calcular y mostrar perímetro de Rectangulo y Circulo
        for (FiguraInterface figura : figuras) {
            System.out.println("Perímetro: " + figura.obtenerPerimetro());
        }

        // 3) Desarrollo de algoritmos para calcular el área de polígonos
        Cuadrado cuadrado = new Cuadrado(4);
        Triangulo triangulo = new Triangulo(6, 4);

        // Calcular y mostrar área de Cuadrado y Triángulo
        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());

        // 4) Refactorización para incluir un Triangulo
        double area1 = 24;
        double area2 = 18;
        System.out.println("Multiplicación de áreas: " + Calculo.multiplicarArea(area1, area2));
        System.out.println("Suma de áreas: " + Calculo.sumarArea(area1, area2));

        // 5) Diseño de una jerarquía de clases que cumpla con el Principio de Liskov
        List<FiguraGeometrica> figurasGeometricas = new ArrayList<>();
        figurasGeometricas.add(new Rectangulo(5, 3));
        figurasGeometricas.add(new Circulo(4));
        figurasGeometricas.add(new Triangulo(6, 4));

        // Calcular y mostrar área y nombre de cada figura
        for (FiguraGeometrica figura : figurasGeometricas) {
            System.out.println("Área de " + figura.obtenerNombre() + ": " + figura.calcularArea());
        }
    }


    }
}