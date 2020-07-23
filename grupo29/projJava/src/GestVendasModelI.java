

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 * Interface com os Metodos da GestVendasModelI
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
public interface GestVendasModelI extends Serializable {
    /**
     * Get do objeto referente a estatisticas
     * @return objeto EstatisticasI
     */
    public EstatisticasI getEstatisticas();

    /**
     * Metodo que carrega um estado a partir de um ficheiro
     * @param path Ficheiro
     */
    public void carrega(String path);

    /**
     * Metodo para obter estatistica relativa ao cliente
     */
    public void clienteE();

    /**
     * Metodo para obter estatistica relativa ao produto
     */
    public void produtoE();

    /**
     * Metodo para guardar o estado
     * @param fich fichiero onde se ira guardar o estado
     * @throws IOException IOException
     */
    public void gravarEstado(String fich) throws IOException;

    /**
     * Obter os produtos que nao foram comprados por ninguem
     * @return Lista de produtos comprados por ninguem
     */
    public TreeSet<Produto> query1();

    /**
     * Metodo para  obter o numero de clientes distintos de cada produto
     * @param pesq Lista de ParProdInt
     * @return List de numeros de clientes
     */
    public List<Integer> query6aux(List<ParProdInt> pesq);

    /**
     * Determinar o conjunto dos X produtos mais vendidos no ano inteiro
     * indicando o número total de distintos clientes que o
     * compraram (X é um inteiro dado pelo utilizador);
     * @param x numero de clientes
     * @return Lista de clientes distintos que compraram esses produtos
     */
    public List<ParProdInt> query62(int x);

    /**
     * Dado um código de cliente, determinar, para cada mês, quantas compras fez,
     * quantos produtos distintos comprou e quanto gastou no total.
     * @param c Um cliente
     * @param mes Um mes
     * @return Um objeto com o numero de compras feitas, o numero de produtos distintos e quanto gastou no total
     */
    public ParIntDouble query3(Cliente c,int mes );

    /**
     * Dado o código de um produto existente, determinar, mês a mês,
     * quantas vezes foi comprado, por quantos clientes diferentes e o total faturado;
     * @param p Um produto
     * @param mes Um mes
     * @return Objeto com o numero de vezes que o produto foi comprado, por quantos clientes diferentes, e o total faturado
     */
    public ParIntDouble query4(Produto p,int mes);



    // public ArrayList<ParClienteFloat> query9(String cod, int x) throws ProdNExisteException;

    /**
     * Para cada filial, a lista dos três maiores compradores em termos de dinheiro faturado
     * @param filial Filial
     * @return Lista com os três maiores compradores
     */
    public List<ClienteFat> query7(int filial);

    /**
     * Determinar mês a mês, e para cada mês filial a filial, a faturação total com cada
     * produto.
     * @param filial filial
     * @return Map com o Produto, e a informacao respetiva de cada mes
     */
    public Map<Produto,List<Double>> query10(int filial);

    /**
     *Metodo que devolve um Set com os códigos de produtos que mais
     * foram comprados por um cliente (e quantos)
     * @param cod Código de cliente
     * @return Set com a informacao de codigos de produtos que mais foram comprados, e quantas unidades.
     */
    public Set<ProdutoUni> query5(String cod);

    /**
     * Dado um mês válido, e uma filial determinar o número total global de vendas realizadas e o
     *  número total de clientes distintos que as fizeram.
     * @param mes mes
     * @param filial filial
     * @return lista com os clientes e o numero total de vendas
     */
    public Map<Cliente, Integer> query22(int mes, int filial);

    /**
     * Dado o código de um produto que deve existir, determinar o conjunto dos X clientes
     * que mais o compraram e, para cada um, qual o valor gasto (ordenação cf. 5);
     * @param cod Coódigo do produto
     * @return Lista com clientes que mais compraram
     */
    public Set<ClienteGasto> query92(String cod);

    /**
     * Metodo para obter as compras por mes
     * @return Lista o numero de compras por mes
     */
    public List<Integer> comprasPMes();

    /**
     * Metodo para obter valor faturado por mes
     * @return Lista o numero de compras por mes
     */
    public List<List<Double>> fatuPmes();

    /**
     * Metodo para obter numero distintos de clientes que comparam em cada mes, filial a filial
     * @return Lista com o numero dos clientes que compraram em cada mes, filial a filial
     */
    public List<List<Integer>> clientesD();

    /**
     * Determinar os códigos dos X clientes que compraram
     * mais produtos diferentes
     * @return Lista com pares de Cliente, e o numero de produtos diferentes que esse cliente comprou
     */
    public Set<ClienteQuant> query82();

    /**
     * Metodo para limpar
     */
    public void cleanALL();

}
