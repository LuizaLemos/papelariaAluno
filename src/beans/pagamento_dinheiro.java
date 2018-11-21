
package beans;




public class pagamento_dinheiro {
        public double preco;
        public Pedido Cod_pedido;
        public double qtd_do_dinheiro;
        public double troco;

    public pagamento_dinheiro(double preco, Pedido Cod_pedido, double qtd_do_dinheiro, double troco) {
        this.preco = preco;
        this.Cod_pedido = Cod_pedido;
        this.qtd_do_dinheiro = qtd_do_dinheiro;
        this.troco = troco;
    }




    public pagamento_dinheiro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public double getQtd_do_dinheiro() {
        return qtd_do_dinheiro;
    }

    public double getTroco() {
        return troco;
    }

    public double getPreco() {
        return preco;
    }

    public Pedido getCod_pedido() {
        return Cod_pedido;
    }


    public void setQtd_do_dinheiro(double qtd_do_dinheiro) {
        this.qtd_do_dinheiro = qtd_do_dinheiro;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCod_pedido(Pedido Cod_pedido) {
        this.Cod_pedido = Cod_pedido;
    }

    public void add(pagamento_dinheiro pagarDinheiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
