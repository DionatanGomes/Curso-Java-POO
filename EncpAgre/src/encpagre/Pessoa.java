
package encpagre;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    public void fazerAniver(){
        this.setIdade(this.getIdade()+1);
        System.out.println("-------------------------------------------------------");
        System.out.println("Parabéns " + this.getNome()+ " hoje seu aniversário "+
                             this.getIdade()+" anos" );
        System.out.println("-------------------------------------------------------");
    }
    public void status(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Nome: "+ this.getNome()+ " Sexo: "+ this.getSexo());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("-------------------------------------------------------");
    }
}