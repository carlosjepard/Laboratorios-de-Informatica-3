

import java.io.Serializable;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Objects;

/**
 * Classe relativa a estatistica
 * @author Goncalo Nogueira
 * @author Joao Neves
 * @author Carlos Afonso
 */
public class Estatisticas implements EstatisticasI, Serializable {


        //nome do ficheiro
            private String nomeFicheiro;
        //numero total de registos de venda errados
            private int registoserrados;
        //numero total de produtos
            private int numerodeProdutos;
        //numero total de diferentes produtos comprados
            private int prdifcompr;
        //numero total de produtos diferentes nao comprados
            private int prdiffncomp;
        //numero total de clientes
            private int numeroTotalCli;
        //numero total de clientes que realizaram compras
            private int numeroTotalCC;
        //numero total de clientes que  nao compraram nada
            private int nCompCli;
        //numero total de compras de valor igual a 0.0
            private double compras0;
        //faturacao total
            private int fatTotal;

    /**
     * Construtor Vazio
     */
    public Estatisticas(){
                this.nomeFicheiro="vazio";
                this.registoserrados=0;
                this.numerodeProdutos=0;
                this.prdifcompr=0;
                this.prdiffncomp=0;
                this.numeroTotalCli=0;
                this.numeroTotalCC=0;
                this.nCompCli=0;
                this.compras0=0.0;
                this.fatTotal=0;


            }

    /**
     * Construtor por objeto
     * @param e Objeto Estatisticas
     */
    public Estatisticas(Estatisticas e){
        this.nomeFicheiro=e.getNomeFicheiro();
        this.registoserrados=e.getRegistoserrados();
        this.numerodeProdutos=e.getNumerodeProdutos();
        this.prdifcompr=e.getPrdifcompr();
        this.prdiffncomp=e.getPrdiffncomp();
        this.numeroTotalCli=e.getNumeroTotalCli();
        this.numeroTotalCC=e.getNumeroTotalCC();
        this.nCompCli=e.nCompCli;
        this.compras0=e.getCompras0();
        this.fatTotal=e.getFatTotal();

    }

    /**
     * Get do nome do ficheiro
     * @return nome do ficheiro
     */
    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    /**
     * Set do nome do Ficheiro
     * @param nomeFicheiro nome do Ficheiro
     */
    public void setNomeFicheiro(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    /**
     * Get registos errados
     * @return registos errados
     */
    public int getRegistoserrados() {
        return registoserrados;
    }

    /**
     * Set dos registos errados
     * @param registoserrados registos errados
     */
    public void setRegistoserrados(int registoserrados) {
        this.registoserrados = registoserrados;
    }

    /**
     * Get do numero de produtos
     * @return numero de produtos
     */
    public int getNumerodeProdutos() {
        return numerodeProdutos;
    }

    /**
     * Set do numero de produtos
     * @param numerodeProdutos numero de produtos
     */
    public void setNumerodeProdutos(int numerodeProdutos) {
        this.numerodeProdutos = numerodeProdutos;
    }

    /**
     * Get do numero total de diferentes produtos comprados
     * @return numero total de diferentes produtos comprados
     */
    public int getPrdifcompr() {
        return prdifcompr;
    }

    /**
     * Set do numero total de diferentes produtos comprados
     * @param prdifcompr numero de diferentes produtos comprados
     */
    public void setPrdifcompr(int prdifcompr) {
        this.prdifcompr = prdifcompr;
    }

    /**
     * Get do numero total de diferentes produtos nao comprados
     * @return numero total de diferentes produtos nao comprados
     */
    public int getPrdiffncomp() {
        return prdiffncomp;
    }

    /**
     * Set do numero total de diferentes produtos nao comprados
     * @param prdiffncomp numero total de diferentes produtos nao comprados
     */
    public void setPrdiffncomp(int prdiffncomp) {
        this.prdiffncomp = prdiffncomp;
    }

    /**
     * Get do numero total de clientes
     * @return numero total de clientes
     */
    public int getNumeroTotalCli() {
        return numeroTotalCli;
    }

    /**
     * Set do numero total de clientes
     * @param numeroTotalCli numero total de clientes
     */
    public void setNumeroTotalCli(int numeroTotalCli) {
        this.numeroTotalCli = numeroTotalCli;
    }

    /**
     * Get do numero total de clientes que realizaram compras
     * @return numero total de clientes que realizaram compras
     */
    public int getNumeroTotalCC() {
        return numeroTotalCC;
    }

    /**
     * Set do numero total de clientes que realizaram compras
     * @param numeroTotalCC numero total de clientes que realizaram compras
     */
    public void setNumeroTotalCC(int numeroTotalCC) {
        this.numeroTotalCC = numeroTotalCC;
    }

    /**
     * Get do numero total de clientes que nao realizaram compras
     * @return numero total de clientes que nao realizaram compras
     */
    public int getnCompCli() {
        return nCompCli;
    }

    /**
     * Set do numero total de clientes que nao realizaram compras
     * @param nCompCli numero total de clientes que nao realizaram compras
     */
    public void setnCompCli(int nCompCli) {
        this.nCompCli = nCompCli;
    }

    /**
     * Get do numero total de compras de valor igual a 0.0
     * @return numero total de compras
     */
    public double getCompras0() {
        return compras0;
    }

    /**
     * Set do numero total de compras de valor igual a 0.0
     * @param compras0 numero total de compras de valor 0.0
     */
    public void setCompras0(double compras0) {
        this.compras0 = compras0;
    }

    /**
     * Get do valor faturado
     * @return valor faturado
     */
    public int getFatTotal() {
        return fatTotal;
    }

    /**
     * Set do valor faturado
     * @param fatTotal valor faturado
     */
    public void setFatTotal(int fatTotal) {
        this.fatTotal = fatTotal;
    }

    /**
     * Metodo toString
     * @return String
     */
    public String toString() {
        return "Estatisticas" +
                "nomeFicheiro='" + nomeFicheiro + '\'' +
                ", registoserrados=" + registoserrados +
                ", numerodeProdutos=" + numerodeProdutos +
                ", prdifcompr=" + prdifcompr +
                ", prdiffncomp=" + prdiffncomp +
                ", numeroTotalCli=" + numeroTotalCli +
                ", numeroTotalCC=" + numeroTotalCC +
                ", nCompCli=" + nCompCli +
                ", compras0=" + compras0 +
                ", fatTotal=" + fatTotal ;

}

    /**
     * Metodo equals
     * @param o Objeto
     * @return True ou False
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estatisticas)) return false;
        Estatisticas that = (Estatisticas) o;
        return getRegistoserrados() == that.getRegistoserrados() &&
                getNumerodeProdutos() == that.getNumerodeProdutos() &&
                getPrdifcompr() == that.getPrdifcompr() &&
                getPrdiffncomp() == that.getPrdiffncomp() &&
                getNumeroTotalCli() == that.getNumeroTotalCli() &&
                getNumeroTotalCC() == that.getNumeroTotalCC() &&
                getnCompCli() == that.getnCompCli() &&
                Double.compare(that.getCompras0(), getCompras0()) == 0 &&
                getFatTotal() == that.getFatTotal() &&
                Objects.equals(getNomeFicheiro(), that.getNomeFicheiro()) ;

    }

    /**
     * Metodo clone
     * @return objeto this
     */
    public Estatisticas clone(){return new Estatisticas(this);}

    /**
     * Metodo para limpar Estatisticas
     */
    public void cleanE(){
        this.setnCompCli(0);
        this.setNumeroTotalCC(0);
        this.setPrdifcompr(0);
        this.setPrdiffncomp(0);
        this.setNumerodeProdutos(0);
        this.setNumeroTotalCli(0);
        this.setFatTotal(0);
        this.setRegistoserrados(0);
        this.setNomeFicheiro(" ");
        this.setCompras0(0.0);
    }

}
