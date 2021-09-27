import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+ Plano Telefonia Brasil");
        System.out.println("+ Plano 100 minuto por mês 50,00");
        System.out.println("+ Ser passa dos 100 minutos será cobrado 2,00 por minutos");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        int minutos;
        System.out.println("Digite quantos minutos uso no mês: ");
        minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();
    }
}
