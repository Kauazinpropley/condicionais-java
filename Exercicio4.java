import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.print("Informe a temperatura (em Graus celsius) ");
        double temp=leia.nextDouble();
        if (temp<15) {
            System.out.println("Esta frio");
        }
        if (temp>15 && temp<25) {
            System.out.println("Esta agradável");
        }
        if (temp>=25) {
            System.out.println("Esta quente");
        }
        leia.close();
    }

}
