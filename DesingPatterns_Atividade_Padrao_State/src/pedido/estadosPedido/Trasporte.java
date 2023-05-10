package pedido.estadosPedido;

import pedido.Pedido;

public class Trasporte implements Estado{
	
    @Override
    public void preparar(Pedido pedido) {
        System.out.println("Pedido já está em transito!");
    }

    
    @Override
    public void receber(Pedido pedido) {
        pedido.setEstado(new Recebimento());
        System.out.println("Pedido foi recebido!");
    }
    
    
    @Override
    public void transportar(Pedido pedido) {
        System.out.println("Pedido está em transito!");
    }

    
    @Override
    public void finalizar(Pedido pedido) {
        System.out.println("Pedido ainda está em transito!");
    }
}
