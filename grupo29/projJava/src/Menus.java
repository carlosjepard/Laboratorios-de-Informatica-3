


import java.io.Serializable;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Classe com os menus
 * @author Joao Neves
 * @author Goncalo Nogueira
 * @author Carlos Afonso
 */
public class Menus implements Serializable {
    private int op;

    /**
     * Construtor Vazio
     */
    public Menus(){
        this.op=0;
    }

    /**
     * Menu principal
     */
    public static void menuPrincipal(){
        System.out.println("\n ---------------  GESTVENDASAPP ---------------");
        System.out.println("1- Lista ordenada alfabeticamente com os códigos dos produtos nunca comprados e o seu respetivo total");
        System.out.println("2- Determinar o número total global de vendas realizadas e o número total de clientes distintos que as fizeram de um mês");
        System.out.println("3- Dado um cliente, determinar,  para  cada  mês,  quantas  compras  fez, quantos produtos distintos comprou e quanto gastou no total");
        System.out.println("4- Dado o código de um produto existente, determinar, mês a mês, quantas vezes foi comprado, por quantos clientes diferentes e o total faturado");
        System.out.println("5- Determinar para um cliente a lista de códigos de produtos que mais comprou");
        System.out.println("6- Determinar o conjunto dos X produtos mais vendidos em todo o ano indicando o número total de distintos clientes que o compraram");
        System.out.println("7- Determinar,  para  cada  filial, a  lista dos três  maiores  compradores em  termos de dinheiro faturado");
        System.out.println("8- Determinar os códigos dos X clientes que compraram mais produtos diferentes");
        System.out.println("9- Dado o código de um produto, determinar o conjunto dos X clientes que mais o compraram e, para cada um,qual o valor gasto");
        System.out.println("10- Determinar mês a mês, e para cada mês filial a filial, a faturacao total com cada produto");
        System.out.println("11- Dados do último ficheiro de Vendas");
        System.out.println("12- Consultas Estatísticas");
        System.out.println("13- Ler ficheiros .dat com dados");
        System.out.println("14- Ler ficheiros .txt com dados");
        System.out.println("15- Gravar estado atual do programa");
        System.out.println("0 - Sair");


    }

    /**
     * Executar uma opcao
     */
    public void executa() {
        do {
            menuPrincipal();
            this.op = lerOpcao();
        } while (this.op == -1);
    }

    /**
     * Metodo de ler opcao
     * @return opcao
     */
    private int lerOpcao() {
        int op;
        Scanner is = new Scanner(System.in);

        System.out.print("Opcao: ");
        try {
            op = is.nextInt();
        }
        catch (InputMismatchException e) { // Nao foi inscrito um int
            op = -1;
        }
        if (op<0 || op>15) {
            System.out.println("Opcao Inválida!!!");
            op = -1;
        }
        return op;
    }

    /**
     * Get da opcao
     * @return Opcao
     */
    public int getOpcao() {
        return this.op;
    }

}
