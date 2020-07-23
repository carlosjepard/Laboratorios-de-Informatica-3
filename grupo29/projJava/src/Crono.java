

import static java.lang.System.nanoTime;

/**
 * Classe para obter os tempos de execução
 * @author Joao Neves
 * @author Carlos Afonso
 * @author Goncalo Nogueira
 */
public class Crono {

    private static long inicio = 0L;
    private static long fim = 0L;

    /**
     * Metodo para iniciar contagem
     */
    public static void start() {
        fim = 0L; inicio = nanoTime();
    }

    /**
     * Metodo para parar tempo
     * @return tempo decorrido
     */
    public static double stop() {
        fim = nanoTime();
        long elapsedTime = fim - inicio;
        // segundos
        return elapsedTime / 1.0E09;
    }

    /**
     * Metodo toString
     * @return String
     */
    public static String getTime() {
        return "" + stop();
    }



}
