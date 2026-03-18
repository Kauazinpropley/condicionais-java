import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = leia.nextInt();
        String multiplo=(numero%3==0 && numero%5==0)?"O número é múltiplo de 3 e 5.":(numero%3==0)?"O número é múltiplo de 3.":(numero%5==0)?"O número é múltiplo de 5.":"O número não é múltiplo de 3 nem de 5.";
        System.out.println(multiplo);
        leia.close();
    }
}
