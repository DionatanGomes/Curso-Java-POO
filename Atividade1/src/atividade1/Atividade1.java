package atividade1;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        Retangulo r = new Retangulo();
        int n = 0;
        String resp;
        do{
        Scanner tec = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("Selecione o Poligono");
        System.out.println("----------------------------------------------------");
        System.out.println("------------ Triangulo = 1 -------------------------");
        System.out.println("------------ Retangulo = 2 -------------------------");
        n = tec.nextInt();
        switch(n){
            case 1:
              t.exibirLado();
              t.calcularArea(); 
                    break;
            case 2:
             r.exibirLado();
             r.calcularArea();
             break;
        }System.out.println("Quer continua [S/N]");
            resp = tec.next();
        }while(resp.equals("S"));   
        
          
        
                

       
    }
    
}
