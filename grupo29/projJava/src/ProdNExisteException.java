

/**
 * Classe relativa a exceptiron se o numero do produto nao existir
 * @author Carlos Afonso
 * @author Gonçalo Nogueira
 * @author Joao Neves
 */
public class ProdNExisteException extends Exception {
    /**
     * Exception caso nao exista o codigo do produto
     * @param msg mensagem de erro
     */
        public ProdNExisteException(String msg){
            super(msg);
        }
    }

