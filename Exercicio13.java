import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leia =new Scanner(System.in);
        System.out.print("Digite o mes do ano: ");
        int mes = leia.nextInt();
        switch (mes) {
            case 1,2,3,4:
                System.out.println("Verão");
                break;
            case 5,6:
                System.out.println("Outono");
                break;
            case 7,8,9:
                System.out.println("Inverno");
                break;
            case 10,11,12:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Mês inválido.");
        }
        leia.close();
    }
}
