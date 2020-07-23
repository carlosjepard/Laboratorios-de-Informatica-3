import java.io.Serializable;

/**
 * Classe referente aos Gastos de um cliente
 * @author Joao Neves
 * @author Goncalo Nogueira
 * @author Carlos Afonso
 */
public class ClienteGasto implements Serializable {
    private Cliente cod;
    private double fat;
    private int unid;

    /**
     * Metodo get das Unidades
     * @return unidades
     */
    public int getUnid() {
        return this.unid;
    }

    /**
     * Set das unidades
     * @param unid unidades
     */
    public void setUnid(int unid) {
        this.unid = unid;
    }

    /**
     * Construtor Vazio
     */
    public ClienteGasto() {
        this.cod = new Cliente(" ");
        this.fat = 0.0D;
        this.unid = 0;
    }

    /**
     * Construtor por objeto
     * @param a Objeto ClienteGastp
     */
    public ClienteGasto(ClienteGasto a) {
        this.cod = a.getCod();
        this.fat = a.getFat();
        this.unid = a.getUnid();
    }

    /**
     * Construtor parametrizado
     * @param cod Cliente
     * @param fat faturacao
     * @param unid unidades
     */
    public ClienteGasto(Cliente cod, double fat, int unid) {
        this.cod = cod;
        this.fat = fat;
        this.unid = unid;
    }

    /**
     * Get do cliente
     * @return Cliente
     */
    public Cliente getCod() {
        return this.cod;
    }

    /**
     * Set do cliente
     * @param cod cliente
     */
    public void setCod(Cliente cod) {
        this.cod = cod;
    }

    /**
     * Get da faturação
     * @return faturação
     */
    public double getFat() {
        return this.fat;
    }

    /**
     * Set da faturação
     * @param fat faturaçao
     */
    public void setFat(double fat) {
        this.fat = fat;
    }

    /**
     * Metodo Clone
     * @return this
     */
    public ClienteGasto clone(){return new ClienteGasto(this);}
}
