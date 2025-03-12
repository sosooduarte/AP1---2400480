import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        int base = sc.nextInt();

        System.out.print("Digite o valor da altura do triângulo: ");
        int altura = sc.nextInt();

        int area = base * altura/2;

        System.out.print("A área do triângulo de base " + base + " e altura " + altura + " é igual a " + area);


        sc.close();
    }
}
