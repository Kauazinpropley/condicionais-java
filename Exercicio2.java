import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in); 
        System.out.print("Digite o primeiro numero: ");
        double a=leia.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double b=leia.nextDouble();
        double maior = (a > b) ? a : b;
        System.out.println("O maior é: " + maior);
        leia.close();
    }
}
