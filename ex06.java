import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de 'a': ");
        int numA = sc.nextInt();

        System.out.print("Digite o valor de 'b': ");
        int numB = sc.nextInt();

        System.out.print("Digite o valor de 'c': ");
        int numC = sc.nextInt();

        int delta = (numB * numB) - 4 * numA * numC;

        System.out.print("O valor de delta é: " + delta);

        sc.close();
    }
}
