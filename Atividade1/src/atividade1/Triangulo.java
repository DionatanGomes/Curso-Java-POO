
package atividade1;

import java.util.Scanner;

public class Triangulo extends Poligono {
private double  area, altura;
Scanner t = new Scanner(System.in);

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

    
    public Scanner getT() {
        return t;
    }

    public void setT(Scanner t) {
        this.t = t;
    }

    @Override
    public void exibirLado() {
        System.out.println("Lados do triangulo!!");
        int l = 3;
        System.out.println("São: "+ l+ " lados");
    }

    @Override
    public void calcularArea() {
        
        System.out.println("------ Área do Triangulo --------");
        System.out.println("Digite medida da base?");
        this.lado = t.nextDouble();
        System.out.println("Digite a medida da altura?");
        this.altura = t.nextDouble();
        this.area = (this.lado*this.altura)/2;
        System.out.println("Área total do triangulo: "+this.area);
        System.out.println("----------------------------------------------------");
    }

      
    
}
