

import java.util.Comparator;

/**
        * Classe relativa ao comprarator de ParClienteFloat
        * @author Carlos Afonso
        * @author Joao Neves
        * @author Goncalo Nogueira
 */

public class ComparatorParClienteFloat implements Comparator<ParClienteFloat>{

    /**
     * Metodo de comparacao entre dois ParClienteFloat
     * @param x Um objeto ParClienteFloat
     * @param y Um objeto ParClienteFloat
     * @return 1 ou -1
     */
    public int compare(ParClienteFloat x, ParClienteFloat y){
        return x.compareTo(y);
    }
}