package pedido.estadosPedido;

import pedido.Pedido;

public interface Estado {

    public void preparar(Pedido pedido);
    public void transportar(Pedido pedido);
    public void receber(Pedido pedido);
    public void finalizar(Pedido pedido);

}
