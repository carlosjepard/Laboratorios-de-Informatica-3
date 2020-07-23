

/**
 * Classe referente a um Cliente
 * @author Joao Neves
 * @author Goncalo Nogueira
 * @author Carlos Afonso
 */
public class Cliente  implements java.io.Serializable,Comparable<Cliente> {
    private String codigo; //codigo cliente

    /**
     * Construtor parametrizado.
     * @param codigo Codigo de cliente.
     */
    public Cliente(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Construtor por objeto
     * @param c Um cliente
     */
    public Cliente(Cliente c) {
        this.codigo = c.getCodigo();
    }

    /**
     * Get do codigo de cliente.
     * @return codigo.
     */
    public String getCodigo() {return codigo;}

    /**
     * Set do codigo.
     * @param codigo Codigo.
     */
    public void setCodigo(String codigo) {this.codigo = codigo;}

    /**
     * Metodo equals.
     * @param object Objeto.
     * @return True ou False.
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        final Cliente other = (Cliente) object;
        return this.getCodigo().equals(other.getCodigo());
    }

    /**
     * Metodo toString.
     * @return String.
     */
    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + '}';
    }

    /**
     * Metodo clone.
     * @return Cliente.
     */
    public Cliente clone(){
        return new Cliente(this);
    }

    /**
     * Metodo de comparacao.
     * @param p Cliente.
     * @return 1 ou 0.
     */
    //compareTo
    public int compareTo(Cliente p){
        return this.getCodigo().compareTo(p.getCodigo());
    }

    /**
     * Metodo Hash
     * @return int
     */
    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

}
