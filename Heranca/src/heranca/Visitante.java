
package heranca;

public class Visitante extends Pessoa {

    public Visitante(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    @Override
     public void exibe(){
         System.out.println("Visitante: "+"Nome: "+this.getNome()+ " Idade: "+ this.getIdade()+ " Sexos: "+this.getSexo());
         System.out.println(" ");
     }
}
