import java.io.Serializable;

/**
 * Classe relativa ao ParInt
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
final class ParInt implements Serializable {

        private int primeiro;
        private int segundo;

    /**
     * Construtor parametrizado
     * @param primeiro primeiro int
     * @param segundo segundo int
     */
        public ParInt(int primeiro, int segundo){
            this.primeiro = primeiro;
            this.segundo = segundo;
        }

    /**
     * Get do primeiro Int
     * @return Primeiro Int
     */
        public int getPrimeiro() {
            return primeiro;
        }

    /**
     * Get do segundo int
     * @return int
     */
        public int getSegundo() {
            return segundo;
        }

    /**
     * Incrementa Primeiro Int
     */
        public void incPrimeiro() {
            primeiro++;
        }

    /**
     * Adiciona x ao primeiro int
     * @param x valor a adicionar
     */
    public void addPrimeiro(int x) {
            primeiro+=x;
        }

    /**
     * Incrementa segundo int
     */
        public void incSegundo() {
            segundo++;
        }

    /**
     * Adiciona x ao segundo Int
     * @param x valor a acrescentar
     */
        public void addSegundo(int x) {
            segundo+=x;
        }


    }

