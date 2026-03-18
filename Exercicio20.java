import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       System.out.println("Escolha pedra papel ou tesoura");
       System.out.print("Jogador 1: ");
       String jog1 = leia.nextLine();
       System.out.print("Jogador 2: ");
       String jog2 = leia.nextLine();
         if (jog1.equalsIgnoreCase(jog2)) {
              System.out.println("Empate");
         } else if ((jog1.equalsIgnoreCase("pedra") && jog2.equalsIgnoreCase("tesoura")) ||
                    (jog1.equalsIgnoreCase("papel") && jog2.equalsIgnoreCase("pedra")) ||
                    (jog1.equalsIgnoreCase("tesoura") && jog2.equalsIgnoreCase("papel"))) {
              System.out.println("Jogador 1 vence!");
         } else {
              System.out.println("Jogador 2 vence!");
         }
         leia.close();
    }
}
