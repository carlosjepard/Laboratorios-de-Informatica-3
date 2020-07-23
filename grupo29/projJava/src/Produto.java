

/**
 * Classe relativa a informacao de um Produto
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
public class Produto implements java.io.Serializable,Comparable<Produto> {
    private String codigo; // codigo produto



    /**
     * Construtor Parametrizado
     * @param codigo codigo do produto
     */
    public Produto(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Construtor por Objeto
     * @param p Produto
     */
    public Produto(Produto p) {
        this.codigo = p.getCodigo();
    }



    /**
     * Metodo Clone
     * @return this
     */
    public Produto clone(){
        return new Produto(this);
    }

    /**
     * Get do codigo
     * @return codigo
     */
    public String getCodigo() {return codigo;}

    //set

    /**
     * Set do codigo
     * @param codigo codigo
     */
    public void setCodigo(String codigo) {this.codigo = codigo;}


    /**
     * Metodo equals
     * @param object objeto
     * @return True ou False
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        final Produto other = (Produto) object;
        return this.getCodigo().equals(other.getCodigo());
    }

    /**
     * Metodo toString
     * @return String
     */
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + '}';
    }

    /**
     * Comparator
     * @param p Produto
     * @return 1 ou -1
     */
    public int compareTo(Produto p){
        return this.getCodigo().compareTo(p.getCodigo());
    }


    /**
     * Metodo hashcode
     * @return int
     */
    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
