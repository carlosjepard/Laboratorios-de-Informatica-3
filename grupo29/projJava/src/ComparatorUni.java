

import java.util.Comparator;

/**
 *Classe relativa ao comparator entre ProdutoUnis
 * @author Carlos Afonso
 * @author Goncalo Nogueira
 * @author Joao Neves
 */

public class ComparatorUni implements Comparator<ProdutoUni> {

    /**
     * Metodo para comaprar ProdutoUni
     */
    public ComparatorUni() {
    }

    /**
     * Metodo para comparar dois ProdutoUni
     * @param p1 Um objeto ProdutoUni
     * @param p2 Um objeto ProdutoUni
     * @return 1 ou -1
     */
    public int compare(ProdutoUni p1, ProdutoUni p2) {
        if (p1.getUni() > p2.getUni()) {
            return -1;
        } else if (p1.getUni() < p2.getUni()) {
            return 1;
        } else {
            return p1.getP().compareTo(p2.getP());
        }
    }
}