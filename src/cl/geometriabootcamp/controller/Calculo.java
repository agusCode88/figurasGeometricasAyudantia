package cl.geometriabootcamp.controller;

import java.util.Scanner;

public class Calculo {

    private double areaMultiplicada;
    private  double perimetroMultiplicado;

    public double multiplicarArea(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número que quiere multiplicar el área: ");
        double valorUsuario = scanner.nextInt();

        return this.areaMultiplicada *= valorUsuario;

    }

    public double sumarPerimetro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número que quiere sumar el perímetro: ");
        double valorUsuario = scanner.nextInt();

        return this.perimetroMultiplicado += valorUsuario;
    }
}
