import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.println("Digite a velocidade do carro");
        int vel=leia.nextInt();
        System.out.println("Digite o limite da pista");
        int limit=leia.nextInt();
        if (vel<=limit*1) {
            System.out.println("voce esta dentro do limite");
        }
        if (vel>limit*1 &&vel<=limit*1.2) {
            System.out.println("multa leve");
        }
        if (vel>limit*1.2 && vel<=limit*1.5 ) {
            System.out.println("multa grave");
        }
        if (vel>=limit*1.5) {
            System.out.println("multa gravissima + suspensão");
        }
        leia.close();
    }
}
