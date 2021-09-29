package polimofi;
public class Cachorro extends Mamifero{
    private String corPele;
    
    
    @Override
    public void emitirSom() {
        System.out.println("Au Au AuAu");
    }
    public void reagir(String frase){
        if(frase.equals("Olá") || frase.equals("Cheguei") || frase.equals("Te amo")){
        System.out.println("Abana o rabo ");
    }else{
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int hora){
        if (hora < 12) {
            System.out.println("Abanar"); 
        } else if(hora >= 18) {
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if(dono = true){
            System.out.println("Abanar ");
        }else{
            System.out.println("Rosnar");
        }
        
    }
}
