
package tecplane;

/**
 *Se crea la clase NodoPasajero.
 */
public class NodoPasajero {
        //Se definen los atributos de la clase NodoPasajero
        private Pasajero elemento;
        private NodoPasajero next;
        //Se crea el constructor del Nodo especial
        public NodoPasajero (){
            this.elemento = null;
            this.next = null;
        }
        /**
         * Se crea un constructor de NodoPasajero, cuando el elemento sea el único o el último
         * @param elemento el elemento que se asignará
         */
        public NodoPasajero (Pasajero elemento){
            this.elemento = elemento;
            this.next = null;
        }
        /**
         * Se crea otro constructor para nodo, el cual recibe un elemento y asigna al siguente
         * @param elemento el elemento que se asignará
         * @param next elemento al que se referenciará
         */
        public NodoPasajero (Pasajero elemento, NodoPasajero next){
            this.elemento = elemento;
            this.next = next;
        }
//Se crean los métodos de la clase NodoPasajero
        /** Método para retornar el elemento
         * @return el elemento
         */
        public Pasajero getElement() {
            return elemento;
        }

        /**Método para establecer el elemento
         * @param elemento el elemento a establecer
         */
        public void setElement(Pasajero elemento) {
            this.elemento = elemento;
        }

        /**Método para retornar el valor del siguiente elemento
         * @return el siguiente elemento
         */
        public NodoPasajero getNext() {
            return next;
        }

        /**Método para establecer el siguiente elemento a referenciar
         * @param next el elemento a referenciar
         */
        public void setNext(NodoPasajero next) {
            this.next = next;
        }
}

