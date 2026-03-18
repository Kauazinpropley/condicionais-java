import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double numero1=leia.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double numero2=leia.nextDouble();
        System.out.print("Digite o operador: +,-,x ou / ");
        String operador=leia.next();

         switch (operador) {
            case "+":
            System.out.printf("%.2f + %.2f = %.2f",numero1,numero2,numero1+numero2);
                break;
            case "-":
            System.out.printf("%.2f - %.2f = %.2f",numero1,numero2,numero1-numero2);
                break;
            case "x":
            System.out.printf("%.2f x %.2f = %.2f",numero1,numero2,numero1*numero2);
                break;
            case "/":
            System.out.printf("%.2f / %.2f = %.2f",numero1,numero2,numero1/numero2);
                break;
         
            
         }
            leia.close();
    }
}
