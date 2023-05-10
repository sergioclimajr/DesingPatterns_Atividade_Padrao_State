import pedido.Pedido;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja realizar um novo pedido? (sim / nao)");
        String answer = scanner.nextLine();

        if (!answer.equalsIgnoreCase("sim")) {
            System.out.println("Até a próxima!");
        }

        System.out.println("Iniciando um novo pedido");

        Pedido pedido = new Pedido();

        pedido.fluxo_pedido();
        scanner.close();
    }
}