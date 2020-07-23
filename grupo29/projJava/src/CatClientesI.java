


import java.io.Serializable;
import java.util.TreeSet;

/**Interface com os seguintes metodos
 * @author Carlos Afonso
 * @author Goncalo Nogueira
 * @author Joao Neves
 */
public interface CatClientesI extends Serializable {

    /**
     * Get do catalogo de clientes
     * @return catalogo de clientes
     */
    public TreeSet<Cliente> getClientes();



    /**
     * Adiciona um Cliente.
     * @param cliente Um cliente.
     */
    public void addCliente(Cliente cliente);

    /**
     * Set do cliente
     * @param c Cliente
     */
    public void setClientes(TreeSet<Cliente> c);

    /**
     * Verifica se exite um cliente.
     * @param c Um cliente
     * @return True ou False.
     */
    public boolean existeCliente(Cliente c);

    /**
     * Metodo de size
     * @return tamanho
     */
    public int size();

    /**
     * Metodo para limapr catalogo de clientes
     */
    public void cleanC();

}
