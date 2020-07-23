import java.io.Serializable;

/**
 * Classe Relativa a ParClienteFloat
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
public class ParClienteFloat implements Comparable<ParClienteFloat>, Serializable {
    private Cliente cliente;
    private float y;

    /**
     * Construtor parametrizado
     * @param c Cliente
     * @param n float
     */
    public ParClienteFloat(Cliente c , float n){
        cliente=c;
        y=n;
    }

    /**
     * Get do cliente
     * @return Cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Set do Cliente
     * @param cliente Cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Get do float
     * @return y
     */
    public float getY() {
        return y;
    }

    /**
     * Set do valor float
     * @param y float
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Metodo de ordenação que ordena primeiro por ordem decrescente do float e de seguida os clientes por ordem ascendente
     * @param x ParClienteFloat x
     * @return 1 ou -1
     */
    // ordena primeiro por ordem decrescente do float e de seguida os clientes por ordem ascendente
    public int compareTo(ParClienteFloat x){
        if(this.y<x.getY())
            return 1;
        if(this.y>x.getY())
            return -1;
        return this.getCliente().compareTo(x.getCliente());

    }

    /**
     * Metodo toString
     * @return String
     */
    public String toString(){
        return y + cliente.toString();
    }

}
