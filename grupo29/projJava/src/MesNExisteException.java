

/**
 * Classe com exception para se um mes nao existir
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
public class MesNExisteException extends Exception{
    /**
     * Exception
     * @param msg mensagem de erro
     */
        public MesNExisteException(String msg){
            super(msg);
        }
    }

