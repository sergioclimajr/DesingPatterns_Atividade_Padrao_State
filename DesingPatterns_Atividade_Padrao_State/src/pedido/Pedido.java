package pedido;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import pedido.estadosPedido.Estado;
import pedido.estadosPedido.Preparacao;

public class Pedido {
    Estado estado;

    public Pedido() {
        estado = new Preparacao();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void preparar() {
        estado.preparar(this);
    }

    public void transportar() {
        estado.transportar(this);
    }

    public void receber() {
        estado.receber(this);
    }

    public void finalizar() {
        estado.finalizar(this);
    }

    public void time() {
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

    }

    public void fluxo_pedido() {
        time();
        this.preparar();
        time();
        this.transportar();
        time();
        this.receber();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tudo certinho com seu pedido? (sim/nao)");
        String feedback = scanner.nextLine();

        if (feedback.equalsIgnoreCase("nao")) {
            this.fluxo_pedido();
        } else {
            this.finalizar();
        }
        scanner.close();
    }

}
