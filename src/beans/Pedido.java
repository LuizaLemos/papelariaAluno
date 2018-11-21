
package beans;


public class Pedido {
   
   public int pedido;
   public Itens_pedido solicitacao;
   public Cadastro_aluno aluno;

    public Pedido(int pedido, Itens_pedido solicitacao, Cadastro_aluno aluno) {
        this.pedido = pedido;
        this.solicitacao = solicitacao;
        this.aluno = aluno;
    }

    public Pedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPedido() {
        return pedido;
    }

    public Itens_pedido getSolicitacao() {
        return solicitacao;
    }

  

    public Cadastro_aluno getAluno() {
        return aluno;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public void setItens_pedido(Itens_pedido solicitacao) {
        this.solicitacao = solicitacao;
    }

    public void setAluno(Cadastro_aluno aluno) {
        this.aluno = aluno;
    }

    public void add(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSolicitacao(Itens_pedido solicitacao) {
        this.solicitacao = solicitacao;
    }
   
   
}
