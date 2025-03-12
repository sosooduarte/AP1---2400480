import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em KG: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura em METROS: ");
        double altura = sc.nextDouble();

        double imc = peso/(altura * altura);

        System.out.print("O seu IMC é de: " + imc);


        sc.close();
    }
}
