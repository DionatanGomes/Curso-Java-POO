
package aula01;


public class Aula01 {

   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Big";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        System.out.println(" ");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Big";
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.carga = 90;
        c2.tampar();
        c2.status();
        c2.rabiscar();
        System.out.println(" ");
        
        Caneta c3 = new Caneta();
        c3.modelo = "Big";
        c3.cor = "Vermelho";
        c3.ponta = 1.5f;
        c3.carga = 50;
        c3.destampar();
        c3.status();
        c3.rabiscar();
        System.out.println(" ");
        
        Livro li1 = new Livro();
        li1.editora = "Brasil";
        li1.nome = "Java 2020";
        li1.pagina = 750;
        li1.valor = 350.00f;
        li1.aberto();
        li1.status();
        li1.lendo();
        System.out.println(" ");
        
        Estudando est1 = new Estudando();
        est1.livro = "Java 2020";
        est1.aberto();
        est1.status();
        est1.lendo();
        
        
        
        
        
        
    }
    
}
