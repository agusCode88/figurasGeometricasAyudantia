# figurasGeometricasAyudantia

Declaración de una clase abstracta Figura:

## 1) Declararemos una clase abstracta <strong>Figura</strong> con un método abstracto calcularArea().
    -Crearemos las subclases Rectangulo, Triangulo y Circulo que extienden de Figura e implementan el método calcularArea().
    -Mostramos los resultados por pantalla.
   
## 2) Implementaremos una interface Figura con un método obtenerPerimetro():
    -Crearemos una interfaz Figura con un método obtenerArea().
    -Las clases Circulo y Rectangulo implementan esta interfaz y el método correspondiente.
    -Crearemos varias instancias de diferentes figuras y las agregamos a una lista.
    -Recorremos la lista y ejecutamos el método obtenerArea() para cada figura.

## 3) Desarrollo de algoritmos para calcular el área de polígonos:

    -Creamos clases para representar los polígonos Cuadrado y Pentágono.
    -Implementaremos métodos para imprimir el polígono, multiplicar área y sumar área.
    -Mantenemos la responsabilidad de cada clase (Principio de Responsabilidad única)

## 4) Refactorización para incluir un Triangulo:

    -Crearemos una clase Cálculo para realizar los cálculos de multiplicar área y sumar área.
    -Modificaremos el diseño de software para permitir añadir nuevos tipos de polígonos sin modificar las clases existentes.
    
## 5) Diseño de una jerarquía de clases que cumpla con el Principio de Liskov:

     -Crearemos una clase base abstracta FiguraGeometrica con métodos abstractos calcularArea() y obtenerNombre().
     -Vamos a heredar las clases concretas Circulo, Rectangulo y Triangulo de FiguraGeometrica.
     -En el main, crearemos instancias de objetos de cada subclase y calcularemos el área de cada figura utilizando el método calcularArea() y mostraremos el nombre 
      utilizando obtenerNombre(). 
      Utilizaremos polimorfismo para ello.
      
## 6) Modificación de la clase Geometria:

     -Cambiaremos la dependencia directa de Geometria hacia Figura por una dependencia hacia una interfaz FiguraGeometrica.
