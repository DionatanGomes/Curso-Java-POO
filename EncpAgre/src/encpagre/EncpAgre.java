
package encpagre;

public class EncpAgre {

    public static void main(String[] args) {
       Pessoa []p = new Pessoa [2];
       p[0] =  new Pessoa("Pedro",25,"M");
       p[1] = new Pessoa("Maria",30,"F");
       p[0].status();
       p[0].fazerAniver();
       p[1].status();
       p[1].fazerAniver();
       
       Livro l[] = new Livro[3];
       l[0] = new Livro ("50Tons","Dion",550,250,p[0]);
       l[1] = new Livro ("Java2020","Dion",600,100,p[1]);
       l[2] = new Livro ("Matrix","Dion",850,50,p[1]);
       
       l[0].abrir();
       l[0].detalhes();
       l[0].folhear(500);
       l[0].avancarPag();
       
       l[1].abrir();
       l[1].detalhes();
       l[1].folhear(350);
       l[1].voltarPag();
       
    }
    
    
}
