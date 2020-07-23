

import java.io.Serializable;
import java.util.*;

/**
 * Interface com os relativos Metodos
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public interface GestVendasViewI extends Serializable {

    /**
     * Metodo para obter opcao
     * @return Opcao
     */
    public int getOpt();

    /**
     * Metodo para apresentar menu principal
     */
    public void printMenu();

    /**
     * Metodo para apresentar o resultado da query 1
     * @param lista Lista com os produtos comprados por ninguém
     */
    public void query1_out(TreeSet<Produto> lista);

    /**
     * Metodo para apresentacao da opcao de inserccão de mês
     */
    public void query2_in();

    /**
     * Metodo para apresentacão do resultado a query 2
     * @param ret resultados da filial 1
     * @param ret2 resultados da filial 2
     * @param ret3 resultados da filial 3
     * @param mes Mes
     */
    public void query2_out(Map<Cliente, Integer> ret,Map<Cliente, Integer> ret2, Map<Cliente, Integer> ret3,int mes);

    /**
     * Metodo de apresentacão da opcão de inserir codigo do cliente
     */
    public void query3_in();

    /**
     * Metodo para apresentar resultados da query 3
     * @param i mes
     * @param res resultado
     */
    public void query3_out(int i, ParIntDouble res);

    /**
     * Metodo de apresentacão da opcão de inserir numero de produto
     */
    public void query4_in();

    /**
     * Metodo para apresentar resultados da query 4
     * @param i mes
     * @param res resultado
     */
    public void query4_out(int i,ParIntDouble res);

    /**
     * Metodo de apresentacão da opcão de inserir codigo de cliente
     */
    public void query5_in();

    /**
     * Metodo para apresentar resultados da query 5
     * @param res resultado
     * @param x unidades
     */
    public void query5_out(Set<ProdutoUni> res, int x);

    /**
     * Metodo de apresentacão da opcão de inserir o numero de produtos
     */
    public void query6_in();

    /**
     * Metodo para apresentar resultados da query 6
     * @param res resultado
     * @param x numero de produtos
     * @param aux lista com numero de clientes distintos
     */
    public void query6_out(List<ParProdInt> res, int x, List<Integer> aux);

    /**
     * Metodo de apresentacão de texto relativo a query 7
     */
    public void query7_in();

    /**
     * Metodo para apresentar resultados da query 7
     * @param ret1 resultado 1
     * @param ret2 resultado 2
     * @param ret3 resultado 3
     */
    public void query7_out(List<ClienteFat> ret1,List<ClienteFat> ret2,List<ClienteFat> ret3);

    /**
     * Metodo de apresentacão da opcão de inserir numero de clientes
     */
    public void query8_in();

    /**
     * Metodo de apresentacão do resultado da query 8
     * @param ret resultado
     * @param x numero de clientes
     */
    public void query8_out(Set<ClienteQuant> ret,int x);

    /**
     * Metodo de apresentacão da opcão de inserir o numero de clientes
     */
    public void query9_in1();

    /**
     * Metodo de apresentacão da opcão de inserir codigo do produto
     */
    public void query9_in2();

    /**
     * Metodo de apresentacão do resultado da query 9
     * @param ret resultado
     * @param x numero de clientes
     * @param cod codigo do produto
     */
    public void query9_out(Set<ClienteGasto> ret,int x, String cod);

    /**
     * Metodo de apresentacão do texto relativo a query 10
     */
    public void query10_in();

    /**
     * Metodo para apresentar resultado da query 10
     * @param ret1 resultado
     * @param ret2 resultado 2
     * @param ret3 resultado 3
     */
    public void query10_out(Map<Produto, List<Double>> ret1,Map<Produto, List<Double>> ret2,Map<Produto, List<Double>> ret3);

    /**
     * Metodo de apresentacão da opcao 11
     * @param e Estatisticas
     */
    public void query11_out(EstatisticasI e);

    /**
     * Metodo de apresentacao das estatisticas
     * @param e estatisticas
     */
    public void printStats(EstatisticasI e);

    /**
     * Metodo para limpar o ecrã
     */
    public static void clearScreen(){};

    /**
     * Metodo de apresentacão do tempo de execucão
     * @param t tempo
     */
    public void time(double t);

    /**
     * Metodo para apresentacao das opcoes de ficheiros txt a carregar
     */
    public void ficheiro_in();

    /**
     * Metodo para escolha do ficheiro txt
     * @param x Opcão
     * @return path do ficheiro escolhido
     */
    public String ficheiro_out(int x);

    /**
     * Metodo de apresentacao de texto relativo a opcão 12
     */
    public void query12_in();

    /**
     * Metodo de consulta de estatisticas
     * @param e1 numero de compras
     * @param ret1 faturado por filial
     * @param ret2 numero distinto de clientes por filial
     */
    public void query12_out(List<Integer> e1,List<List<Double>> ret1,List<List<Integer>> ret2);

    /**
     * Metodo de apresentacão de escolha de qual filial pretende
     */
    public void filialIn();

    /**
     * Metodo destinado a testes
     * @param ret Set
     * @param x valor
     */
    public void query8_outTeste(Set<ClienteQuant> ret,int x);

    /**
     * Metodo destinado a testes
     * @param ret set
     * @param x int
     * @param cod cod
     */
    public void query9_outTeste(Set<ClienteGasto> ret,int x, String cod);
}
