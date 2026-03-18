import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.print("Escreva sua altura: ");
        double altura=leia.nextDouble();
        System.out.print("Escreva seu peso: ");
        double peso=leia.nextDouble();
        double imc=peso/(altura*altura);
        System.out.println("Seu IMC é: " +imc);
        String situacao=(imc>=30)? "obeso":(imc>=25 && imc<30)? "sobrepeso":(imc>=18.5 && imc<25)?"normal":"abaixo do peso";
        System.out.println("Você esta "+situacao);
        leia.close();
    }
}
