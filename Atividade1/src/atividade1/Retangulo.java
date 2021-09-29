package atividade1;

import java.util.Scanner;

public class Retangulo extends Poligono{
    private double altura, area;
    Scanner t = new Scanner(System.in);

    public Scanner getT() {
        return t;
    }

    public void setT(Scanner t) {
        this.t = t;
    }

    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    

    @Override
    public void exibirLado() {
        System.out.println("Lados do retangulo!!");
        int l = 4;
        System.out.println("São: "+ l +" lados");
    }
    
    @Override
    public void calcularArea() {
        System.out.println("------- Retangulo --------");
        System.out.println("Digite a base?");
        this.lado = t.nextDouble();
        System.out.println("Digite a altura?");
        this.altura = t.nextDouble();
        area = this.lado* this.altura;
        System.out.println("Área total do retangulo: "+ this.area);
        System.out.println("----------------------------------------------------");
    }

    
    
    
}
