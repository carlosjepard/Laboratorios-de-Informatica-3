

/**
 * Classe referente as faturacoes de todas as filiais
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
public class TodasFaturacoes implements java.io.Serializable,TodasFatI {

    private Faturacao faturacaoGlobal; //faturacao total das 3 filiais
    private Faturacao faturacaoFilial1; //faturacao da filial 1
    private Faturacao faturacaoFilial2; //faturacao da filial 2
    private Faturacao faturacaoFilial3; //faturacao da filial 3

    /**
     * Construtor Vazio
     */
    public TodasFaturacoes() {
        this.faturacaoGlobal = new Faturacao();
        this.faturacaoFilial1 = new Faturacao();
        this.faturacaoFilial2 = new Faturacao();
        this.faturacaoFilial3 = new Faturacao();

    }

    /**
     * Construtor Parametrizado
     * @param faturacaoGlobal Faturacao Global
     * @param faturacaoFilial1 Faturacao da filial 1
     * @param faturacaoFilial2 Faturacao da filial 2
     * @param faturacaoFilial3 Faturacao da filial 3
     */
    public TodasFaturacoes(Faturacao faturacaoGlobal, Faturacao faturacaoFilial1, Faturacao faturacaoFilial2, Faturacao faturacaoFilial3) {
        this.faturacaoGlobal = faturacaoGlobal;
        this.faturacaoFilial1 = faturacaoFilial1;
        this.faturacaoFilial2 = faturacaoFilial2;
        this.faturacaoFilial3 = faturacaoFilial3;
    }

    /**
     * Get da Faturação global
     * @return faturacao global
     */
    public Faturacao getFaturacaoGlobal() {
        return faturacaoGlobal;
    }

    /**
     * Get da faturacao da filial 1
     * @return faturacaoFilial1
     */
    public Faturacao getFaturacaoFilial1() {
        return faturacaoFilial1;
    }

    /**
     * Get da faturacao da filial 2
     * @return faturacaoFilial2
     */
    public Faturacao getFaturacaoFilial2() {
        return faturacaoFilial2;
    }

    /**
     * Get da Faturacao da filial 3
     * @return faturacaoFilial3
     */
    public Faturacao getFaturacaoFilial3() {
        return faturacaoFilial3;
    }

    /**
     * Set da Faturacao Global
     * @param faturacaoGlobal Faturacao Global
     */
    public void setFaturacaoGlobal(Faturacao faturacaoGlobal) {
        this.faturacaoGlobal = faturacaoGlobal;
    }

    /**
     * Set da Faturacao da filial 1
     * @param faturacaoFilial1 faturacao Filial 1
     */
    public void setFaturacaoFilial1(Faturacao faturacaoFilial1) {
        this.faturacaoFilial1 = faturacaoFilial1;
    }

    /**
     * Set da Faturação Filial 2
     * @param faturacaoFilial2 faturação Filial 2
     */
    public void setFaturacaoFilial2(Faturacao faturacaoFilial2) {
        this.faturacaoFilial2 = faturacaoFilial2;
    }

    /**
     * Set da Faturacao da filial 3
     * @param faturacaoFilial3 faturacao Filial 3
     */
    public void setFaturacaoFilial3(Faturacao faturacaoFilial3) {
        this.faturacaoFilial3 = faturacaoFilial3;
    }

    /**
     * Metodo para limpar estruturas das Filiais
     */
    public void cleanFat(){
        faturacaoFilial1.cleanFat();
        faturacaoFilial2.cleanFat();
        faturacaoFilial3.cleanFat();
        faturacaoGlobal.cleanFat();
    }

}