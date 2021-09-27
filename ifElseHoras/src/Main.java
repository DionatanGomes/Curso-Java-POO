import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horas;
        System.out.println("Que horas é agora? ");
        horas = sc.nextDouble();
        if (horas >= 6 && horas <= 12) {
            System.out.println("Bom dia !!");
        } else if (horas > 12 && horas < 18) {
            System.out.println("Boa Tarde !!");

        } else {
            System.out.println("Boa noite !!");
        }
        sc.close();
    }
}
