import java.io.Serializable;

/**
 * Classe relativa ao ParIntDouble
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
public class ParIntDouble implements Serializable {

    private int compras;
    private double fat;
    private int produtos;

    /**
     * Get do numero de produtos
     * @return produtos
     */
    public int getProdutos() {
        return produtos;
    }

    /**
     * Set do numero de produtos
     * @param produtos produtos
     */
    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }

    /**
     * Construtor Parametrizado
     * @param compras numero de compras
     * @param fat valor faturado
     * @param produtos numero de produtos
     */
    public ParIntDouble(int compras, double fat,int produtos) {
        this.compras = compras;
        this.fat = fat;
        this.produtos=produtos;
        }

    /**
     * Construtor Vazio
     */
    public ParIntDouble(){
        this.compras=0;
        this.fat=0.0;
        this.produtos=0;
    }

    /**
     * Get do numero de compras
     * @return compras
     */
    public int getCompras() {
        return compras;
    }

    /**
     * Set do numero de compras
     * @param compras numero de compras
     */
    public void setCompras(int compras) {
        this.compras = compras;
    }

    /**
     * Get da faturacao
     * @return faturacao
     */
    public double getFat() {
        return fat;
    }

    /**
     * Set da faturacao
     * @param fat faturacao
     */
    public void setFat(double fat) {
        this.fat = fat;
    }
}
