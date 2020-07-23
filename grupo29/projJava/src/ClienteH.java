

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *Classe relativa a informação sobre um cliente, num determinado mes.
 * @author Joao Neves
 * @author Goncalo Nogueira
 * @author Carlos Afonso
 */

public class ClienteH implements Serializable {
        private int compras;
        private int unidades;
        private Map<Produto,Integer> lista;
        private double gastoTotal;

    /**
     * Construtor Vazio
     */
    public ClienteH() {
        this.compras=0;
        this.unidades=0;
        this.lista=new HashMap<>();
        this.gastoTotal=0.0;

    }

    /**
     * Construtor parametrizado.
     * @param compras numero de compras efetuadas.
     * @param unidades numero de unidades.
     * @param lista lista dos produtos e as unidades desse produto.
     * @param gastoTotal valor total gasto.
     */
    public ClienteH(int compras, int unidades, Map<Produto,Integer> lista, double gastoTotal) {
        this.compras = compras;
        this.unidades = unidades;
        this.lista = lista;
        this.gastoTotal = gastoTotal;
    }

    /**
     * Get do numero de compras.
     * @return numero de compras.
     */
    public int getCompras() {
        return compras;
    }

    /**
     * Set do numero de compras
     * @param compras numero de compras
     */
    public void setCompras(int compras) {
        this.compras = compras;
    }

    /**
     * Get do numero de unidades compradas
     * @return  numero de unidades compradas
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Set do numero de unidades
     * @param unidades numero de unidades
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * Get da lista de produtos comprados
     * @return lista de produtos comprados
     */
    public Map<Produto,Integer> getLista() {
        return lista;
    }

    /**
     * Set da lista de produtos comprados
     * @param lista lista de produtos comprados
     */
    public void setLista(Map<Produto,Integer> lista) {
        this.lista = lista;
    }

    /**
     * Get to valor gasto total
     * @return valor total gasto
     */
    public double getGastoTotal() {
        return gastoTotal;
    }

    /**
     * Set do valor gasto total
     * @param gastoTotal Valor total gasto
     */
    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    /**
     * Metodo para adicionar compras
     * @param compras numero de compras
     */
    public void upcompras(int compras){
            this.compras+=compras;
    }

    /**
     * Metodo para adicionar numero de unidades compradas
     * @param uni unidades compradas
     */
    public void upunidades(int uni){
            this.unidades+=uni;
    }

    /**
     * Metodo para adicionar adicionar ao valor gasto
     * @param gasto valor gasto
     */
    public void upgasto(double gasto){
            this.gastoTotal+=gasto;
    }

    /**
     * Metodo para numero de unidades de um produto à lista de produtos
     * @param p O produto
     * @param unid Quantidade de unidades
     */
    public void uplista(Produto p, int unid) {
            if(!lista.containsKey(p)){
                lista.put(p,unid);

            }else {
               int unida = this.lista.get(p);
                lista.remove(p);
                unida+=unid;
                    lista.put(p,unid);

            }
        }
}
