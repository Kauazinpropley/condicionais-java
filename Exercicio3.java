import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.print("Escreva a nota do aluno de (0 a 10) ");
        double nota=leia.nextDouble();
        String resultado = (nota >= 7) ? "Aprovado" :(nota >= 5) ? "Recuperação": "Reprovado";
        System.out.printf("O aluno está: %s",resultado);
        leia.close();
    }
}
