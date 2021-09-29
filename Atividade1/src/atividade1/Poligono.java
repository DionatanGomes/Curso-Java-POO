package atividade1;
public abstract class Poligono {
    protected double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    

    

    
    
    public abstract void calcularArea();
    public abstract void exibirLado();

       
}
