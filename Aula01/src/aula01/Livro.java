
package aula01;


public class Livro {
    String nome;
    String editora;
    int pagina;
    float valor;
    boolean aberto;
    void status(){
        System.out.println("A editora é: "+ this.editora);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Paginas: "+ this.pagina);
        System.out.println("Valor: "+ this.valor);
        System.out.println("Está aberto? "+ this.aberto);
    }
    void lendo (){
        if(this.aberto == true){
            System.out.println("Estou lendo o livro!!");
        }else{
            System.out.println("Erro!! não posso ler o livro !! ");
        }
    }
    void aberto(){
        this.aberto = true;
    }
    void fechado(){
        this.aberto = false;
    }
}
