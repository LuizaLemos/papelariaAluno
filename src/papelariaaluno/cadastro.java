
package papelariaaluno;

/**
 *
 * @author pvhal
 */
public abstract class cadastro {
  public int num_cadastro;
  public String nome;
  public String Endereco;
  public String DataNasc;
  public String NumeroCell;

    public cadastro(int num_cadastro, String nome, String Endereco, String DataNasc, String NumeroCell) {
        this.num_cadastro = num_cadastro;
        this.nome = nome;
        this.Endereco = Endereco;
        this.DataNasc = DataNasc;
        this.NumeroCell = NumeroCell;
    }
  
  
  
}
