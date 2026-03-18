import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.print("Escreva um número");
        double num=leia.nextDouble();
        String resposta=(num>0)?"Positivo":(num==0)?"Igual a zero":"negativo";
        System.out.printf("O numero é %s",resposta);
    leia.close();
    }
    
}
