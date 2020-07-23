

import java.util.TreeSet;

/** Representa o catalogo de clientes
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class CatalogoClientes implements java.io.Serializable,CatClientesI {

    private TreeSet<Cliente> clientes; //HashSet para ter Arvore ordenada de clientes


    /**
     * Construtor vazio.
     */
    public CatalogoClientes(){
        clientes= new TreeSet<Cliente>();
    }

    /**
     * Get do catalogo de clientes.
     * @return catalogo de clientes.
     */
    public TreeSet<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Set do catalogo de clientes.
     * @param c Catalogo de clientes.
     */
    public void setClientes(TreeSet<Cliente> c){
        this.clientes=c;
    }

    /**
     * Adiciona um cliente ao catalogo.
     * @param cliente Um cliente.
     */
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    /**
     * Retorna Tamanho do catalogo.
     * @return tamanho da arvore clientes.
     */
    public int size(){
        return clientes.size();
    }

    /**
     * Verifica se existe um cliente no catalogo
     * @param c Um cliente.
     * @return True ou False
     */
    public boolean existeCliente(Cliente c){
        return clientes.contains(c);
    }

    /**
     * Metodo que limpa as estruturas
     */
    public void cleanC(){
        clientes.clear();
    }

}

