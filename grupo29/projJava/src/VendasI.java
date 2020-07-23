

import java.io.Serializable;

/**
 * Interface relativa as Vendas
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
public interface VendasI extends Serializable {

    /**
     * Metodo get do produto
     * @return Produto
     */
    public Produto getProduto();

    /**
     * Metodo get do preco
     * @return preco
     */
    public double getPreco();

    /**
     * Metodo get das unidades
     * @return unidades
     */
    public int getUnidades();

    /**
     * Metodo get do tipo de compra
     * @return tipo de compra
     */
    public char getModo();

    /**
     * Metodo get do Cliente
     * @return Cliente
     */
    public Cliente getCliente();

    /**
     * Metodo get do Mes
     * @return mes
     */
    public int getMes();

    /**
     * Metodo get da filial
     * @return filial
     */
    public int getFilial();

}
