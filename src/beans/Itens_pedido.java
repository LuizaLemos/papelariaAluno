/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author pvhal
 */
public class Itens_pedido {
    
      public String data;
        public String hora;
        public int qtd_pro;
        public String nome_produto;

    public Itens_pedido(String data, String hora, int qtd_pro, String nome_produto) {
        this.data = data;
        this.hora = hora;
        this.qtd_pro = qtd_pro;
        this.nome_produto = nome_produto;
    }

    public Itens_pedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public int getQtd_pro() {
        return qtd_pro;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setQtd_pro(int qtd_pro) {
        this.qtd_pro = qtd_pro;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public void add(Itens_pedido intemPedidos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
}
