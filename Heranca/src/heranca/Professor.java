
package heranca;


public class Professor extends Pessoa{
    private String especialidade;
    private double salario;
    
    public void receberAum(double aum){
        this.salario += aum;
    }

    public Professor(String especialidade, double salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibe() {
        System.out.println("Especialidade "+this.getEspecialidade()+" Salario: "
        +this.getSalario() +  " Nome: " + this.getNome()+ " Idade: " + this.getIdade()+" anos " + " Sexos: " + this.getSexo());
        
        
    }
    
    
}
