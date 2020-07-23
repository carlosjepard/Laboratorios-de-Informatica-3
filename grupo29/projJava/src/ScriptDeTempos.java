

import java.io.Serializable;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ScriptDeTempos implements Serializable {

    public static void main(String[] args) {

        GestVendasModelI model = new GestVendasModel();
        GestVendasView z = new GestVendasView();
        model.carrega("C:\\Users\\f6car\\Desktop\\grupo29-master\\grupo29\\projJava\\docs\\Vendas_1M.txt");
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.println("Insere um numero");
            num = sc.nextInt();

            switch (num) {

                case 5: {
                    Crono.start();
                    model.query5("Z5000");
                    Crono.stop();
                    System.out.println("Tempo da query 5: " + Crono.getTime());
                    break;
                }

                case 6: {
                    Crono.start();
                    model.query62(100);
                    Crono.stop();
                    System.out.println("Tempo da query 6: " + Crono.getTime());
                    break;
                }

                case 7: {
                    Crono.start();
                    model.query7(1);
                    model.query7(2);
                    model.query7(3);
                    Crono.stop();
                    System.out.println("Tempo da query 7: " + Crono.getTime());
                    break;
                }

                case 8: {
                    Set<ClienteQuant> s = new TreeSet<>();
                    Crono.start();
                    z.query8_outTeste(s, 250);
                    Crono.stop();
                    System.out.println("Tempo da query 8: " + Crono.getTime());
                    break;
                }

                case 9: {
                    Set<ClienteGasto> s = new TreeSet<>();
                    Crono.start();
                    z.query9_outTeste(s, 9, "AF1184");
                    Crono.stop();
                    System.out.println("Tempo da query 9: " + Crono.getTime());
                    break;
                }

            }


        }
        while (num != 0);
    }

}
