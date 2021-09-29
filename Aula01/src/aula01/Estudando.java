
package aula01;


public class Estudando {
    String livro;
    
    boolean aberto;
    
    void status(){
        System.out.println("Livro de estudo: "+ this.livro);
        
        
    }
    
    void lendo(){
        if(this.aberto == true){
            System.out.println("Lendo e estudando o livro !!");
        }else{
            System.out.println("Erro !! não consigo ler e estudar com livro fechado!! ");
        }
    }
     void aberto(){
        this.aberto = true;
     }
     void fechado(){
         this.aberto = false;
     }
    
}      
    

