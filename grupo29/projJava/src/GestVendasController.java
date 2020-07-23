

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 * Classe relativa ao controller
 */

public class GestVendasController implements Serializable, GestVendasControllerI {

    private GestVendasModelI model;

    private GestVendasViewI view;

    /**
     * Set da interface Model
     * @param model Interface Model
     */
    public void setModel(GestVendasModelI model){this.model = model;}

    /**
     * Set da interface View
     * @param view View
     */
    public void setView(GestVendasViewI view){this.view = view;}


    /**
     * Query 1
     * Obter os produtos que nao foram comprados por ninguem
     */
    public void query1M(){
        Crono.start();
        TreeSet<Produto> lista=model.query1();
        double t=Crono.stop();
        view.time(t);
        view.query1_out(lista);
    }

    /**
     * Dado um mês valido, e uma filial, ou nao, determinar o numero total global de vendas realizadas e o
     * numero total de clientes distintos que as fizeram.
     */
    public void query2M(){
        ParInt res1;
        ParInt res2;
        ParInt res3;
        ParInt resAll;
        Map<Cliente,Integer> ret=new HashMap<>();
        Map<Cliente,Integer> ret2=new HashMap<>();
        Map<Cliente,Integer> ret3=new HashMap<>();
        int mes;
        view.query2_in();
        mes=InputReader.readInt();
      //  try {
            Crono.start();
            /*
            res1 = model.query2(mes, 1);
            res2 = model.query2(mes, 2);
            res3 = model.query2(mes, 3);
            resAll = model.query2(mes, 0);
            */
            ret=model.query22(mes,1);
            ret2=model.query22(mes,2);
            ret3=model.query22(mes,3);

            double t=Crono.stop();
            view.query2_out(ret,ret2,ret3,mes);
            view.time(t);
     //  }
        //catch (MesNExisteException e){
          //  System.out.println(e.getMessage());
     //   }
    }

    /**
     * Dado um codigo de cliente, determinar, para cada mes, quantas compras fez,
     * quantos produtos distintos comprou e quanto gastou no total.
     */
    public void query3M(){
        ParIntDouble res;
        String x;
        view.query3_in();
        x=InputReader.readString();
        Cliente c=new Cliente(x);
        int i=1;
        Crono.start();
        for(i=1;i<13;i++) {
            res = model.query3(c, i);
            view.query3_out(i, res);
        }
        double t=Crono.stop();
        view.time(t);
    }

    /**
     * Dado o codigo de um produto existente, determinar, mes a mes,
     * quantas vezes foi comprado, por quantos clientes diferentes e o total faturado
     */
    public void query4M(){
        ParIntDouble res;
        String x;
        view.query4_in();
        x=InputReader.readString();
        Crono.start();
        Produto p= new Produto(x);
        int i=1;
        for(i=1;i<13;i++) {
            res = model.query4(p, i);
            view.query4_out(i, res);
        }
        double t=Crono.stop();
        view.time(t);
    }

    /**
     * Metodo que devolve um Set com os codigos de produtos que mais
     * foram comprados por um cliente (e quantos)
     */
    public void query5M(){
        Set<ProdutoUni> ret=new TreeSet<>();
        view.query5_in();;
        String x;
        x=InputReader.readString();
    Crono.start();
        ret=model.query5(x);
        double t=Crono.stop();
        view.query5_out(ret, ret.size());
        view.time(t);

    }

    /**
     * Determinar o conjunto dos X produtos mais vendidos
     * no ano inteiro
     */
    public void query6M(){
        List<ParProdInt> res;
        int x;
        view.query6_in();
        x=InputReader.readInt();
        Crono.start();
        res=model.query62(x);
        List<Integer> aux=new ArrayList<>();
        aux=model.query6aux(res);
        double t=Crono.stop();
        view.query6_out(res,x,aux);
        view.time(t);
    }

    /**
     * Para cada filial, a lista dos tres maiores compradores em termos de dinheiro faturado
     */
    public void query7M(){

        Crono.start();
        List<ClienteFat> ret1=model.query7(1);
        List<ClienteFat> ret2=model.query7(2);
        List<ClienteFat> ret3=model.query7(3);
        double t=Crono.stop();
        view.query7_in();
        view.query7_out(ret1,ret2,ret3);

        view.time(t);
    }

    /**
     * Determinar os codigos dos X clientes que compraram
     * mais produtos diferentes
     */
    public void query8M(){

        Set<ClienteQuant> ret=new TreeSet<>();
        int x;
        view.query8_in();
        x=InputReader.readInt();
        Crono.start();
        ret=model.query82();
        double t=Crono.stop();
        view.time(t);
        view.query8_out(ret,x);
    }



    /**
     * Dado o codigo de um produto que deve existir, determinar o conjunto dos X clientes
     * que mais o compraram e, para cada um, qual o valor gasto
     */
    public void query9M(){
     Set<ClienteGasto> ret=new TreeSet<>();
        int x;
        view.query9_in1();
        x=InputReader.readInt();
        String cod;
        view.query9_in2();
        cod=InputReader.readString();
        Crono.start();
        ret = model.query92(cod);
        double t=Crono.stop();
        view.time(t);
        view.query9_out(ret,x,cod);

    }

    /**
     * Determinar mes a mes, e para cada mes, filial a filial, a faturacao total com cada
     * produto.
     */
    public void query10M(){
        Map<Produto, List<Double>> ret1 = new HashMap<>();
        Map<Produto, List<Double>> ret2= new HashMap<>();
        Map<Produto, List<Double>> ret3 = new HashMap<>();
        Crono.start();
        ret1 = model.query10(1);
        ret2 = model.query10(2);
        ret3 = model.query10(3);
        double t=Crono.stop();
        view.query10_in();
        view.query10_out(ret1,ret2,ret3);
        view.time(t);


    }

    /**
     * Consultar Estatisticas
     */
    public void query12M(){
        Crono.start();
        List<Integer> ret=new ArrayList<>();
        List<List<Double>> ret1=new ArrayList<>();
        List<List<Integer>> ret2=new ArrayList<>();
        ret=model.comprasPMes();
        ret1=model.fatuPmes();
        ret2=model.clientesD();
        double t=Crono.stop();
        view.query12_in();
        view.query12_out(ret,ret1,ret2);
        view.time(t);
}

    /**
     * Gravar Estado
     */
    public  void gravar(){
        try{
            model.gravarEstado("gestVendas.dat");
            System.out.println("Dados gravados com sucesso.");
        }
        catch(IOException e){
            System.out.println("Não consegui gravar os dados.");
        }
    }

    /**
     * Carregar Estado
     */
    private  void carregar() {
        try {
            System.out.println("A ler dados...");
            model = GestVendasModel.lerEstado("gestVendas.dat");
            System.gc();

        }
        catch (IOException e) {
            model = new GestVendasModel();
            System.out.println("Não foi possível carregar os dados!\nO ficheiro hipermercado.dat não existe.\n");
        }
        catch (ClassNotFoundException e) {
            model = new GestVendasModel();
            System.out.println("Não consegui ler os dados!\nO ficheiro tem um formato desconhecido.");
        }
        catch (ClassCastException e) {
            model = new GestVendasModel();
            System.out.println("Não consegui ler os dados!\nErro de formato.");
        }
    }

    /**
     * Switch de opçoes
     */
    public void queryMenu(){
        do{
            view.printMenu();
            switch (view.getOpt()){
                case 1:{
                    GestVendasViewI.clearScreen();
                    query1M();
                    break;
                }

                case 2:{
                    GestVendasViewI.clearScreen();
                    query2M();
                    break;
                }


                case 3:{
                    GestVendasViewI.clearScreen();
                    query3M();
                    break;
                }

                case 4:{
                    GestVendasViewI.clearScreen();
                    query4M();
                    break;
                }

                case 5:{
                    GestVendasViewI.clearScreen();
                    query5M();
                    break;
                }

                case 6:{
                    GestVendasViewI.clearScreen();
                    query6M();
                    break;
                }

                case 7:{
                    GestVendasViewI.clearScreen();
                    query7M();
                    break;
                }

                case 8:{
                    GestVendasViewI.clearScreen();
                    query8M();
                    break;
                }

                case 9:{
                    GestVendasViewI.clearScreen();
                    query9M();
                    break;
                }

                case 10:{
                    GestVendasViewI.clearScreen();
                    GestVendasViewI.clearScreen();

                    query10M();
                    break;
                }


                case 11:{
                    GestVendasViewI.clearScreen();
                    model.clienteE();
                    model.produtoE();
                    view.query11_out(model.getEstatisticas());
                    break;
                }

                case 12:{
                  GestVendasViewI.clearScreen();
                    query12M();
                    break;
                }
                case 13:{
                    GestVendasViewI.clearScreen();
                    carregar();
                    break;
                }
                case 14:{
                    int flag=0;
                    if(flag==1){
                        model.cleanALL();
                        flag=0;
                    }
                    GestVendasViewI.clearScreen();
                    view.ficheiro_in();
                    int x=InputReader.readInt();
                    String path=view.ficheiro_out(x);
                    GestVendasViewI.clearScreen();
                    Crono.start();
                    model.carrega(path);
                    double t=Crono.stop();
                    view.time(t);
                    flag=1;
                    break;
                }
                case 15:{
                    GestVendasViewI.clearScreen();
                    gravar();
                    break;
                }
            }
        }while(view.getOpt()!=0);
        System.out.println("BYE!");
    }
    }

