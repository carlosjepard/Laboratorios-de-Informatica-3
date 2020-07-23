



import java.util.*;
import java.util.stream.IntStream;

/**
 * Classe relativa ao modulo Filial
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class Filial implements java.io.Serializable,FilialI {

    private HashMap<Cliente, List<ClienteH>> clientH1;

    private HashMap<Produto, List<ProdutoH>> produtoH1;

    /**
     * Construtor vazio
     */
    public Filial() {
        this.clientH1 = new HashMap<>();
        this.produtoH1 = new HashMap<>();
    }

    /**
     * Get do HashMap referente a um cliente, e a sua informacao relativa a todos os meses
     * @return HashMap referente a um cliente, e a sua informacao relativa a todos os meses
     */
    public HashMap<Cliente, List<ClienteH>> getClientH1() {
        return clientH1;
    }


    /**
     * Get HashMap referente a um Produto, e a sua informacao relativa a todos os meses
     * @return HashMap referente a um Produto, e a sua informacao relativa a todos os meses
     */
    public HashMap<Produto, List<ProdutoH>> getProdutoH1() {
        return produtoH1;
    }



    //contrutor parametrizado

    /**
     * Construtor Parametrizado
     * @param clientH1 HashMap referente a um cliente, e a sua informacao relativa a todos os meses
     * @param produtoH1 HashMap referente a um Produto, e a sua informacao relativa a todos os meses
     */
    public Filial(HashMap<Cliente, List<ClienteH>> clientH1, HashMap<Produto, List<ProdutoH>> produtoH1) {
        this.clientH1 = clientH1;
        this.produtoH1 = produtoH1;
    }

    /**
     * Construtor por objeto
     * @param a Objeto Filial
     */
    public Filial(Filial a) {
        this.produtoH1 = a.getProdutoH1();
        this.clientH1 = a.getClientH1();
    }

    /**
     * Método Equals
     * @param o Objeto o
     * @return True ou False
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filial)) return false;
        Filial filial = (Filial) o;
        return Objects.equals(getClientH1(), filial.getClientH1()) &&
                Objects.equals(getProdutoH1(), filial.getProdutoH1());
    }

    /**
     * Adicionar os detalhes de uma venda
     * @param v Uma venda
     */
    public void upFilial(Vendas v){
        upCliente(v.getUnidades(),v.getPreco(),v.getMes(),v.getCliente(),v.getProduto());
        upProduto(v.getCliente(),v.getProduto(),v.getUnidades(),v.getPreco(),v.getMes());

    }

    /**
     * Adidionar um Cliente
     * @param unid Unidades compradas
     * @param fat Valor faturado
     * @param mes Mes
     * @param cli Cliente
     * @param p Produto
     */
    public void upCliente(int unid,double fat,int mes,Cliente cli,Produto p){
        int i=0;
        if(!clientH1.containsKey(cli)){

            ArrayList<ClienteH> a=new ArrayList<>();
            for(i=0;i<12;i++){
                a.add(new ClienteH());
            }
            ClienteH cl=a.get(mes-1);
            cl.upcompras(1);
            cl.upgasto(fat*unid);
            cl.uplista(p,unid);

            cl.upunidades(unid);
            this.clientH1.put(cli,a);

        }else {

            List<ClienteH> b =this.clientH1.get(cli);
            ClienteH c= b.get(mes-1);
            c.upunidades(unid);
            c.uplista(p,unid);
            c.upgasto(fat*unid);
            c.upcompras(1);

            this.clientH1.remove(cli);
            this.clientH1.put(cli,b);
        }

    }

    /**
     * Adiciona um produto
     * @param cli Cliente
     * @param pr Produto
     * @param comprados Numero de Produtos comprados
     * @param fat Valor faturado
     * @param mes Mes
     */
    public void upProduto(Cliente cli,Produto pr,int comprados, double fat,int mes){
        int i=0;
        if(!produtoH1.containsKey(pr)){
            ArrayList<ProdutoH> lista=new ArrayList<>();
            for(i=0;i<12;i++) lista.add(new ProdutoH());
            ProdutoH pr1=lista.get(mes-1);
            pr1.upcompradox(1);
            pr1.upfat(fat*comprados);
            pr1.upLista(cli,fat*comprados,comprados);
            produtoH1.put(pr,lista);
        }else{
            List<ProdutoH> lista=this.produtoH1.get(pr);
            ProdutoH prod=lista.get(mes-1);
            prod.upLista(cli,fat*comprados,comprados);
            prod.upcompradox(1);
            prod.upfat(fat*comprados);
            this.produtoH1.remove(pr);
            this.produtoH1.put(pr,lista);



        }
    }

    /**
     * Método para obter o numero de clientes distintos total num mes
     * @param mes Mes
     * @return Numero de clientes distintos
     */
    public int getClientesDistintosTotal(int mes) {
        int cl;
        ClienteH rc = new ClienteH();
        //se não for um registo vazio conta
        cl = (int) clientH1.entrySet().stream().filter(e -> !e.getValue().get(mes - 1).equals(rc)).count();

        return cl;
    }


    /**
     * Método para obter numero de clientes distintos que compraram um Produto
     * @param p Um produto
     * @return Numero de clientes distintos que compraram um produto
     */
    public int getClientesDistintos(Produto p) {
        int res=0;
        if(this.produtoH1.containsKey(p))
            res = IntStream.range(0, 12).map(i -> this.produtoH1.get(p).get(i).ClientesDistintos()).sum();
        return res;

    }

    /**
     * Método que coloca clientes distintos num Set
     * @param p Produto
     * @param s Set onde serao colocados os clientes que compraram o produto
     */
    public void getClientes(String p, Set<Cliente> s)
    {
            if (produtoH1.containsKey(p)) {
                List<ProdutoH> rp = produtoH1.get(p);
                for (ProdutoH r : rp) {
                        for(Map.Entry<Cliente,ParIntDouble> ph: r.getLista().entrySet()){
                        s.add(ph.getKey().clone());
                    }
                }
            }
    }


    /**
     *Método para obter  clientes diferentes no total das filiais todas
     * @param c Cliente
     * @param mes Mes
     * @return Par onde é guardado o numero de compras, o total faturado e as unidades de produtos
     */
    public ParIntDouble comprasCM(Cliente c, int mes){
    int ind=mes-1;
    ParIntDouble res=new ParIntDouble();
    int compras=0;
    int produtos=0;
    double fat=0;
        if(clientH1.containsKey(c)) {
            compras = clientH1.get(c).get(ind).getCompras();
            produtos=clientH1.get(c).get(ind).getLista().size();
            fat = clientH1.get(c).get(ind).getGastoTotal();
        }
        res.setCompras(compras);
        res.setFat(fat);
        res.setProdutos(produtos);
    return res;
}

    /**
     *Método para obter  produtos diferentes no total das filiais todas
     * @param p Cliente
     * @param mes Mes
     * @return Par onde é guardado o numero de compras, o total faturado e as unidades de produtos
     */
    public ParIntDouble comprasPM(Produto p,int mes){
    int ind=mes-1;
    ParIntDouble res=new ParIntDouble();
    int compras=0;
    int clientes=0;
    double fat=0;
            if(produtoH1.containsKey(p)){
                    compras=produtoH1.get(p).get(ind).getCompradox();
                    clientes=produtoH1.get(p).get(ind).getLista().size();
                    fat=produtoH1.get(p).get(ind).getFatTotal();
            }
            res.setProdutos(clientes);
            res.setCompras(compras);
            res.setFat(fat);

return res;
}

    /**
     * Método para obter o Faturado por um cliente
     * @return Lista com o faturado por cada cliente
     */
    public Set<ClienteFat> getFatC(){
        Set<ClienteFat> ret=new TreeSet<>(new ComparatorClienteFat());
        for(Map.Entry<Cliente, List<ClienteH>> ch : clientH1.entrySet())
        {
            ClienteFat cf=new ClienteFat();
            double faturado = 0;
            for(ClienteH rc : ch.getValue())
            {
                faturado += rc.getGastoTotal();
            }
            cf.setC(ch.getKey());
            cf.setFat(faturado);

            ret.add(cf);
        }
        return ret;
    }

    /**
     * Método para obter o faturado num mes
     * @return Map com o produto, e o faturado em cada mes.
     */
    public Map<Produto,List<Double>>fatmes(){

        Map<Produto,List<Double>> ret=new HashMap<>();
        for(Map.Entry<Produto,List<ProdutoH>> ph: produtoH1.entrySet()){

            List<Double> lista=new ArrayList<>();
            for(ProdutoH ph1:ph.getValue()){
                lista.add(ph1.getFatTotal());
            }
            ret.put(ph.getKey(),lista);
        }
        return ret;
    }

    /**
     * Método para obter os produtos e as respetivas unidades, de um cliente
     * @param c Cliente
     * @return list de pares de produtos e unidades
     */
    public List<ProdutoUni> produtosUnid(Cliente c) {
        List<ProdutoUni> ret=new ArrayList<>();
        for(ClienteH a: clientH1.get(c)){
            Map<Produto,Integer> aux=a.getLista();
            for(Map.Entry<Produto,Integer> ph: aux.entrySet()){
                ProdutoUni aux2=new ProdutoUni(ph.getKey(),ph.getValue());
                ret.add(aux2);
            }

        }


        return ret ;

    }


    /**
     * Método auxiliar para obter o numero de compras num determinado mes por cada cliente
     * @param mes Mes
     * @return Map com cliente e o numero de compras feito por esse cliente
     */
        public Map<Cliente,Integer> aux2(int mes){
        int compras=0;
        Map<Cliente,Integer> ret=new HashMap<>();

                for(Map.Entry<Cliente, List<ClienteH>> ch : clientH1.entrySet()) {
                    ClienteH aux = ch.getValue().get(mes - 1);
                    if (aux.getCompras() != 0) {
                        if (!ret.containsKey(ch.getKey())) {
                            ret.put(ch.getKey(), aux.getCompras());
                        } else {
                            int aux2 = ret.get(ch.getKey());
                            ret.put(ch.getKey(), aux.getCompras() + aux2);

                        }
                    }

                }




            return ret;
    }

    /**
     * Método para obter os Clientes que mais gastaram num produto
     * @param p Produto
     * @return Set com os clientes que mais gastaram num produto
     */
    public Set<ClienteGasto> maisCompraram(Produto p){
        ProdutoH aux= new ProdutoH();
      Set<ClienteGasto> ret= new TreeSet<>(new ComparatorGasto());
      List<ProdutoH> corre=produtoH1.get(p);
            for(ProdutoH a : produtoH1.get(p) ){
                for(Map.Entry<Cliente,ParIntDouble> pc :a.getLista().entrySet()){
                    ClienteGasto me = new ClienteGasto(pc.getKey(),pc.getValue().getFat(),pc.getValue().getProdutos());
                    if(!ret.contains(me)){
                        ret.add(me);
                    }else{
                        Iterator<ClienteGasto> iterator = ret.iterator();
                        while(iterator.hasNext()) {
                            ClienteGasto aux3=iterator.next();
                           if(aux3.getCod().equals(me.getCod())){
                               double aux1=aux3.getFat();
                               int aux2=aux3.getUnid();
                               ret.remove(aux3);
                               me.setFat(me.getFat()+aux1);
                               me.setUnid(aux2+me.getUnid());
                               ret.add(me);
                               break;
                           }
                        }
                        }
                }

            }

        return ret;

    }

    /**
     * Método para obter o numero de compras por cada mes
     * @return Lista com numeros de compras
     */
    public List<Integer> comprasMes(){
    List<Integer> ret=new ArrayList<>();
    for(int j=0;j<12;j++) ret.add(j,0);
    int i=0;
    for(Map.Entry<Cliente,List<ClienteH>> ph : clientH1.entrySet()){
      i=0;

        for(ClienteH aux: ph.getValue()){
            int aux2=ret.get(i);
            ret.remove(i);
            ret.add(i,aux.getCompras()+aux2);
            i++;

        }
        i=0;
    }
    return ret;
    }

    /**
     * Método para obter o total faturado por cada mes
     * @return Lista com total faturado
     */
    public List<Double> fatMes(){
    List<Double> ret=new ArrayList<>();
        for(int j=0;j<12;j++) ret.add(j,0.0);
    int i=0;
    for(Map.Entry<Cliente,List<ClienteH>> ph : clientH1.entrySet()){
        i=0;
        for(ClienteH aux: ph.getValue()){
            double aux2=ret.get(i);
            ret.remove(i);
            ret.add(i,aux.getGastoTotal()+aux2);
            i++;
        }
        i=0;
    }
    return ret;
    }

    /**
     * Método para obter o numero de Clientes distintos
     * @return List com o numero de clientes distintos
     */
    public List<Integer> clienteDist(){
    List<Integer> ret=new ArrayList<>();
        for(int j=0;j<12;j++) ret.add(j,0);
    int i=0;
        for(Map.Entry<Cliente,List<ClienteH>> ph : clientH1.entrySet()){
            i=0;
            for(ClienteH aux: ph.getValue()){
                int aux2=ret.get(i);
                ret.remove(i);
                ret.add(i,aux2+aux.getLista().size());
                i++;
            }
            i=0;
        }
    return ret;
    }

    /**
     * Método para obter a lista dos produtos diferentes de cada cliente
     * @param ret Map onde vai ser adicionada essa informacao
     */
    public  void produtosDist(Map<Cliente,Set<Produto>> ret) {

        for(Map.Entry<Cliente,List<ClienteH>> ph :clientH1.entrySet()){

            for(ClienteH ph2:ph.getValue()){
                for(Map.Entry<Produto,Integer> ph3:ph2.getLista().entrySet()){
                    if(ret.containsKey(ph.getKey())){
                        ret.get(ph.getKey()).add(ph3.getKey());
                    }else {
                        Set<Produto> tmp =new TreeSet<>();
                        tmp.add(ph3.getKey());
                        ret.put(ph.getKey(),tmp);
                    }
                }
            }
        }

    }

    /**
     * Método para limpar estrutura
     */
    public void cleanfi(){
        clientH1.clear();
        produtoH1.clear();
    }

    /**
     * Método insere no map todos os produtos e as unidades
     * @param ret map onde sao inseridos todos os produtos e respetivas unidades
     */
    public void aux6(Map<Produto, Integer> ret) {

        int aux = 0;
        int aux2 = 0;
        for (Map.Entry<Produto, List<ProdutoH>> ph : produtoH1.entrySet()) {
            aux = 0;
            aux2 = 0;
            for (ProdutoH ph2 : ph.getValue()) {
                for (Map.Entry<Cliente, ParIntDouble> ph3 : ph2.getLista().entrySet()) {
                    aux += ph3.getValue().getProdutos();
                }
            }
            if (!ret.containsKey(ph.getKey().clone())) {
                ret.put(ph.getKey().clone(), aux);
            } else {
                aux2 = ret.get(ph.getKey().clone());
                ret.remove(ph.getKey().clone());
                ret.put(ph.getKey().clone(), aux2 + aux);
            }
        }

    }

    /**
     * set com os clientes distintos que compraram determinado produto
     * @param p Produto
     * @param ret Set para inserir clientes que compraram o produto
     */
    public void aux66(Produto p, Set<Cliente> ret) {
        if(produtoH1.containsKey(p.clone())){
            for (ProdutoH ph : produtoH1.get(p.clone())) {
                for (Map.Entry<Cliente, ParIntDouble> ph2 : ph.getLista().entrySet()) {
                    ret.add(ph2.getKey().clone());
                }

            }
        }else System.out.println(" o numero nao existe nesta BD " + p.clone());

    }
}



