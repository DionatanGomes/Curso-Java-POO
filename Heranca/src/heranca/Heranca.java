
package heranca;

public class Heranca {

    public static void main(String[] args) {
        Visitante [] v = new Visitante [2];
        Aluno [] a = new Aluno [3];
        Bolsista [] b = new Bolsista [4];
        Tecnico [] t = new Tecnico [2];
        Professor [] p = new Professor[2];
                
        v[0] = new Visitante("Maria", 35,"F");
        v[1] = new Visitante("João",45,"M");
        
        a[0] = new Aluno(111,"Programação","Aline",26,"F");
        a[1] = new Aluno(112,"Programação","Fernando",22,"M");
        a[2] = new Aluno (123,"Programação","Marcos",35,"M");
        
        b[0] = new Bolsista(1,124,"Programação","Dionatan",27,"M");
        b[1] = new Bolsista(2,125,"Programação","Daniele",22,"F");
        b[2] = new Bolsista(3,126,"Programação","Lorena",18,"F");
        b[3] = new Bolsista(4,127,"Programação","Diogo",18,"M");
        
        t[0] = new Tecnico("01T",128,"Informatica","Jose",40,"M");
        t[1] = new Tecnico("02T",129,"Informatica","Silvana",33,"F");
        
        p[0] = new Professor("Programação Java",8.500,"Guanabara",35,"M");
        p[1] = new Professor("Informatica Basica",2.500,"Noel",40,"M");
        
        v[0].fazerAniver();
        v[0].exibe();
        v[1].exibe();
        
        a[0].pagarMensalidade();
        a[0].exibe();
        a[1].pagarMensalidade();
        a[1].exibe();
        a[2].exibe();
        
        b[0].renovarBolsa();
        b[0].pagarMensalidade();
        b[0].exibe();
        b[1].exibe();
        b[2].exibe();
        b[3].exibe();
        
        t[0].praticar();
        t[0].exibe();
        t[1].exibe();
        
        p[0].receberAum(3.500);
        p[0].exibe();
        
        p[1].exibe();
    }
    
}
