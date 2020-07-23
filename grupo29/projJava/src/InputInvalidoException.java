

/**
 * Classe relativa a uma exception de input invalido
 */
public class InputInvalidoException extends Exception {
    /**
     * InputInvalidoException
     */
    public InputInvalidoException()
    {
        super();
    }

    /**
     * Mensagem de erro
     * @param message mensagem
     */
    public InputInvalidoException(String message)
    {
        super(message);
    }
}
