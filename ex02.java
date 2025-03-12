import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fah = (celsius * 9.0/5.0) + 32;

        System.out.print("A conversão de " + celsius + "º Celsius é de " + fah + "º Fahrenheit.");

        sc.close();
    }
}
