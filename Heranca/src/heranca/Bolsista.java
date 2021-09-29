
package heranca;

public class Bolsista extends Aluno{
    private int bolsa;
    
    public void renovarBolsa(){
        System.out.println("Aluno renovando a bolsa "+this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista da desconto 50% ");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsista(int bolsa, int matricula, String curso, String nome, int idade, String sexo) {
        super(matricula, curso, nome, idade, sexo);
        this.bolsa = bolsa;
    }

    @Override
    public void exibe() {
        System.out.println("Bolsista: "+ " Bolsa: "+this.getBolsa()+" Matricula: "
        + this.getMatricula()+" Curso: "+this.getCurso()+" Nome: "+this.getNome()
        + " Idade: "+this.getIdade()+" anos "+" Sexos: "+this.getSexo());
        System.out.println(" ");
    }
    
    
}
