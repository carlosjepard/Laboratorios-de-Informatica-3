



import java.io.Serializable;
import java.util.*;

/**
 * Interface relativa a filial
 * @author Carlos Afonso
 * @author João Neves
 * @author Goncalo Nogueira
 */
public interface FilialI extends Serializable {

    /**
     * Metodo para adicionar uma venda
     * @param v Venda
     */
    public void upFilial(Vendas v);

    /**
     * Get do HashMap referente a um cliente, e a sua informacao relativa a todos os meses
     * @return HashMap referente a um cliente, e a sua informacao relativa a todos os meses
     */
    public HashMap<Cliente, List<ClienteH>> getClientH1();

    /**
     * Get do HashMap referente a um Produto, e a sua informacao relativa a todos os meses
     * @return HashMap referente a um Produto, e a sua informacao relativa a todos os meses
     */
    public HashMap<Produto, List<ProdutoH>> getProdutoH1();

    /**
     *Metodo para obter  clientes diferentes no total das filiais todas
     * @param c Cliente
     * @param mes Mes
     * @return Par onde é guardado o numero de compras, o total faturado e as unidades de produtos
     */
    public ParIntDouble comprasCM(Cliente c, int mes);

    /**
     *Metodo para obter  produtos diferentes no total das filiais todas
     * @param p Cliente
     * @param mes Mes
     * @return Par onde é guardado o numero de compras, o total faturado e as unidades de produtos
     */
    public ParIntDouble comprasPM(Produto p,int mes);

    /**
     * Metodo para obter o numero de clientes distintos total num mes
     * @param mes Mes
     * @return Numero de clientes distintos
     */
    public int getClientesDistintosTotal(int mes);

    /**
     * Metodo para obter numero de clientes distintos que compraram um Produto
     * @param p Um produto
     * @return Numero de clientes distintos que compraram um produto
     */
    public int getClientesDistintos(Produto p);

    /**
     * Metodo que coloca clientes distintos num Set
     * @param p Produto
     * @param s Set onde serao colocados os clientes que compraram o produto
     */
    public void getClientes(String p, Set<Cliente> s);

    /**
     * Metodo para obter o Faturado por um cliente
     * @return Lista com o faturado por cada cliente
     */
    public Set<ClienteFat> getFatC();

    /**
     * Metodo para obter o faturado num mes
     * @return Map com o produto, e o faturado em cada mes.
     */
    public Map<Produto,List<Double>> fatmes();

    /**
     * Metodo para obter os produtos e as respetivas unidades, de um cliente
     * @param c Cliente
     * @return list de pares de produtos e unidades
     */
    public List<ProdutoUni> produtosUnid(Cliente c);

    /**
     * Metodo auxiliar para obter o numero de compras num determinado mes por cada cliente
     * @param mes Mes
     * @return Map com cliente e o numero de compras feito por esse cliente
     */
    public Map<Cliente,Integer> aux2(int mes);

    /**
     * Metodo para obter os Clientes que mais gastaram num produto
     * @param p Produto
     * @return Set com os clientes que mais gastaram num produto
     */
    public Set<ClienteGasto> maisCompraram(Produto p);

    /**
     * Metodo para obter o numero de compras por cada mes
     * @return Lista com numeros de compras
     */
    public List<Integer> comprasMes();

    /**
     * Metodo para obter o total faturado por cada mes
     * @return Lista com total faturado
     */
    public List<Double> fatMes();

    /**
     * Metodo para obter o numero de Clientes distintos
     * @return List com o numero de clientes distintos
     */
    public List<Integer> clienteDist();

    /**
     * Metodo para obter a lista dos produtos diferentes de cada cliente
     * @param ret Map onde vai ser adicionada essa informacao
     */
    public void produtosDist(Map<Cliente,Set<Produto>> ret);

    /**
     * Metodo para limpar estrutura
     */
    public void cleanfi();

    /**
     * Metodo insere no map todos os produtos e as unidades
     * @param ret map onde serao inseridos todos os produtos e unidades
     */
    public void aux6(Map<Produto, Integer> ret);

    /**
     * set com os clientes distintos que compraram determinado produto
     * @param p Produto
     * @param ret Set para inserir clientes que compraram o produto
     */
    public void aux66(Produto p, Set<Cliente> ret);
}
