import java.io.Serializable;

/**
 * Classe referente as unidades de um cliente
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class ClienteQuant implements Serializable {
    private Cliente c;
    private int unid;

    /**
     * Construtor Parametrizado
     * @param c Cliente
     * @param unid Unidades
     */
    public ClienteQuant(Cliente c, int unid) {
        this.c = c;
        this.unid = unid;
    }

    /**
     * Get do cliente
     * @return Cliente
     */
    public Cliente getC() {
        return c;
    }

    /**
     * Set do cliente
     * @param c Cliente
     */
    public void setC(Cliente c) {
        this.c = c;
    }

    /**
     * Get das unidades
     * @return unidades
     */
    public int getUnid() {
        return unid;
    }

    /**
     * Set das unidades
     * @param unid unidades
     */
    public void setUnid(int unid) {
        this.unid = unid;
    }
}