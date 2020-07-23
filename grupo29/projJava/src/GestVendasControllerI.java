import java.io.Serializable;

/**
 * Interface referente ao Controller
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Goncalo Nogueira
 */
public interface GestVendasControllerI extends Serializable {

    /**
     * Set da interface Model
     * @param m Interface Model
     */
    public void setModel(GestVendasModelI m);

    /**
     * Set da interface View
     * @param v View
     */
    public void setView(GestVendasViewI v);


    public void queryMenu();

}
