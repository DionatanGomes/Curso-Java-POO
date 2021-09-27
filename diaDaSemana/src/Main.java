import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Dia da semana !!");
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda Feira";
                break;
            case 3:
                dia = "Terça Feira";
                break;
            case 4:
                dia = "Quarta Feira";
                break;
            case 5:
                dia = "Quinta Feira";
                break;
            case 6:
                dia = "Sexta Feira";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Invalido";
                break;


        }
        System.out.println("Dia da semana: " +dia);
        sc.close();
    }
}
