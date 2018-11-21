
package beans;

import papelariaaluno.Pagamento;


public class pagamento_dinheiro extends Pagamento {
         public int cod_pedido;
         public double qtd_do_dinheiro;
         public double troco;


    public pagamento_dinheiro(int cod_pedido, double qtd_do_dinheiro, double troco, double preco, Pedido Cod_pedido) {
        super(preco, Cod_pedido);
        this.cod_pedido = cod_pedido;
        this.qtd_do_dinheiro = qtd_do_dinheiro;
        this.troco = troco;
    }
    
    
    
}
