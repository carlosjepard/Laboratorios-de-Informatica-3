

import java.io.Serializable;
import java.util.TreeSet;

/**
 * Interface com os seguintes metodos.
 * @author Joao Neves
 * @author Carlos Afonso
 * @author Goncalo Nogueira
 */
public interface CatprodutosI extends Serializable {

    /**
     * Get dos produtos.
     * @return Produtos.
     */
    public TreeSet<Produto> getProdutos();



    /**
     * Adiciona um produto.
     * @param produto Um produto.
     */
    public void addProduto(Produto produto);

    /**
     * Set do catalogo de produtos
     * @param p catalogo de produtos
     */
    public void setProdutos(TreeSet<Produto> p);

    /**
     * Metodo para descobrir se um Produto existe.
     * @param p Um produto.
     * @return True ou False.
     */
    public boolean existeProduto(Produto p);

    /**
     * Metodo para obter o size
     * @return tamanho
     */
    public int size();

    /**
     * Metodo para limpar catalogo de produtos
     */
    public void cleanP();
}
