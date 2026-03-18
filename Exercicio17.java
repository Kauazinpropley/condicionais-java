import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        double valor=leia.nextDouble();
        if (valor>=500) {
            double porcentagem=valor*20/100;
            double resultado=valor-porcentagem;
            System.out.printf("o valor finall da compra é %.2f",resultado);
        }
        if (valor>=200 && valor<=500) {
            double porcentagem=valor*10/100;
            double resultado=valor-porcentagem;
            System.out.printf("o valor finall da compra é %.2f",resultado);
        }
        if (valor<200) {
            System.out.printf("o valor finall da compra é %.2f",valor);
        }
        leia.close();
    }
}
