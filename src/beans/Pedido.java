
package beans;


public class Pedido {
   
   public int pedido;
   public Solicitação solicitacao;
   public cadastro_aluno aluno;

    public Pedido(int pedido, Solicitação solicitacao, cadastro_aluno aluno) {
        this.pedido = pedido;
        this.solicitacao = solicitacao;
        this.aluno = aluno;
    }

    public int getPedido() {
        return pedido;
    }

    public Solicitação getSolicitacao() {
        return solicitacao;
    }

    public cadastro_aluno getAluno() {
        return aluno;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public void setSolicitacao(Solicitação solicitacao) {
        this.solicitacao = solicitacao;
    }

    public void setAluno(cadastro_aluno aluno) {
        this.aluno = aluno;
    }
   
   
}
