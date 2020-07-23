

import java.util.Comparator;

/**
 * Classe relativa ao comprarator de ClienteGasto
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class ComparatorGasto implements Comparator<ClienteGasto> {

    /**
     * Metodo para comaprar ClienteGasto
     */
    public ComparatorGasto() {
    }

    /**
     * Metodo para comparar dois ClienteGasto
     * @param x Um ClienteGasto
     * @param x2 Um ClienteGasto
     * @return 1 ou -1
     */
    public int compare(ClienteGasto x, ClienteGasto x2) {
        return x.getUnid() >= x2.getUnid() ? -1 : 1;
    }
}
