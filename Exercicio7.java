import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.print("Digite o tamanho do lado 1 do triangulo: ");
        double a=leia.nextDouble();
        System.out.print("Digite o tamanho do lado 2 do triangulo: ");
        double b=leia.nextDouble();
        System.out.print("Digite o tamanho do lado 3 do triangulo: ");
        double c=leia.nextDouble();
        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("Os lados formam um triangulo");
        } else {
            System.out.println("Os lados não formam um triangulo");
            leia.close();
        }
        if (a==b && b==c) {
            System.out.println("O triangulo é equilatero");
        } else if (a==b || a==c || b==c) {
            System.out.println("O triangulo é isosceles");
        } else {
            System.out.println("O triangulo é escaleno");
        }
        
    }
}
