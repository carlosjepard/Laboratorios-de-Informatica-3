

import java.util.TreeSet;


/**Classe que representa o catalogo de produtos
 * @author Carlos Afonso
 * @author Goncalo Nogueira
 * @author Joao Neves
 */
public class CatalogoProdutos implements java.io.Serializable,CatprodutosI {

    private TreeSet<Produto> produtos;

    /**
     * Construtor vazio.
     */
    public CatalogoProdutos(){
        produtos= new TreeSet<Produto>();
    }

    /**
     * Get do catalogo de produtos.
     * @return catalogo de produtos.
     */
    public TreeSet<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Set do catalogo de produtos.
     * @param p catalogo de produtos.
     */
    public void setProdutos(TreeSet<Produto> p){
        this.produtos=p;
    }


    /**
     * Metodo equals
     * @param object Objeto.
     * @return True ou False.
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        final CatalogoProdutos other = (CatalogoProdutos) object;
        return true;
    }

    /**
     * Adicona produto ao catalogo de produtos.
     * @param produto Um produto.
     */
    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    /**
     * Tamanho do catalogo de produtos.
     * @return tamanho.
     */
    public int size(){
        return produtos.size();
    }

    /**
     * Verifica se existe um produto.
     * @param p Produto.
     * @return True ou False
     */
    public boolean existeProduto(Produto p){
        return produtos.contains(p);
    }

    /**
     * Metodo para limpar as estruturas
     */
    public void cleanP(){
        produtos.clear();
    }
}