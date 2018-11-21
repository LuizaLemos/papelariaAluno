
package papelariaaluno;

import beans.Pedido;


public class Nota_fiscal extends Pagamento{
  
    public Pagamento valor_Filnal;

    public Nota_fiscal(Pagamento valor_Filnal, double preco, Pedido Cod_pedido) {
        super(preco, Cod_pedido);
        this.valor_Filnal = valor_Filnal;
    }

   
}
