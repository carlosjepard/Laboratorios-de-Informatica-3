

import java.util.Comparator;

/**
 * Classe relativa ao comprarator de Clientes
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class ComparatorCliente implements Comparator<Cliente>{

    /**
     * Comparador entre cliente x e cliente y
     * @param x Um cliente
     * @param y Um cliente
     * @return -1 ou 1
     */
        public int compare(Cliente x, Cliente y){
            return x.compareTo(y);
        }
}

