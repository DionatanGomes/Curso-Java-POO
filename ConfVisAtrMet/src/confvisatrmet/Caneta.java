/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confvisatrmet;

/**
 *
 * @author Dion2020
 */
public class Caneta {
    public String modelo;
    public String  cor;
    private float ponta;
    protected int carga;
    private boolean tampa;
   
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Caneta está tampada? "+ this.tampa);
    }
   public void rabiscar(){
        if(this.tampa == true){
            System.out.println("Erro !! não posso rabiscar !! ");
        }else{
            System.out.println("Rabiscando ");
        }
    }
  //tava  protected mais tampa é private//
   public void tampar(){
        this.tampa = true;
    }
   public void destampar(){
        this.tampa = false;
    }
}
