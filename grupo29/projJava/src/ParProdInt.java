import java.io.Serializable;

/**
 * Classe relativa ao ParProdInt
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
public class ParProdInt implements Comparable<ParProdInt>, Serializable {


    private Produto prod;
    private int inteiro;

    /**
     * Construtor Parametrizado
     *
     * @param p ParProdInt
     * @param n inteiro
     */
    public ParProdInt(Produto p, int n) {
        prod = p;
        inteiro = n;
    }

    /**
     * Construtor por objeto
     * @param p Objeto ParProdInt
     */
    public ParProdInt(ParProdInt p) {
        prod = new Produto(p.getProd().clone());
        inteiro = p.getInteiro();

    }

    /**
     * Get do produto
     *
     * @return Produto
     */
    public Produto getProd() {
        return prod;
    }

    /**
     * Set do Produto
     *
     * @param produto Produto
     */
    public void setProd(Produto produto) {
        this.prod = produto;
    }

    /**
     * Get do inteiro
     *
     * @return inteiro
     */
    public int getInteiro() {
        return inteiro;
    }

    /**
     * Set do inteiro
     *
     * @param inteiro inteiro
     */
    public void setInteiro(int inteiro) {
        this.inteiro = inteiro;
    }

    /**
     * Metodo que ordena primeiro por ordem descentente do inteiro e de seguida os Produtos por ordem ascendente
     *
     * @param x ParProdInt
     * @return 1 ou -1
     */
    public int compareTo(ParProdInt x) {
        if (this.inteiro < x.getInteiro())
            return 1;
        if (this.inteiro > x.getInteiro())
            return -1;
        return this.getProd().compareTo(x.getProd());

    }

    /**
     * Metodo toString
     *
     * @return String
     */
    public String toString() {
        return inteiro + prod.toString();
    }

    public ParProdInt clone() {
        return new ParProdInt(this);

    }

}
