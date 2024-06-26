import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leia.next();
        System.out.println("Olá, " + nome);

    }
}
