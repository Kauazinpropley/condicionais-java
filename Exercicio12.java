import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        System.out.println("Escreva a nota (0-10)");
        int nota=leia.nextInt();
        String conceito=(nota>=9 && nota<=10)?"A":(nota>=7 && nota<=8)?"B":(nota>=5 && nota<=6)?"C":"D";
        System.out.printf("A nota se encaixa no conceito %s",conceito);
        leia.close();
    }
}
