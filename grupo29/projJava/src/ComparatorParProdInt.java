

import java.util.Comparator;

/**
 * Classe relativa ao comparator entre ParProdInt
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class ComparatorParProdInt implements Comparator<ParProdInt>{

    /**
     * Metodo para comparar dois ParProdInt
     * @param x Um objeto ParProdInt
     * @param y Um objeto ParProdInt
     * @return 1 ou -1
     */
    public int compare(ParProdInt x, ParProdInt y){
        return x.compareTo(y);
    }
}