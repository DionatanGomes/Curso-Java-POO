package polimofi;
public class PoliMOfi {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Tilapa h = new Tilapa();
        Arara g = new Arara();
        c.alimentar();
        c.locomover();
        c.usarBolsa();
        k.locomover();
        k.alimentar();
        k.emitirSom();
        j.locomover();
        j.alimentar();
        k.reagir("Olá");
        k.reagir(true);
        k.reagir(14);
    }
    
}
