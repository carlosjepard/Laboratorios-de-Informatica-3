

import java.util.Comparator;

/**
 *Classe relativa ao comparator entre Produtos
 * @author Goncalo Nogueira
 * @author Joao Neves
 * @author Carlos Afonso
 */
public class ComparatorProduto implements Comparator<Produto>{

    /**
     * Metodo para comparar dois produtos
     * @param x Um produto
     * @param y Um produto
     * @return 1 ou -1
     */
    public int compare(Produto x, Produto y){
        return x.compareTo(y);
    }
}