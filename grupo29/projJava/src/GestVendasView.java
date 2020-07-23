

import java.io.Serializable;
import java.util.*;

/**
 * Classe relativa a View com os metodos para apresentacao dos menus e resultados
 * @author Joao Neves
 * @author Gonçalo Nogueira
 * @author Carlos Afonso
 */
public class GestVendasView implements Serializable, GestVendasViewI {
    private static Menus menu = new Menus();

    /**
     * Metodo para apresentacao das opcoes de ficheiros txt a carregar
     */
   public void ficheiro_in(){
       System.out.println("Selecione a opçao desejada:");
       System.out.println("1-ficheiro de 1M");
       System.out.println("2-ficheiro de 3M");
       System.out.println("3-ficheiro de 5M");
   }

    /**
     * Metodo para escolha do ficheiro txt
     * @param x Opção
     * @return path do ficheiro escolhido
     */
   public String ficheiro_out(int x){
       String ret=null;
       if(x==1){
           ret="Vendas_1M.txt";
       }else if(x==2){
           ret="Vendas_3M.txt";

       }else if(x==3){
           ret="Vendas_5M.txt";

       }
       return ret;
   }

    /**
     * Metodo de apresentaçao de escolha de qual filial pretende
     */
    public void filialIn() {
        System.out.println("Que filial pretende? ");
    }
    /**
     * Metodo para apresentar menu principal
     */
    public void printMenu()
    {
        menu.executa();
    }

    /**
     * Metodo para obter opcao
     * @return Opcao
     */
    public int getOpt(){
        return menu.getOpcao();
    }

    /**
     * Metodo para apresentar o resultado da query 1
     * @param lista Lista com os produtos comprados por ninguém
     */
    public void query1_out(TreeSet<Produto> lista){
        List<Produto> p = new ArrayList<>(lista);
        int pag = 1;
        int index = 0;
        int pos = 0;
        System.out.println("Total de produtos nunca comprados: " + p.size());
        System.out.println("****************************** Página " + pag + " ***************************************** ");
        Iterator<Produto> it = p.iterator();
        while (it.hasNext() && pos <= index + 20) {
            Produto pd;
            pd = it.next();
            System.out.println(pd);
            pos++;
        }
        index += 20;
        System.out.println("****************************** Página " + pag + " ***************************************** ");
        System.out.println("Total de produtos nunca comprados: " + p.size());
        System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
        int in = InputReader.readInt();

        while (in != 0) {
            if (in == 1) {

                pag++;
                if (pag > 0 && pos<p.size()) {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");

                    while (pos < p.size() && pos <= (index + 20)) {
                        Produto pd = p.get(pos);
                        System.out.println(pd);
                        pos++;
                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    System.out.println("Total de produtos nunca comprados: " + p.size());
                    System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
                    in = InputReader.readInt();
                } else
                    break;
            } else if (in == 2) {

                pag--;
                if (pag > 0 && pos > 0) {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    pos -= 40;
                    index -= 40;
                    while (pos <= p.size() && pos <= (index + 20) && pos > 0) {
                        Produto pd = p.get(pos);
                        System.out.println(pd);
                        pos++;
                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    System.out.println("Total de produtos nunca comprados: " + p.size());
                    System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
                    in = InputReader.readInt();
                } else
                    break;
            }
        }
    }

    /**
     * Metodo para apresentacao da opcao de inserccao de mes
     */
    public void query2_in(){
        System.out.print("\nInsira o mês: ");
    }

    /**
     * Metodo para apresentação do resultado a query 2
     * @param ret resultados da filial 1
     * @param ret2 resultados da filial 2
     * @param ret3 resultados da filial 3
     * @param mes Mes
     */
    public void query2_out(Map<Cliente, Integer> ret,Map<Cliente, Integer> ret2, Map<Cliente, Integer> ret3,int mes){
        int vendas = 0;
        int tot1 = 0;
        int tot2 = 0;
        tot1 = ret.size() + ret2.size() + ret3.size();
        for (Map.Entry<Cliente, Integer> ch : ret.entrySet()) {
            vendas += ch.getValue();
        }
        tot2 += vendas;
        System.out.println("****************************************FILIAL 1*******************************************");
        System.out.println("Total de vendas realizadas no mês " + mes + " = " + vendas);
        System.out.println("Total de clientes diferentes que compraram no mês " + mes + " = " + ret.size());
        vendas = 0;
        for (Map.Entry<Cliente, Integer> ch : ret2.entrySet()) {
            vendas += ch.getValue();
        }
        tot2 += vendas;


        System.out.println("****************************************FILIAL 2*******************************************");
        System.out.println("Total de vendas realizadas no mês " + mes + " = " + vendas);
        System.out.println("Total de clientes diferentes que compraram no mês " + mes + " = " + ret2.size());
        vendas = 0;
        for (Map.Entry<Cliente, Integer> ch : ret3.entrySet()) {
            vendas += ch.getValue();
        }
        tot2 += vendas;
        System.out.println("****************************************FILIAL 3*******************************************");
        System.out.println("Total de vendas realizadas no mês " + mes + " = " + vendas);
        System.out.println("Total de clientes diferentes que compraram no mês " + mes + " = " + ret3.size());
        System.out.println("****************************************GLOBAL*******************************************");
        System.out.println("Total de vendas realizadas no mês " + mes + " = " + tot1);
        System.out.println("Total de clientes diferentes que compraram no mês " + mes + " = " + tot2);

    }

    /**
     * Metodo de apresentacao da opcao de inserir codigo do cliente
     */
    public void query3_in(){
        System.out.println("\ninsira o codigo  de cliente desejado \n");
    }

    /**
     * Metodo para apresentar resultados da query 3
     * @param i mes
     * @param res resultado
     */
    public void query3_out(int i, ParIntDouble res){
            System.out.println("\n mes  " + i+"compras : " + res.getCompras() + "  fat: " + res.getFat()+"Produtos distintos"+res.getProdutos()+"\n");
        }

    /**
     * Metodo de apresentação da opcao de inserir numero de produto
     */
    public void query4_in(){
        System.out.println("Por favor, insira o numero de Produto\n");
    }

    /**
     * Metodo para apresentar resultados da query 4
     * @param i mes
     * @param res resultado
     */
    public void query4_out(int i,ParIntDouble res){
        System.out.println("\n mes  " + i+"compras : " + res.getCompras() + "  fat: " + res.getFat()+"Clientes distintos"+res.getProdutos()+"\n");
    }
    /**
     * Metodo de apresentacao da opcao de inserir codigo de cliente
     */
    public void query5_in(){
        System.out.print("\nInsira o número de Cliente ");
    }

    /**
     * Metodo para apresentar resultados da query 5
     * @param res resultado
     * @param x unidades
     */
    public void query5_out(Set<ProdutoUni> res, int x){
        List<ProdutoUni> p= new ArrayList<>(res);
        int pag = 1;
        int index = 0;
        int pos = 0;

        System.out.println("****************************** Página " + pag + " ***************************************** ");
        System.out.println("Código do produto ->Numero de Unidades Compradas");
        Iterator<ProdutoUni> it = p.iterator();
        while (it.hasNext() && pos <= index + 20) {
            ProdutoUni pd;
            pd = it.next();
            System.out.println(pd.getP() + " ------------> " + pd.getUni() + "\n");
            pos++;
        }
        index += 20;
        System.out.println("****************************** Página " + pag + " ***************************************** ");
        System.out.println("Numero de Produtos: " + p.size());
        System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
        int in = InputReader.readInt();

        while (in != 0) {
            if (in == 1) {
                pag++;
                if (pag > 0 && pos<p.size()) {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");

                    while (pos < p.size() && pos <= (index + 20)) {
                        ProdutoUni pd = p.get(pos);
                        System.out.println(pd.getP() + " ------------> " + pd.getUni() + "\n");
                        pos++;
                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    System.out.println("Numero de Produtos: " + p.size());
                    System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
                    in = InputReader.readInt();
                } else
                    break;
            } else if (in == 2) {
                pag--;
                if (pag > 0 && pos > 0) {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    pos -= 40;
                    index -= 40;
                    while (pos <= p.size() && pos <= (index + 20) && pos > 0) {
                        ProdutoUni pd = p.get(pos);
                        System.out.println(pd.getP() + " ------------> " + pd.getUni() + "\n");
                        pos++;
                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    System.out.println("Numero de Produtos: " + p.size());
                    System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
                    in = InputReader.readInt();
                } else
                    break;
            }
        }

    }
    /**
     * Metodo de apresentacao da opcao de inserir o numero de produtos
     */
    public void query6_in(){ System.out.println("\nInsira o número de produtos: ");}


    /**
     * Metodo para apresentar resultados da query 6
     * @param res resultado
     * @param x numero de produtos
     * @param aux lista de inteiros
     */
    public void query6_out(List<ParProdInt> res, int x, List<Integer> aux) {
        int i=0;
        int pag = 1;
        int index = 0;
        int pos = 0;
        System.out.println("Código do produto -> Numero de Unidades Compradas -> Clientes Distintos");
        System.out.println("****************************** Página " + pag + " ***************************************** ");
        Iterator<ParProdInt> it = res.iterator();
        while (it.hasNext() && pos <= index + 20) {
            ParProdInt pd;
            pd = it.next();
            System.out.println(pd.getProd().getCodigo() + " ------NrUnidades------> " + pd.getInteiro() + "Clientes Distintos --> " + aux.get(i) );
            i++;
            pos++;
        }
        index += 20;
        System.out.println("****************************** Página " + pag + " ***************************************** ");

        System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
        int in = InputReader.readInt();

        while (in != 0) {
            if (in == 1) {
                pag++;
                if (pag > 0 && pos<res.size()) {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");

                    while (pos < res.size() && pos <= (index + 20)) {
                        ParProdInt pd = res.get(pos);
                        System.out.println(pd.getProd().getCodigo() + " ------NrUnidades------> " + pd.getInteiro() + "Clientes Distintos --> " + aux.get(i) );
                        i++;
                        pos++;
                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");

                    System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
                    in = InputReader.readInt();
                } else
                    break;
            } else if (in == 2) {
                pag--;
                i -= 20;
                if (pag > 0 && pos > 0) {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    pos -= 40;
                    index -= 40;
                    while (pos <= res.size() && pos <= (index + 20) && pos > 0) {
                        ParProdInt pd = res.get(pos);
                        System.out.println(pd);
                        pos++;
                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");

                    System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
                    in = InputReader.readInt();
                } else
                    break;
            }
        }
    }


    /**
     * Metodo de apresentacao de texto relativo a query 7
     */
    public void query7_in(){
        System.out.println("Lista dos 3 maiores Compradores Filial a Filial");
    }

    /**
     * Metodo para apresentar resultados da query 7
     * @param ret1 resultado 1
     * @param ret2 resultado 2
     * @param ret3 resultado 3
     */
    public void query7_out(List<ClienteFat> ret1,List<ClienteFat> ret2,List<ClienteFat> ret3){

        System.out.println("lista dos 3 maiores comprados Filial 1: \n");
        System.out.println("comprador 1: " + ret1.get(0).getC() + " comprador 2: " + ret1.get(1).getC() + " comprador3: " + ret1.get(2).getC() + "  \n");
        System.out.println("fat1 " + ret1.get(0).getFat() + "fat2 " + ret1.get(1).getFat() + " fat3 " + ret1.get(2).getFat() + " \n");

        System.out.println("lista dos 3 maiores comprados Filial 2\n");
        System.out.println("comprador 1: " + ret2.get(0).getC() + " comprador 2: " + ret2.get(1).getC() + " comprador3: " + ret2.get(2).getC() + "  \n");
        System.out.println("fat1 " + ret2.get(0).getFat() + "fat2 " + ret2.get(1).getFat() + " fat3 " + ret2.get(2).getFat() + " \n");

        System.out.println("lista dos 3 maiores comprados Filial 3\n");
        System.out.println("comprador 1: " + ret3.get(0).getC() + " comprador 2: " + ret3.get(1).getC() + " comprador3: " + ret3.get(2).getC() + "  \n");
        System.out.println("fat1 " + ret3.get(0).getFat() + "fat2 " + ret3.get(1).getFat() + " fat3 " + ret3.get(2).getFat() + " \n");
    }


    /**
     * Metodo de apresentação da opcao de inserir numero de clientes
     */
    public void query8_in(){
        System.out.print("\nInsira o número de clientes: ");
    }

    /**
     * Metodo de apresentacao do resultado da query 8
     * @param ret resultado
     * @param x numero de clientes
     */
    public void query8_out(Set<ClienteQuant> ret,int x){
        List<ClienteQuant> aux = new ArrayList<>(ret);
        List<ClienteQuant> p = new ArrayList<>();
        for (ClienteQuant c : aux) {
            if (p.size() < x) p.add(c);
        }
        System.out.println("Código do cliente -> Produtos diferentes comprados pelo Cliente");

        int pag = 1;
        int index = 0;
        int pos = 0;

        System.out.println("****************************** Página " + pag + " ***************************************** ");
        Iterator<ClienteQuant> it = p.iterator();
        while (it.hasNext() && pos <= index + 20) {
            ClienteQuant pd;
            pd = it.next();
            System.out.println(pd.getC().getCodigo() + " ------------>  " + (int) pd.getUnid());
            pos++;

        }
        index += 20;
        System.out.println("****************************** Página " + pag + " ***************************************** ");
        if (x > ret.size()) System.out.println("Atencao!! O numero de Clientes solicitado excede o nosso registo :)");
        System.out.println("Apresentado os " + p.size() + " clientes que mais compraram produtos diferentes");
        System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
        int in = InputReader.readInt();

        while (in != 0) {
            if (in == 1) {
                pag++;
                if (pag > 0 && pos<p.size()) {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");

                    while (pos < p.size() && pos <= (index + 20)) {
                        ClienteQuant pd = p.get(pos);
                        System.out.println(pd.getC().getCodigo() + " ------------>  " + (int) pd.getUnid());
                        pos++;

                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    if (x > ret.size())
                        System.out.println("Atencao!! O numero de Clientes solicitado excede o nosso registo :)");
                    System.out.println("Apresentado os " + p.size() + " clientes que mais compraram produtos diferentes");
                    System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
                    in = InputReader.readInt();
                } else
                    break;
            } else if (in == 2) {
                pag--;
                if (pag > 0 && pos > 0) {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    pos -= 40;
                    index -= 40;
                    while (pos <= p.size() && pos <= (index + 20) && pos > 0) {
                        ClienteQuant pd = p.get(pos);
                        System.out.println(pd.getC().getCodigo() + " ------------>  " + (int) pd.getUnid());
                        pos++;

                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    if (x > ret.size())
                        System.out.println("Atencao!! O numero de Clientes solicitado excede o nosso registo :)");
                    System.out.println("Apresentado os " + p.size() + " clientes que mais compraram produtos diferentes");
                    System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair\n");
                    in = InputReader.readInt();
                } else
                    break;
            }
        }
    }


    public void query8_outTeste(Set<ClienteQuant> ret,int x){
        List<ClienteQuant> aux = new ArrayList<>(ret);
        List<ClienteQuant> p = new ArrayList<>();
        for (ClienteQuant c : aux) {
            if (p.size() < x) p.add(c);
        }
    }
    /**
     * Metodo de apresentacao da opcao de inserir o numero de clientes
     */
    public void query9_in1(){
        System.out.print("\nInsira o número de clientes: ");
    }

    /**
     * Metodo de apresentacao da opcao de inserir codigo do produto
     */
    public void query9_in2(){
        System.out.print("\nProduto: ");
    }

    /**
     * Metodo de apresentacao do resultado da query 9
     * @param ret resultado
     * @param x numero de clientes
     * @param cod codigo do produto
     */
    public void query9_out(Set<ClienteGasto> ret,int x, String cod){
        List<ClienteGasto> aux = new ArrayList<>(ret);
        List<ClienteGasto> p= new ArrayList<>();
        for(ClienteGasto c: aux){
            if(p.size()<x) p.add(c.clone());
        }
        System.out.println("Código do cliente -> Valor Gasto");

        int pag = 1;
        int index = 0;
        int pos = 0;

        System.out.println("****************************** Página " + pag + " ***************************************** ");
        Iterator<ClienteGasto> it = p.iterator();
        while(it.hasNext() && pos <= index + 20)
        {
            ClienteGasto pd;
            pd = it.next();
            System.out.println(pd.getCod() +" Unidades: " +pd.getUnid() + " ------------>  " + pd.getFat());
            pos ++;

        }
        index += 20;
        System.out.println("****************************** Página " + pag + " ***************************************** ");
        if (x > ret.size()) System.out.println("Atencao!! O numero de Clientes solicitado excede o nosso registo :)");
        System.out.println("Apresentado os " + p.size() + " clientes que mais gastaram no produto " + cod);
        System.out.println("1 - Próxima página" + "\t"+ "2 - Página anterior" + "\t"+ "0 - Sair\n");
        int in=InputReader.readInt();

        while(in != 0)
        {
            if(in == 1)
            {
                pag++;
                if(pag > 0  && pos<p.size())
                {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");

                    while(pos < p.size() && pos <= (index + 20))
                    {
                        ClienteGasto pd = p.get(pos);
                        System.out.println(pd.getCod() +" Unidades: " +pd.getUnid() + " ------------>  " + pd.getFat());
                        pos ++;

                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    if (x > ret.size()) System.out.println("Atencao!! O numero de Clientes solicitado excede o nosso registo :)");
                    System.out.println("Apresentado os " + p.size() + " clientes que mais gastaram no produto " + cod);
                    System.out.println("1 - Próxima página" + "\t"+ "2 - Página anterior" + "\t"+ "0 - Sair\n");
                    in = InputReader.readInt();
                }
                else
                    break;
            }
            else if(in == 2)
            {
                pag--;
                if(pag > 0 && pos > 0  )
                {
                    clearScreen();
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    pos -= 40;
                    index -= 40;
                    while(pos <= p.size() && pos <= (index + 20) && pos > 0)
                    {
                        ClienteGasto pd = p.get(pos);
                        System.out.println(pd.getCod() +" Unidades: " +pd.getUnid() + " ------------>  " + pd.getFat());
                        pos ++;

                    }
                    index += 20;
                    System.out.println("****************************** Página " + pag + " ***************************************** ");
                    if (x > ret.size()) System.out.println("Atencao!! O numero de Clientes solicitado excede o nosso registo :)");
                    System.out.println("Apresentado os " + p.size() + " clientes que mais gastaram no produto " + cod);
                    System.out.println("1 - Próxima página" + "\t"+ "2 - Página anterior" + "\t"+ "0 - Sair\n");
                    in = InputReader.readInt();
                }
                else
                    break;
            }
        }
    }

    public void query9_outTeste(Set<ClienteGasto> ret,int x, String cod){
        List<ClienteGasto> aux = new ArrayList<>(ret);
        List<ClienteGasto> p= new ArrayList<>();
        for(ClienteGasto c: aux){
            if(p.size()<x) p.add(c.clone());
        }
    }

    /**
     * Metodo de apresentacao do texto relativo a query 10
     */
    public void query10_in(){
        System.out.println("Faturacao global com cada produto; \n");
    }

    /**
     * Metodo de apresentaçao do resultado da query 10
     * @param ret1 resultado 1
     */
    public void query10_out(Map<Produto, List<Double>> ret1,Map<Produto, List<Double>> ret2,Map<Produto, List<Double>> ret3){

        List<Produto> p1 = new ArrayList(ret1.keySet());
        List<Produto> p2 = new ArrayList(ret2.keySet());
        List<Produto> p3 = new ArrayList(ret3.keySet());
        List<Produto> p = new ArrayList(ret1.keySet());

        int in1=1;
        while(in1!=0) {
            if(in1==1) {
                int pag = 1;
                int index = 0;
                int pos = 0;
                int flag = 0;

                System.out.println("Que Filial pretende? ");
                int filial = InputReader.readInt();
                if (filial == 1) {
                    p.addAll(p1);
                } else if (filial == 2) {
                    p.addAll(p2);
                } else if (filial == 3) {
                    p.addAll(p3);
                }


                System.out.println("**************************** Página " + pag + " *************************************** ");
                Iterator<Produto> it = p.iterator();
                while (it.hasNext() && pos <= index + 20) {
                    Produto pd;
                    pd = it.next();
                    System.out.println("Produto " + pd.toString() + " ->" + ret1.get(pd));
                    pos++;
                }
                index += 20;
                System.out.println("**************************** Página " + pag + " *************************************** ");
                System.out.println("Apresentando produtos da Filial " + filial);
                System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair" + "\t" + "10-Procurar por Produto\n");
                int in = InputReader.readInt();

                while (in != 0) {

                    if (in == 1) {
                        if (flag == 1) {
                            flag = 0;
                            pos -= 20;
                            index -= 20;
                        } else pag++;
                        if (pag > 0 && pos<p.size()) {
                            clearScreen();
                            System.out.println("**************************** Página " + pag + " *************************************** ");

                            while (pos < p.size() && pos <= (index + 20)) {
                                Produto pd = p.get(pos);
                                System.out.println("Produto " + pd.toString() + " ->" + ret1.get(pd));
                                pos++;

                            }
                            index += 20;
                            System.out.println("**************************** Página " + pag + " *************************************** ");
                            System.out.println("Apresentando produtos da Filial " + filial);
                            System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair" + "\t" + "10-Procurar por Produto\n");
                            in = InputReader.readInt();
                        } else
                            break;
                    } else if (in == 2) {
                        
                        pag--;
                        if (pag > 0 && pos > 0) {
                            clearScreen();
                            System.out.println("**************************** Página " + pag + " *************************************** ");
                            pos -= 40;
                            index -= 40;
                            while (pos <= p.size() && pos <= (index + 20) && pos > 0) {
                                Produto pd = p.get(pos);
                                System.out.println("Produto " + pd.toString() + " ->" + ret1.get(pd));
                                pos++;
                            }
                            index += 20;
                            System.out.println("**************************** Página " + pag + " *************************************** ");
                            System.out.println("Apresentando produtos da Filial " + filial);
                            System.out.println("1 - Próxima página" + "\t" + "2 - Página anterior" + "\t" + "0 - Sair" + "\t" + "10-Procurar por Produto\n");
                            in = InputReader.readInt();
                        } else
                            break;
                    } else if (in == 10) {

                        System.out.println("introduza o codigo desejado: ");
                        String cod = InputReader.readString();
                        Produto aux = new Produto(cod);
                        if (ret1.containsKey(aux)) {
                            flag = 1;
                            System.out.println("Produto " + aux.getCodigo() + " ->" + ret1.get(aux));
                            System.out.println("1 - Voltar atras" + "\t" + "0 - Sair" + "\t" + "10- Procurar por Produto\n");
                            in = InputReader.readInt();
                        } else {
                            System.out.println("O produto nao existe no Resultado ");
                            System.out.println("1 - Voltar atras" + "\t" + "0 - Sair" + "\t" + "10-Procurar por Produto\n");
                            flag = 1;
                            in = InputReader.readInt();

                        }

                    } else
                        break;
                }
                System.out.println("1-Mudar Filial  0 - Sair\n");
                in1 = InputReader.readInt();
            }
        }

    }

    /**
     * Metodo de apresentacao da opçao 11
     * @param e Estatisticas
     */
    public void query11_out(EstatisticasI e){
        System.out.println(e.toString());
    }

    /**
     * Metodo de apresentacao de texto relativo à opção 12
     */
    public void query12_in(){ System.out.println("Consultas Estatisticas, ponto 1.2 \n");}

    /**
     * Metodo de consulta de estatisticas
     * @param e1 numero de compras
     * @param e2 faturado por filial
     * @param e3 numero distinto de clientes por filial
     */
    public void query12_out(List<Integer> e1,List<List<Double>> e2,List<List<Integer>> e3){
        Iterator<Integer> it= e1.iterator();
        int i=1;
            while(it.hasNext()){
            System.out.println("\nMes: "+i);
            System.out.println(" Numero de Compras: "+it.next());
            System.out.println(" Numero distinto de Clientes ");
            System.out.println(" Filial 1: "+e3.get(0).get(i-1) +" Filial 2: "+e3.get(1).get(i-1) +" Filial 3: "+e3.get(2).get(i-1));
            System.out.println(" Faturado Filial 1: "+e2.get(0).get(i-1)+" Faturado Filial 2: "+e2.get(1).get(i-1)+" Faturado Filial 3: " +e2.get(2).get(i-1));
            System.out.println(" Faturado total : "+e2.get(3).get(i-1));
            i++;
        }
    }

    /**
     * Metodo de apresentacao das estatisticas
     * @param e estatisticas
     */
    public void printStats(EstatisticasI e)
    {
        System.out.println(e.toString());
    }

    /**
     * Metodo para limpar o ecra
     */
    public static void clearScreen(){
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }

    /**
     * Metodo de apresentaçao do tempo de execuçao
     * @param t tempo
     */
    public void time(double t) {
        System.out.println("Resultado obtido em " + t + "s");
    }
}


