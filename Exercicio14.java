import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o 1o numero: ");
        double num1 = leia.nextDouble();
        System.out.print("Digite o 2o numero: ");
        double num2 = leia.nextDouble();
        System.out.print("Digite o 3o numero: ");
        double num3 = leia.nextDouble();
        double maior=(num1>num2 && num1>num3)?num1:(num2>num3 && num2>num1)?num2:(num3>num1 && num3>num2)?num3:0;
        if (num1==num2 && num1==num3) {
            System.out.println("Todos os números são iguais.");
        } else if (num1 ==num2) {
            System.out.println("O primeiro e o segundo número são iguais.");
        } else if (num1==num3) {
            System.out.println("o primeiro e o terceiro número são iguais.");
        } else if (num2==num3) {
            System.out.println("O segundo e o terceiro número são iguais.");
        }
        System.out.println("O maior número é: " + maior);
        leia.close();
    }
}