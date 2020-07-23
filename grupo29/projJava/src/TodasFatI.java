import java.io.Serializable;

/**
 * Interface referente a classe TodasFaturacoes
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
public interface TodasFatI extends Serializable {

    /**
     * Metdod get da faturacao total
     * @return Faturacao
     */
    public Faturacao getFaturacaoGlobal();

    /**
     * Metodo get da faturacao da filial1
     * @return Faturacao1
     */
    public Faturacao getFaturacaoFilial1();

    /**
     * Metodo get da faturacao da filial 2
     * @return Faturacao 2
     */
    public Faturacao getFaturacaoFilial2();

    /**
     * Metodo get da faturacao da filial 3
     * @return Faturacao 3
     */
    public Faturacao getFaturacaoFilial3();

    /**
     * Metodo Set da faturacao global
     * @param faturacaoGlobal Faturacao Global
     */
    public void setFaturacaoGlobal(Faturacao faturacaoGlobal);

    /**
     * Metodo set da faturacao filial 1
     * @param faturacaoFilial1 Faturacao da filial 1
     */
    public void setFaturacaoFilial1(Faturacao faturacaoFilial1);

    /**
     * Metodo set da faturacao filial 2
     * @param faturacaoFilial2 Faturacao da filial 2
     */
    public void setFaturacaoFilial2(Faturacao faturacaoFilial2);

    /**
     * Metodo set da faturacao da filial 3
     * @param faturacaoFilial3 Faturacao filial 3
     */
    public void setFaturacaoFilial3(Faturacao faturacaoFilial3);

    /**
     * Metodo para limpar
     */
    public void cleanFat();
}
