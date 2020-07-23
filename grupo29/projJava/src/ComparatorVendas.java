

import java.util.Comparator;

/**
 *Classe relativa ao comparator entre Vendas
 * @author Carlos Afonso
 * @author Goncalo Nogueira
 * @author Joao Neves
 */
public class ComparatorVendas implements Comparator<Vendas>{
    /**
     * Metodo para comparar vendas
     * @param x Uma venda
     * @param y Uma venda
     * @return 1 ou -1
     */
    public int compare(Vendas x, Vendas y){
        return x.compareTo(y);
    }
}