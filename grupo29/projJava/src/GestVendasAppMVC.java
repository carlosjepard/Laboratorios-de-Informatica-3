



import java.lang.*;
import java.io.*;
import java.util.*;

/**
 * Classe onde se encontra a main
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class GestVendasAppMVC implements Serializable {

    /**
     * Main
     * @param args argumentos
     */
    public static void main(String[] args) {
        GestVendasControllerI controller = new GestVendasController();
        GestVendasModelI model = new GestVendasModel();
        GestVendasViewI view = new GestVendasView();

        controller.setModel(model);
        controller.setView(view);
        controller.queryMenu();

        System.exit(0);

    }
}