

import java.util.Comparator;

/**
 * Classe relativa ao comparator DecresenteQuant
 */
public class DecrescenteQuant implements Comparator<ClienteQuant> {
    /**
     * Metodo para comparar dois ClientQuant
     * @param c1 Um ClienteQuant
     * @param c2 Um ClientQuant
     * @return 1 ou -1
     */
    public int compare(ClienteQuant c1,ClienteQuant c2){
        if(c1.getUnid()>=c2.getUnid()) return -1;

        return 1;
    }
}