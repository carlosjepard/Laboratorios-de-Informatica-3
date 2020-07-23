


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Classe relativa a informacao do sistema
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
    public class GestVendasModel implements java.io.Serializable, GestVendasModelI {

        private CatprodutosI catalogoProdutos;
        private CatClientesI catalogoClientes;
        private TodasFatI faturacaoGlobal;
        private FilialI vendasFilial1;
        private FilialI vendasFilial2;
        private FilialI vendasFilial3;
        private EstatisticasI estatisticas;


    /**
     * Construtor Vazio
     */
        public GestVendasModel() {
            this.catalogoProdutos = new CatalogoProdutos();
            this.catalogoClientes = new CatalogoClientes();
            this.faturacaoGlobal = new TodasFaturacoes();
            this.vendasFilial1 = new Filial();
            this.vendasFilial2 = new Filial();
            this.vendasFilial3 = new Filial();
            this.estatisticas = new Estatisticas();
        }



    /**
     * Construtor parametrizado
     * @param catalogoProdutos catalogo de produtos
     * @param catalogoClientes  catalogo de clientes
     * @param faturacao faturacao
     * @param vendasFilial1 vendas da filial 1
     * @param vendasFilial2 vendas da filial 2
     * @param vendasFilial3 vendas da filial 3
     * @param e estatistica
     */
        public GestVendasModel(CatprodutosI catalogoProdutos, CatClientesI catalogoClientes, TodasFatI faturacao, FilialI vendasFilial1, FilialI vendasFilial2, FilialI vendasFilial3, EstatisticasI e) {
            this.catalogoProdutos = catalogoProdutos;
            this.catalogoClientes = catalogoClientes;
            this.faturacaoGlobal = faturacao;
            this.vendasFilial1 = vendasFilial1;
            this.vendasFilial2 = vendasFilial2;
            this.vendasFilial3 = vendasFilial3;
            this.estatisticas = e;
        }



    /**
     * Construtor por objeto
     * @param h objeto GestVendasModel
     */
        public GestVendasModel(GestVendasModel h) {
            this.catalogoProdutos = h.getCatalogoProdutos();
            this.catalogoClientes = h.getCatalogoClientes();
            this.faturacaoGlobal = h.getFaturacao();
            this.vendasFilial1 = h.getVendasFilial1();
            this.vendasFilial2 = h.getVendasFilial2();
            this.vendasFilial3 = h.getVendasFilial3();
            this.estatisticas = h.getEstatisticas();
        }




    /**
     * Get do catalogo de produtos
     * @return catalogo de produtos
     */
        public CatprodutosI getCatalogoProdutos() {
            return catalogoProdutos;
        }

    /**
     * Get do catalogo de clientes
     * @return catalogo de clientes
     */
    public CatClientesI getCatalogoClientes() {
            return catalogoClientes;
        }

    /**
     * Get da faturacao global
     * @return faturacao global
     */
        public TodasFatI getFaturacao() {
            return faturacaoGlobal;
        }

    /**
     * Get das vendas da filial 1
     * @return vendas da filial 1
     */
    public FilialI getVendasFilial1() {
            return vendasFilial1;
        }

    /**
     * Get das vendas da filial 2
     * @return vendas da filial 2
     */
    public FilialI getVendasFilial2() {
            return vendasFilial2;
        }

        /**
        * Get das vendas da filial 3
        * @return vendas da filial 3
        */
        public FilialI getVendasFilial3() {
            return vendasFilial3;
        }

    /**
     * a partir de um ficheiro, obter o estado da GestVendasModel
     * @param fileName ficheiro onde o estado foi guardado
     * @return objeto GestVendasModel
     * @throws IOException IOException
     * @throws ClassNotFoundException ClassNotFoundException
     */
    public static GestVendasModel lerEstado(String fileName) throws IOException, ClassNotFoundException
    {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fis);
        GestVendasModel gvm = (GestVendasModel) in.readObject();
        in.close();
        return gvm;
    }

    /**
     * Get do objeto referente a estatisticas
     * @return objeto EstatisticasI
     */
        public EstatisticasI getEstatisticas() {
            return estatisticas;
        }




    /**
     * Set do catalogo de produtos
     * @param catalogoProdutos catalogo de produtos
     */
        public void setCatalogoProdutos(CatprodutosI catalogoProdutos) {
            this.catalogoProdutos = catalogoProdutos;
        }

    /**
     * Set do catalogo de clientes
     * @param catalogoClientes Catalogo de clientes
     */
        public void setCatalogoClientes(CatClientesI catalogoClientes) {
            this.catalogoClientes = catalogoClientes;
        }

    /**
     * Set da faturacao global
     * @param faturacaoGlobal faturacao global
     */
        public void setFaturacao(TodasFatI faturacaoGlobal) {
            this.faturacaoGlobal = faturacaoGlobal;
        }

    /**
     * Set do objeto vendasFilial referente à filial 1
     * @param vendasFilial1 vendasFilial
     */
        public void setVendasFilial1(FilialI vendasFilial1) {
            this.vendasFilial1 = vendasFilial1;
        }
    /**
     * Set do objeto vendasFilial referente à filial 2
     * @param vendasFilial2 vendasFilial
     */
        public void setVendasFilial2(FilialI vendasFilial2) {
            this.vendasFilial2 = vendasFilial2;
        }
    /**
     * Set do objeto vendasFilial referente à filial 3
     * @param vendasFilial3 vendasFilial
     */
        public void setVendasFilial3(FilialI vendasFilial3) {
            this.vendasFilial3 = vendasFilial3;
        }
    /**
     * Set do objeto referente a estatistica
     * @param estatisticas Estatisticas
     */
        public void setEstatisticas(EstatisticasI estatisticas) {
            this.estatisticas = estatisticas;
        }

    /**
     * Get da fatutacao Global
     * @return faturacao global
     */
        public TodasFatI getFaturacaoGlobal() {
            return faturacaoGlobal;
        }

    /**
     * Set da Faturacao global
     * @param faturacaoGlobal faturacao global
     */
        public void setFaturacaoGlobal(TodasFatI faturacaoGlobal) {
            this.faturacaoGlobal = faturacaoGlobal;
        }

    /**
     * Metodo que carrega um estado a partir de um ficheiro
     * @param path Ficheiro
     */
        public void carrega(String path) {
            loadPr("Produtos.txt");
            loadCl("Clientes.txt");
            loadV(path);

        }

    /**
     * Metodo para ler ficheiro de produtos
     * @param path ficheiro de produtos
     */
    public void loadPr(String path) {

        int p = 0;
        int count = 0;
        try {
            BufferedReader le = new BufferedReader(new FileReader(path));
            String linha = null;
            while ((linha = le.readLine()) != null) {
                count++;
                if (validaPr(linha)) {
                    p++;
                    Produto c = new Produto(linha);
                    catalogoProdutos.addProduto(c);

                }
            }
            estatisticas.setNumerodeProdutos(p);

        } catch (IOException e) {e.printStackTrace();}
        }

    /**
     * Metodo para ler ficheiro de clientes
     * @param path ficheiro de clientes
     */
        public void loadCl(String path) {
            int c1 = 0;
            int count = 0;
            try {
                BufferedReader le = new BufferedReader(new FileReader(path));
                String linha = null;
                while ((linha = le.readLine()) != null) {
                    count++;
                    if (validaCl(linha)) {
                        c1++;
                        Cliente c = new Cliente(linha);
                        catalogoClientes.addCliente(c);
                    }
                }
                estatisticas.setNumeroTotalCli(c1);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    /**
     * Metodo para ler ficheiro de vendas
     * @param path ficheiro de vendas
     */
        public void loadV(String path) {
            int count = 0;
            int count2 = 0;
            int v0 = 0;
            int fatT = 0;

            try {
                BufferedReader le = new BufferedReader(new FileReader(path));
                String linha = null;
                //File myObj = new File(path);
                //Scanner myReader = new Scanner(myObj);
                //while (myReader.hasNextLine()) {
                   // String data = myReader.nextLine();
                while ((linha = le.readLine()) != null) {
                    count2++;
                    if (validaVenda(linha)) {

                        count++;
                        String[] arr = linha.split(" ");
                        double pr = Double.parseDouble(arr[1]);
                        int u = Integer.parseInt(arr[2]);
                        char m = arr[3].charAt(0);
                        int me = Integer.parseInt(arr[5]);
                        int f = Integer.parseInt(arr[6]);
                        Vendas v = new Vendas(arr[0], pr, u, m, arr[4], me, f);
                        if (v.getPreco() == 0.0) v0++;
                        faturacaoGlobal.getFaturacaoGlobal().addVenda(v);
                        fatT += pr;
                        if (v.getFilial() == 1) {
                            vendasFilial1.upFilial(v);
                           faturacaoGlobal.getFaturacaoFilial1().addVenda(v);
                        } else if (v.getFilial() == 2) {
                            vendasFilial2.upFilial(v);
                            faturacaoGlobal.getFaturacaoFilial2().addVenda(v);
                        } else if (v.getFilial() == 3) {
                            vendasFilial3.upFilial(v);
                            faturacaoGlobal.getFaturacaoFilial3().addVenda(v);


                        }


                    }




                }
               // estatisticas.setNomeFicheiro(path);
               // estatisticas.setRegistoserrados(count2 - count);
                //estatisticas.setFatTotal(fatT);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    /**
     * Metodo para validar cliente
     * @param cod codigo de cliente
     * @return True ou False
     */
        public Boolean validaCl(String cod) {
            Boolean ret = true;
            if (Character.isLetter(cod.charAt(0))) {


                String num = cod.substring(1);

                int inteiro = Integer.parseInt(num);
                if (!(inteiro > 999 && inteiro < 5001)) {

                    ret = false;
                }


            } else {

                ret = false;
            }
            return ret;
        }

    /**
     * Valida codigo de produto
     * @param cod codigo de produto
     * @return True ou False
     */
        public Boolean validaPr(String cod) {
            Boolean ret = true;
            if (Character.isLetter(cod.charAt(0)) && Character.isLetter(cod.charAt(1))) {


                String num = cod.substring(2);
                int inteiro = Integer.parseInt(num);
                if (!(inteiro > 999 && inteiro <= 9999)) ret = false;


            } else ret = false;


            return ret;
        }

    /**
     * Metodo para validar uma venda
     * @param cod codigo da venda
     * @return True ou False
     */
        public Boolean validaVenda(String cod) {
            String[] arr = cod.split(" ");
            Boolean ret = false;
            String codP = arr[0];
            String codC = arr[4];
            Produto p = new Produto(codP);
            Cliente c = new Cliente(codC);
            if (catalogoClientes.existeCliente(c) && catalogoProdutos.existeProduto(p)) {
                if (validaPr(codP) && validaCl(codC)) {
                    //  if(Double.parseDouble(arr[1]) > 0 && Double.parseDouble(arr[1])<999){
                    // if(Integer.parseInt(arr[2])>0 && Integer.parseInt(arr[2])<200){
                    if (arr[3].equals("N") || arr[3].equals("P")) {
                        if (Integer.parseInt(arr[5]) > 0 && Integer.parseInt(arr[5]) < 13) {
                            if (Integer.parseInt(arr[6]) > 0 && Integer.parseInt(arr[6]) < 4) {
                                ret = true;
                            }
                        }
                        // }
                        // }
                    }
                }
            }


            return ret;
        }

    /**
     * Metodo para obter estatistica relativa ao cliente
     */
        public void clienteE() {
            int s1 = 0;

            for (Cliente a : catalogoClientes.getClientes()) {
                if (vendasFilial1.getClientH1().containsKey(a) || vendasFilial2.getClientH1().containsKey(a) || vendasFilial2.getClientH1().containsKey(a))
                    s1++;
            }
            estatisticas.setNumeroTotalCC(s1);
            estatisticas.setnCompCli(s1 - estatisticas.getNumeroTotalCC());
        }

    /**
     * Metodo para obter estatistica relativa ao produto
     */
        public void produtoE() {

            int naoC = catalogoProdutos.getProdutos().size() - faturacaoGlobal.getFaturacaoGlobal().getFaturacao().size();
            estatisticas.setPrdifcompr(faturacaoGlobal.getFaturacaoGlobal().getFaturacao().size());
            estatisticas.setPrdiffncomp(naoC);


        }

    /**
     * Metodo para guardar o estado
     * @param fileName fichiero onde se ira guardar o estado
     * @throws IOException IOException
     */
    public void gravarEstado (String fileName) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);


        objectOut.writeObject(this);


        objectOut.close();

    }




    /**
     * Obter os produtos que nao foram comprados por ninguem
      * @return Lista de produtos comprados por ninguem
     */
        public TreeSet<Produto> query1() {
            TreeSet<Produto> res = new TreeSet<>(catalogoProdutos.getProdutos());
            faturacaoGlobal.getFaturacaoGlobal().getFaturacao().keySet().forEach(res::remove);
            return res;
        }





        //query6

    /**
     * Determinar o conjunto dos X produtos mais vendidos
     * no ano inteiro
     * @param x quantidade de produtos mais vendidos
     * @return Lista com pares de produto e o seu numero de unidades vendidas
     */
    public List<ParProdInt> query62(int x) {
        Set<ParProdInt> ret = new TreeSet<>(new ComparatorParProdInt());
        List<ParProdInt> ret2 = new ArrayList<>();
        Map<Produto, Integer> aux = new HashMap<>();
        vendasFilial1.aux6(aux);
        vendasFilial3.aux6(aux);
        vendasFilial2.aux6(aux);

        int i = 0;
        for (Map.Entry<Produto, Integer> ph : aux.entrySet()) {
            ParProdInt mete = new ParProdInt(ph.getKey().clone(), ph.getValue());
            ret.add(mete);
        }

        for (ParProdInt ph2 : ret) {
            if (i == x) break;
            ret2.add(ph2.clone());
            i++;
        }
        return ret2;
    }

    /**
     * Metodo para  obter o numero de clientes distintos de cada produto
     * @param pesq Lista
     * @return Lista
     */
    public List<Integer> query6aux(List<ParProdInt> pesq) {
        Set<Cliente> aux=new TreeSet<>();
        List<Integer> ret=new ArrayList<>();
        int i=0;
        for (ParProdInt ph: pesq){
            vendasFilial1.aux66(ph.getProd().clone(),aux);
            vendasFilial2.aux66(ph.getProd().clone(),aux);
            vendasFilial3.aux66(ph.getProd().clone(),aux);
            ret.add(i,aux.size());
            i++;
            aux.clear();
        }


        return ret;
    }
    /**
     * Determinar os códigos dos X clientes que compraram
     * mais produtos diferentes
     * @return Lista com pares de Cliente, e o numero de produtos diferentes que esse cliente comprou
     */
    public Set<ClienteQuant> query82() {

        Map<Cliente,Set<Produto>> ret=new HashMap<>();
        Set<ClienteQuant> retu=new TreeSet<>(new DecrescenteQuant());
        vendasFilial1.produtosDist(ret);
        vendasFilial2.produtosDist(ret);
        vendasFilial3.produtosDist(ret);


        for(Map.Entry<Cliente,Set<Produto>> ph: ret.entrySet()){
            ClienteQuant mete=new ClienteQuant(ph.getKey(),ph.getValue().size());
            retu.add(mete);
        }




        return retu;
    }


    /**
     * Dado um código de cliente, determinar, para cada mês, quantas compras fez,
     * quantos produtos distintos comprou e quanto gastou no total.
     * @param c Um cliente
     * @param mes Um mes
     * @return Um objeto com o numero de compras feitas, o numero de produtos distintos e quanto gastou no total
     */
        public ParIntDouble query3(Cliente c, int mes) {
            int compras = 0;
            double fat = 0;
            int produto = 0;
            ParIntDouble res;
//try {
            res = vendasFilial1.comprasCM(c, mes);
            compras += res.getCompras();
            fat += res.getFat();
            produto += res.getProdutos();
            res = vendasFilial2.comprasCM(c, mes);
            compras += res.getCompras();
            fat += res.getFat();
            produto += res.getProdutos();

            res = vendasFilial3.comprasCM(c, mes);
            compras += res.getCompras();
            fat += res.getFat();
            produto += res.getProdutos();

            res.setFat(fat);
            res.setProdutos(produto);
            res.setCompras(compras);

            return res;
        }

    /**
     * Dado o código de um produto existente, determinar, mês a mês,
     * quantas vezes foi comprado, por quantos clientes diferentes e o total faturado;
     * @param p Um produto
     * @param mes Um mes
     * @return Objeto com o numero de vezes que o produto foi comprado, por quantos clientes diferentes, e o total faturado
     */
    public ParIntDouble query4(Produto p, int mes) {

        ParIntDouble res = new ParIntDouble();
        int compras = 0;
        int fat = 0;
        int clientes = 0;
        res = vendasFilial1.comprasPM(p, mes);
        compras += res.getCompras();
        fat += res.getFat();
        clientes += res.getProdutos();
        res = vendasFilial2.comprasPM(p, mes);
        compras += res.getCompras();
        fat += res.getFat();
        clientes += res.getProdutos();
        res = vendasFilial3.comprasPM(p, mes);
        compras += res.getCompras();
        fat += res.getFat();
        clientes += res.getProdutos();


        res.setFat(fat);
        res.setProdutos(clientes);
        res.setCompras(compras);
        return res;

        }

    /**
     *Metodo que devolve um Set com os códigos de produtos que mais
     * foram comprados por um cliente (e quantos)
     * @param cod Código de cliente
     * @return Set com a informacao de codigos de produtos que mais foram comprados, e quantas unidades.
     */
        public Set<ProdutoUni> query5(String cod) {
            Set<ProdutoUni> ret = new TreeSet<>(new ComparatorUni());
            Cliente c = new Cliente(cod);
            vendasFilial2.produtosUnid(c);
            vendasFilial3.produtosUnid(c);
            for (ProdutoUni aux : vendasFilial1.produtosUnid(c)) {
                ret.add(aux);
            }
            for (ProdutoUni aux : vendasFilial2.produtosUnid(c)) {
                if (!ret.contains(aux)) {
                    ret.add(aux);
                } else {
                    Iterator<ProdutoUni> it = ret.iterator();

                    while (it.hasNext()) {
                        ProdutoUni aux3 = it.next();
                        if (aux3.getP().equals(aux.getP())) {
                            int unid = aux3.getUni() + aux.getUni();
                            ProdutoUni mete = new ProdutoUni(aux3.getP(), unid);
                            ret.remove(aux3);
                            ret.add(mete);
                        }


                    }
                }
            }
            for (ProdutoUni aux : vendasFilial3.produtosUnid(c)) {
                if (!ret.contains(aux)) {
                    ret.add(aux);
                } else {
                    Iterator<ProdutoUni> it = ret.iterator();

                    while (it.hasNext()) {
                        ProdutoUni aux3 = it.next();
                        if (aux3.getP().equals(aux.getP())) {
                            int unid2 = aux3.getUni() + aux.getUni();
                            ProdutoUni mete = new ProdutoUni(aux3.getP(), unid2);
                            ret.remove(aux3);
                            ret.add(mete);
                        }


                    }
                }
            }



            return ret;
        }



 /*

        //Determinar,  para  cada  filial, a  lista dos três  maiores  compradores em  termos de dinheiro faturado

    /**
     * Para cada filial, a lista dos três maiores compradores em termos de dinheiro faturado
     * @param filial Filial
     * @return Lista com os três maiores compradores
     */
        public List<ClienteFat> query7(int filial) {
            List<ClienteFat> ret = new ArrayList<>();
            Set<ClienteFat> order = new TreeSet<>(new ComparatorClienteFat());
            Set<ClienteFat> ls = new TreeSet<>();

            if (filial == 1) {
                ls = vendasFilial1.getFatC();
                for (ClienteFat cf : ls) {
                    order.add(cf.clone());
                }
                int i = 0;
                Iterator<ClienteFat> it = order.iterator();
                while (it.hasNext() && i < 3) {
                    ClienteFat retc = it.next();
                    ret.add(retc.clone());
                    i++;
                }

            } else if (filial == 2) {
                ls = vendasFilial2.getFatC();
                for (ClienteFat cf : ls) {
                    order.add(cf.clone());
                }
                int i = 0;
                Iterator<ClienteFat> it = order.iterator();
                while (it.hasNext() && i < 3) {
                    ClienteFat retc = it.next();
                    ret.add(retc.clone());
                    i++;
                }

            } else if (filial == 3) {
                ls = vendasFilial3.getFatC();
                for (ClienteFat cf : ls) {
                    order.add(cf.clone());
                }
                int i = 0;
                Iterator<ClienteFat> it = order.iterator();
                while (it.hasNext() && i < 3) {
                    ClienteFat retc = it.next();
                    ret.add(retc.clone());
                    i++;
                }

            }
            return ret;
        }

    /**
     * Determinar mês a mês, e para cada mês filial a filial, a faturação total com cada
     * produto.
     * @param filial numero da filial
     * @return Map com o Produto, e a informacao respetiva de cada mes
     */
        public Map<Produto, List<Double>> query10(int filial) {
            Map<Produto, List<Double>> ret = new HashMap<>();
            if (filial == 1) {
                ret = vendasFilial1.fatmes();
            } else if (filial == 2) {
                ret = vendasFilial2.fatmes();

            } else if (filial == 3) {
                ret = vendasFilial3.fatmes();
            }
            return ret;
        }

    /**
     * Dado um mês válido, e uma filial determinar o número total global de vendas realizadas e o
     *  número total de clientes distintos que as fizeram.
     * @param mes mes
     * @param filial filial
     * @return lista com os clientes e o numero total de vendas
     */
        public Map<Cliente, Integer> query22(int mes, int filial) {
            Map<Cliente, Integer> ret = new HashMap<>();
            if (filial == 1) {
                ret = vendasFilial1.aux2(mes);

            } else if (filial == 2) {
                ret = vendasFilial2.aux2(mes);

            } else if (filial == 3) {
                ret = vendasFilial3.aux2(mes);

            }

            return  ret;
        }

    /**
     * Dado o código de um produto que deve existir, determinar o conjunto dos X clientes
     * que mais o compraram e, para cada um, qual o valor gasto (ordenação cf. 5);
     * @param cod Coódigo do produto
     * @return Lista com clientes que mais compraram
     */
    public Set<ClienteGasto> query92(String cod){
        Produto p=new Produto(cod);
        Set<ClienteGasto> ret =new TreeSet<>(new ComparatorGasto());
        Set<ClienteGasto> ret2 =new TreeSet<>(new ComparatorGasto());
        Set<ClienteGasto> ret3 = new TreeSet<>(new ComparatorGasto());
        ret=vendasFilial1.maisCompraram(p);
        ret2=vendasFilial2.maisCompraram(p);
        ret3=vendasFilial3.maisCompraram(p);

        for(ClienteGasto r2: ret2) {
            if (r2.getFat() != 0) {
                Iterator<ClienteGasto> it= ret.iterator();
                while(it.hasNext()){
                    ClienteGasto aux = new ClienteGasto(it.next());
                    if(aux.getCod().equals(r2.getCod())){
                        ret.remove(aux);
                        aux.setFat(aux.getFat()+r2.getFat());
                        aux.setUnid(aux.getUnid()+r2.getUnid());
                        ret.add(aux.clone());
                        break;
                    }
                    if(!it.hasNext()) {
                        ret.add(r2);
                    }
                }

            }
        }
        for (ClienteGasto r3: ret3) {

            Iterator<ClienteGasto> it= ret.iterator();
            while(it.hasNext()){
                ClienteGasto aux = new ClienteGasto(it.next());
                if(aux.getCod().equals(r3.getCod())){
                    ret.remove(aux);
                    aux.setFat(aux.getFat()+r3.getFat());
                    aux.setUnid(aux.getUnid()+r3.getUnid());
                    ret.add(aux);
                    break;

                }
                if(!it.hasNext()) {
                    ret.add(r3);
                }

            }
        }
        return ret;
    }

    /**
     * Metodo para obter as compras por mes
     * @return Lista o numero de compras por mes
     */
    public List<Integer> comprasPMes(){
        List<Integer> ret=new ArrayList<>();
        List<Integer> ret2=new ArrayList<>();
        List<Integer> ret3=new ArrayList<>();
        List<Integer> retu=new ArrayList<>();

        ret=vendasFilial1.comprasMes();
        ret2=vendasFilial2.comprasMes();
        ret3=vendasFilial3.comprasMes();
        for(int i=0;i<12;i++){
            retu.add(i,ret.get(i)+ret2.get(i)+ret3.get(i));
        }

        return retu;
    }
    /**
     * Metodo para obter valor faturado por mes
     * @return Lista o numero de compras por mes
     */
    public List<List<Double>> fatuPmes(){
        List<List<Double>> ret=new ArrayList<>();
        List<Double> ret1 =new ArrayList<>();
        List<Double> ret2 =new ArrayList<>();
        List<Double> ret3 =new ArrayList<>();
        List<Double> tot=new ArrayList<>();
        ret1=vendasFilial1.fatMes();
        ret2=vendasFilial1.fatMes();
        ret3=vendasFilial1.fatMes();
        ret.add(0,ret1);
        ret.add(1,ret2);
        ret.add(2,ret3);
        for(int i=0;i<12;i++){
            tot.add(i,ret1.get(i)+ret2.get(i)+ret3.get(i));
        }
        ret.add(3,tot);
        return ret;

    }

    /**
     * Metodo para obter numero distintos de clientes que comparam em cada mes, filial a filial
     * @return Lista com o numero dos clientes que compraram em cada mes, filial a filial
     */
    public List<List<Integer>> clientesD(){
        List<List<Integer>> re=new ArrayList<>();
        List<Integer> ret1=new ArrayList<>();
        List<Integer> ret2=new ArrayList<>();
        List<Integer> ret3=new ArrayList<>();
        ret1=vendasFilial1.clienteDist();
        ret2=vendasFilial2.clienteDist();
        ret3=vendasFilial3.clienteDist();
        re.add(0,ret1);
        re.add(1,ret2);
        re.add(2,ret3);


        return re;

    }

    /**
     * Metodo para limpar
     */
    public void cleanALL(){
        vendasFilial1.cleanfi();
        vendasFilial2.cleanfi();
        vendasFilial3.cleanfi();
        faturacaoGlobal.cleanFat();
        estatisticas.cleanE();
        catalogoProdutos.cleanP();
        catalogoClientes.cleanC();
    }

    }