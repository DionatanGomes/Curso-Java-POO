
package heranca;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Aluno pagando mensalidade: "+ this.getNome());
    }

    public Aluno(int matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void exibe(){
        System.out.println("Aluno: "+" Mátricula: " + this.getMatricula() + " Curso: "+ this.getCurso() 
                                            +  " Nome: " + this.getNome()+ " Idade: " + this.getIdade()+" anos " + " Sexos: " + this.getSexo());
        System.out.println(" ");
    }
}
