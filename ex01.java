import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fah = sc.nextDouble();

        double celsius = (5.0/9.0) * (fah - 32);

        System.out.print("A conversão de " + fah + "º Fahrenheit é igual a " + celsius + "º Celsius.");

        sc.close();
    }
}
