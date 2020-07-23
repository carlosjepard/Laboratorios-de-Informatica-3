
import java.util.Comparator;

/**
 * Classe relativa ao comparator entre ClienteFats
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class ComparatorClienteFat implements Comparator<ClienteFat> {

    /**
     * Metodo para comparar ClienteFat
     */
    public ComparatorClienteFat() {
    }

    /**
     * Comparador entre ClienteFat c1 e ClienteFat c2
     * @param c1 Um objeto ClienteFat
     * @param c2 Um objeto ClienteFat
     * @return 1 ou -1
     */
    public int compare(ClienteFat c1, ClienteFat c2) {
        return c1.getFat() >= c2.getFat() ? -1 : 1;
    }
}

