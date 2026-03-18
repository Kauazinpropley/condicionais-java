import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o usuario: ");
        String usuario = leia.nextLine();
        System.out.print("Digite a senha: ");
        String senha = leia.nextLine();
        String mensagem = (usuario=="admin" && senha=="1234")?"acesso permitido.":"acesso negado.";
        System.out.println(mensagem);
        leia.close();
    }
}
