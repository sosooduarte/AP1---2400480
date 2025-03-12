import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");
        int valor = sc.nextInt();

        int quadrado = valor * valor;
        int cubo = quadrado * valor;

        System.out.print("O quadrado de " + valor + " é igual a " + quadrado + ", e o seu valor ao cubo é igual a " + cubo);

        sc.close();
    }
}
