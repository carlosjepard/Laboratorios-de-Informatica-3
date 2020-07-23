

/**
 *Classe relativa a informacao sobre um produto, num determinado mes.
 * @author Joao Neves
 * @author Goncalo Nogueira
 * @author Carlos Afonso
 */

import java.io.Serializable;
import java.util.*;

/**
 * Classe referente aos detalhes de um produto num mes
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class ProdutoH implements Serializable {
    private int compradox;
    private Map<Cliente,ParIntDouble> lista;
    private double fatTotal;

    /**
     * Construtor parametrizado
     * @param compradox comprados
     * @param lista Lista
     * @param fatTotal Fat total
     */
    public ProdutoH(int compradox, Map<Cliente,ParIntDouble> lista, double fatTotal) {
        this.compradox = compradox;
        this.lista = lista;
        this.fatTotal = fatTotal;

    }

    /**
     * Construtor por omissao
     */
    public ProdutoH() {
        this.compradox = 0;
        this.lista = new HashMap<>();
        this.fatTotal = 0.0;

    }

    /**
     * Construtor por Objeto
     * @param h Objeto ProdutoH
     */
    public ProdutoH(ProdutoH h){
       this.compradox=h.getCompradox();
       this.lista=h.getLista();
       this.fatTotal=h.getFatTotal();
    }

    /**
     * Get do valor de produtos comprados
     * @return comprados
     */
    public int getCompradox() {
        return compradox;
    }

    /**
     * Set do valor Numero de comprados
     * @param compradox comprados
     */
    public void setCompradox(int compradox) {
        this.compradox = compradox;
    }

    /**
     * Lista de Clientes que compraram o produto
     * @return lista de clientes que compraram o produto
     */
    public Map<Cliente,ParIntDouble> getLista() {
        return lista;
    }

    /**
     * Set da lista de clientes que compraram o produto
     * @param lista lista de clientes que compraram o produto
     */
    public void setLista(Map<Cliente,ParIntDouble> lista) {
        this.lista = lista;
    }

    /**
     * Get do valor faturado
     * @return faturado
     */
    public double getFatTotal() {
        return fatTotal;
    }

    /**
     * Set do valor faturado
     * @param fatTotal faturado
     */
    public void setFatTotal(double fatTotal) {
        this.fatTotal = fatTotal;
    }

    /**
     * Adicionar um numero de comprados
     * @param uni numero de comprados
     */
    public void upcompradox(int uni){
        this.compradox+=uni;
    }

    /**
     * Adicionar um valor faturado
     * @param uni valor faturado
     */
    public void upfat(double uni){
        this.fatTotal+=uni;
    }

    /**
     * Adicionar uma compra deste produto
     * @param c Cliente
     * @param fat faturado
     * @param unid unidades
     */
    public void upLista(Cliente c,double fat,int unid){
        if(!lista.containsKey(c)){
            ParIntDouble mete=new ParIntDouble(1,fat,unid);
            lista.put(c,mete);
        }else{
            ParIntDouble aux=lista.get(c.clone());
            lista.remove(c,aux);
            aux.setCompras(aux.getCompras()+1);
            aux.setCompras(aux.getProdutos()+unid);
            aux.setCompras(aux.getProdutos()+unid);
            lista.put(c,aux);
        }
    }

    /**
     * Metodo toString
     * @return String
     */
    @Override
    public String toString() {
        return "ProdutoH{" +
                "compradox=" + compradox +
                ", lista=" + lista +
                ", fatTotal=" + fatTotal +
                '}';
    }

    /**
     * Metodo Equals
     * @param o Objeto
     * @return this
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProdutoH)) return false;
        ProdutoH produtoH = (ProdutoH) o;
        return getCompradox() == produtoH.getCompradox() &&
                Double.compare(produtoH.getFatTotal(), getFatTotal()) == 0 &&
                Objects.equals(getLista(), produtoH.getLista());
    }

    /**
     * Método Clone
     * @return this
     */
   public ProdutoH clone(){return new ProdutoH(this);}

    /**
     * Metodo para obter clientes Distintos
     * @return numero de clientes distintos
     */
    public int ClientesDistintos()
    {
        return this.lista.size();
    }
}