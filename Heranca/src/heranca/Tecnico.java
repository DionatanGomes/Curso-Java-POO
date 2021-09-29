
package heranca;

public class Tecnico extends Aluno{
    private String resgProf;
    
    public void praticar(){
        System.out.println("Aluno está praticando " + this.getNome());
    }

    public Tecnico(String resgProf, int matricula, String curso, String nome, int idade, String sexo) {
        super(matricula, curso, nome, idade, sexo);
        this.resgProf = resgProf;
    }

    
    
    public String getResgProf() {
        return resgProf;
    }

    public void setResgProf(String resgProf) {
        this.resgProf = resgProf;
    }

    @Override
    public void exibe() {
        System.out.println("Tecnico: "+"Registro: "+ this.getResgProf()+ 
                " Matricula: "+this.getMatricula()+" Curso: "+this.getCurso()+
                " Nome: "+this.getNome()+" Idade: "+this.getIdade()+ " anos "+
                " Sexo: "+this.getSexo());
    }
    
    
}
