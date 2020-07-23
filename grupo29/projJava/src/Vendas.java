

import java.lang.*;

/**
 * Classe relativa a uma instância de uma Venda
 * @author Carlos Afonso
 * @author Gonçalo Nogueira
 * @author Joao Neves
 */
public class Vendas implements java.io.Serializable ,Comparable<Vendas>,VendasI{

    private final Produto produto;
    private final double preco;
    private final int unidades;
    private final char modo;
    private final Cliente cliente;
    private final int mes;
    private final int filial;




    /**
     * Construtor Parametrizado
     * @param po Produto
     * @param pr Preco
     * @param u Unidades
     * @param m Modo (P/N)
     * @param c Cliente
     * @param me Mes
     * @param f Filial
     */
    public Vendas(String po, double pr, int u, char m, String c, int me, int f){
        produto=new Produto(po);
        preco=pr;
        unidades=u;
        modo=m;
        cliente=new Cliente(c);
        mes=me;
        filial=f;
    }

    /**
     * Construtor por Objeto
     * @param v Objeto Vendas
     */
    public Vendas(Vendas v){
        produto=new Produto(v.getProduto());
        preco=v.getPreco();
        unidades=v.getUnidades();
        modo=v.getModo();
        cliente=new Cliente(v.getCliente());
        mes=v.getMes();
        filial=v.getFilial();
    }


    //getters

    /**
     * Get do Produti
     * @return Produto
     */
    public Produto getProduto(){return produto;}

    /**
     * Get do Preco
     * @return Preco
     */
    public double getPreco(){return preco;}

    /**
     * Get das unidades
     * @return unidades
     */
    public int getUnidades(){return unidades;}

    /**
     * Get do tipo de compra
     * @return tipo de compra
     */
    public char getModo(){return modo;}

    /**
     * Get do Cliente
     * @return Cliente
     */
    public Cliente getCliente(){return cliente;}
    public int getMes(){return mes;}

    /**
     * Get da Filial
     * @return Filial
     */
    public int getFilial(){return filial;}

    /**
     * Metodo Clone
     * @return this
     */
    public Vendas clone(){
        return new Vendas(this);
    }

    /**
     * Metodo toString
     * @return String
     */
    public String toString(){

        return "Produto " +
                produto.getCodigo() +
                " Preco " +
                preco +
                " Unidades " +
                unidades +
                " Modo " +
                modo +
                " Cliente " +
                cliente.getCodigo() +
                " Mes " +
                mes +
                " Filial " +
                filial + "\n";
    }


    /**
     * Metodo Equals
     * @param object Objeto
     * @return True ou False
     */
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        final Vendas other = (Vendas) object;
        return this.preco==other.getPreco() && this.unidades==other.getUnidades() &&
               this.modo==other.getModo() && this.mes==other.getMes() &&
               this.filial==other.getFilial() && this.getCliente().equals(other.getCliente()) &&
               this.getProduto().equals(other.getProduto());
    }

    /**
     * Metodo de Comparação
     * @param v Vendas
     * @return 1 ou -1
     */
    public int compareTo(Vendas v){
        if(produto.compareTo(v.getProduto())!=0) return produto.compareTo(v.getProduto());
        if(preco!=v.getPreco())
            if(preco<v.getPreco()) return -1;
            else return 1;
        if(unidades!=(v.getUnidades()))
            if(unidades<v.getUnidades()) return -1;
            else return 1;
        if(modo!=v.getModo())
            if(modo<v.getModo()) return -1;
            else return 1;
        if(cliente.compareTo(v.getCliente())!=0) return produto.compareTo(v.getProduto());
        if(mes!=v.getMes())
            if(mes<v.getMes()) return -1;
            else return 1;
        if(filial!=v.getFilial())
            if(filial<v.getFilial()) return -1;
            else return 1;
        return 0;
    }

    /**
     * Metodo HashCode
     * @return int
     */
    public int hashCode() {
        int hash = 7;
        hash = 24 * hash + this.produto.hashCode();
        hash = 24 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 24 * hash + this.unidades;
        hash = 24 * hash + this.modo;
        hash = 24 * hash + this.cliente.hashCode();
        hash = 24 * hash + this.mes;
        hash = 24 * hash + this.filial;
        return hash;
    }

}