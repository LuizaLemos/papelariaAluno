
package papelariaaluno;

import beans.Pedido;


public abstract class Pagamento {
    public double preco;
    public Pedido Cod_pedido;

    public Pagamento(double preco, Pedido Cod_pedido) {
        this.preco = preco;
        this.Cod_pedido = Cod_pedido;
    }
    
    
    
}
