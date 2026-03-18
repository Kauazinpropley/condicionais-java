import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner feijaocomFarinha = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int numero = feijaocomFarinha.nextInt();
        String resultado=(numero % 2 == 0)? "Par":"Ímpar";
        System.out.println("O número é: " + resultado);
        feijaocomFarinha.close();
    }
}

        