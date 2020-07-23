import java.io.Serializable;

/**
 * Classe referente ao ProdutoUni, que guarda um Produto e um valor int
 * @author Carlos Afonso
 * @author Gonçalo Nogueira
 * @author Joao Neves
 */
public class ProdutoUni implements Serializable {
    private Produto p;
    private int uni;

    /**
     * Construtor parametrizado
     * @param p Produto
     * @param uni valor int
     */
    public ProdutoUni(Produto p, int uni) {
        this.p = p;
        this.uni = uni;
    }

    /**
     * Construtor por objeto
     * @param p Objeto ProdutoUni
     */
    public ProdutoUni(ProdutoUni p){
        this.p=new Produto(p.getP());
        this.uni=p.getUni();
    }

    /**
     * Get do produto
     * @return produto
     */
    public Produto getP() {
        return this.p;
    }

    /**
     * Set do produto
     * @param p Produto
     */
    public void setP(Produto p) {
        this.p = p;
    }

    /**
     * Get da valor int
     * @return valor int
     */
    public int getUni() {
        return this.uni;
    }

    /**
     * Set o valor int
     * @param uni int
     */
    public void setUni(int uni) {
        this.uni = uni;
    }

    /**
     * Metodo clone
     * @return this
     */
    public ProdutoUni clone(){return new ProdutoUni(this);}

}

