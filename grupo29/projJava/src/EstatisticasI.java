import java.io.Serializable;

/**Interface com os seguintes metodos
 * @author Carlos Afonso
 * @author Goncalo Nogueira
 * @author Joao Neves
 */
public interface EstatisticasI extends Serializable {
    /**
     * Get do nome do ficheiro
     * @return nome do ficheiro
     */
    public String getNomeFicheiro();

    /**
     * Set do nome do ficheiro
     * @param nomeFicheiro nome do ficheiro
     */
    public void setNomeFicheiro(String nomeFicheiro);

    /**
     * Get do numero de registos errados
     * @return numero de registos errados
     */
    public int getRegistoserrados();

    /**
     * Set do numero de regisots errados
     * @param registoserrados registos errados
     */
    public void setRegistoserrados(int registoserrados);

    /**
     * Get do numero de produtos
     * @return numero de produtos
     */
    public int getNumerodeProdutos();

    /**
     * Set do numero de Produtos
     * @param numerodeProdutos numero de Produtos
     */
    public void setNumerodeProdutos(int numerodeProdutos);

    /**
     * Get do numero de produtos diferentes comprados
     * @return numero de produtos diferentes comprados
     */
    public int getPrdifcompr();

    /**
     * Set do numero de produtos diferentes comprados
     * @param prdifcompr numero de produtos diferentes comprados
     */
    public void setPrdifcompr(int prdifcompr);

    /**
     * Get do numero de produtos diferentes nao comprados
     * @return int
     */
    public int getPrdiffncomp();

    /**
     * Set do numero de produtos diferentes nao comprados
     * @param prdiffncomp numero de produtos
     */
    public void setPrdiffncomp(int prdiffncomp);

    /**
     * Get do numero total de clientes
     * @return int
     */
    public int getNumeroTotalCli();

    /**
     * Set do numero total de clientes
     * @param numeroTotalCli numero total de clientes
     */
    public void setNumeroTotalCli(int numeroTotalCli);

    /**
     * Get do numero total de clientes que compraram
     * @return numero total de clientes que compraram
     */
    public int getNumeroTotalCC();

    /**
     * Set do numero total de clientes que compraram
     * @param numeroTotalCC numero total de clientes que compraram
     */
    public void setNumeroTotalCC(int numeroTotalCC);

    /**
     * Get do numero de clientes que nao compraram
     * @return numero de clientes que nao compraram
     */
    public int getnCompCli();

    /**
     * Set do numero de clientes que nao compraram
     * @param nCompCli numero de clientes que nao compraram
     */
    public void setnCompCli(int nCompCli);

    /**
     * Get do numero compras de valor 0.0
     * @return numero de compras de valor 0.0
     */
    public double getCompras0();

    /**
     * Set do numero de compras de valor 0.0
     * @param compras0 numero de comrpra de valor 0.0
     */
    public void setCompras0(double compras0);

    /**
     * Get do valor total faturado
     * @return valor total faturado
     */
    public int getFatTotal();

    /**
     * Set do falor faturado
     * @param fatTotal valor faturado
     */
    public void setFatTotal(int fatTotal);

    /**
     * Metodo para limpar Estatisticas
     */
    public void  cleanE();
}

