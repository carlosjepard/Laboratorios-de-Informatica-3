

import java.util.*;

/**
 * Classe relativa às vendas de um produto
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class Faturacao implements java.io.Serializable {

    private HashMap<Produto,HashSet<Vendas>> faturacao; //HashMap de produto como chave contendo todas as suas vendas

    /**
     * Construtor vazio
     */
    public Faturacao(){
        faturacao=new HashMap<>();
    }

    /**
     * Set da colecao faturacao
     * @param f faturacao
     */
    //setters
    public void setFaturacao(HashMap<Produto,HashSet<Vendas>> f){
        this.faturacao = new HashMap<>();
        for(Produto a : f.keySet()){
            for(HashSet<Vendas> b: f.values()) {
                this.faturacao.put(a.clone(), (HashSet<Vendas>) b.clone());
            }
        }
    }

    /**
     * Set da faturacao
     * @param p Produto
     * @param vendas vendas desse produto
     */
    public void setFaturacaoProduto(Produto p,HashSet<Vendas> vendas){
        faturacao.put(new Produto(p),vendas);
    }

    /**
     * Get da colecao faturacao
     * @return faturacao
     */

    public HashMap<Produto,HashSet<Vendas>> getFaturacao(){
        return this.faturacao;
    }

    /**
     * Get das Vendas de um produto
     * @param p Produto
     * @return Vendas desse produto
     */
    public HashSet<Vendas> getFaturacaoProduto(Produto p){
        return faturacao.get(p);
    }

    /**
     * Adicionar uma venda à colecao faturacao
     * @param v Uma venda
     */

    public void addVenda(Vendas v){
        if(faturacao.containsKey(v.getProduto())){
            faturacao.get(v.getProduto()).add(v);
        }
        else{
            HashSet<Vendas> nova = new HashSet<>();
            nova.add(v);
            faturacao.put(v.getProduto(),nova);
        }
    }

    /**
     * Metodo clone
     * @return objeto Faturacao
     */
    public Faturacao clone(){
        Faturacao fat = new Faturacao();
        HashMap<Produto, HashSet<Vendas>> copia = new HashMap<>();

        this.faturacao.forEach( (p,v) ->{
                    HashSet<Vendas> vendas = new HashSet<>();
                    for(Vendas x : v){
                        vendas.add(x.clone());
                    }
                    copia.put(p.clone() ,vendas);
                }
        );
        fat.setFaturacao(faturacao);
        return fat;
    }



    /**
     * Metodo toString
     * @return String
     */
    @Override
    public String toString() {
        return "Faturacao{" + "faturacao=" + faturacao + '}';
    }

    /**
     * Metodo para limpar estrutura
     */
    public void cleanFat(){
        faturacao.clear();

    }

}