

import java.io.Serializable;

/**
 * Classe referente a excessao de cliente invalido
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public class ClienteInvalidException extends Exception implements Serializable
{
    public ClienteInvalidException()
    {
        super();
    }

    public ClienteInvalidException(String message)
    {
        super(message);
    }
}