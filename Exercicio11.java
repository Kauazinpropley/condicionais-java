import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.println("Escreva sua idade");
        int idade=leia.nextInt();
        String preco=(idade<12)?"10R$":(idade>=12 && idade<=60)?"20R$":"10R$(meia)";
        System.out.printf("O valor do ingresso é %s",preco);
        leia.close();
    }
}
