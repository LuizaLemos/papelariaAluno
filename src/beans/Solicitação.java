
package beans;


public class Solicitação {
  
        public String data;
        public String hora;
        public int qtd_pro;
        public String nome_produto;

    public Solicitação(String data, String hora, int qtd_pro, String nome_produto) {
        this.data = data;
        this.hora = hora;
        this.qtd_pro = qtd_pro;
        this.nome_produto = nome_produto;
    }
        
        
        
}
