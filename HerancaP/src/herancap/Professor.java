
package herancap;

public class Professor extends Pessoa{
    private String espe;
    private double salario;

    
    
    public String getEspe() {
        return espe;
    }

    public void setEspe(String espe) {
        this.espe = espe;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    public void receberAum(double aum){
        this.salario += aum;
    }
}
