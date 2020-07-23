import java.io.Serializable;

/**
 * Classe relativa ao faturado por um cliente
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */

public class ClienteFat implements Serializable {
    private Cliente c;
    private double fat;

    /**
     * Construtor Vazio
     */
    public ClienteFat() {
        this.c = new Cliente(" ");
        this.fat = 0.0D;
    }

    /**
     * Construtor parametrizado.
     * @param c Cliente.
     * @param fat Faturado.
     */
    public ClienteFat(Cliente c, double fat) {
        this.c = new Cliente(c);
        this.fat = fat;
    }

    /**
     * Construtor por Objeto
     * @param c Objeto ClienteFat
     */
    public ClienteFat(ClienteFat c){
        this.c=new Cliente(c.getC());
        fat=c.getFat();
    }

    /**
     * Get do cliente.
     * @return Cliente.
     */
    public Cliente getC() {
        return this.c;
    }

    /**
     * Set do cliente.
     * @param c Cliente.
     */
    public void setC(Cliente c) {
        this.c = c;
    }

    /**
     * Get do Faturado.
     * @return Faturado.
     */
    public double getFat() {
        return this.fat;
    }

    /**
     * Set do faturado
     * @param fat faturado
     */
    public void setFat(double fat) {
        this.fat = fat;
    }

    /**
     * Metodo Clone
     * @return this
     */
    public ClienteFat clone(){return new ClienteFat(this);}
}
