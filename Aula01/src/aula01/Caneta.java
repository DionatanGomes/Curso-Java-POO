
package aula01;


public class Caneta {
    String modelo;
    String  cor;
    float ponta;
    int carga;
    boolean tampa;
    void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Caneta está tampada? "+ this.tampa);
    }
    void rabiscar(){
        if(this.tampa == true){
            System.out.println("Erro !! não posso rabiscar !! ");
        }else{
            System.out.println("Rabiscando ");
        }
    }
    void tampar(){
        this.tampa = true;
    }
    void destampar(){
        this.tampa = false;
    }
}
