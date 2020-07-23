import java.io.Serializable;

/**
 * Classe relativa ao ParFloat
 * @author Carlos Afonso
 * @author Joao Neves
 * @author Gonçalo Nogueira
 */
    final class ParFloat implements Serializable {

        private float primeiro;
        private float segundo;

    /**
     * Construtor Parametrizado
     * @param primeiro float
     * @param segundo float
     */
        public ParFloat(float primeiro, float segundo){
            this.primeiro = primeiro;
            this.segundo = segundo;
        }

    /**
     * Get do primeiro Float
     * @return float
     */
        public float getPrimeiroF() {
            return primeiro;
        }

    /**
     * Get do segundo Float
     * @return float
     */
        public float getSegundoF() {
            return segundo;
        }

    /**
     * Metodo para incrementar o primeiro float
     */
        public void incPrimeiroF() {
            primeiro++;
        }

    /**
     * Metodo para aumentar o primeiro float
     * @param x valor
     */
        public void addPrimeiroF(int x) {
            primeiro+=x;
        }

    /**
     * Metodo para incrementar segundo Float
     */
        public void incSegundoF() {
            segundo++;
        }

    /**
     * Metodo para adicionar ao segundo float
     * @param x valor
     */
        public void addSegundoF(int x) {
            segundo+=x;
        }


    }

