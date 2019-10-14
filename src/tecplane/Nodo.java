package tecplane;

/**
 *Se crea la clase Nodo
 */
public class Nodo {
    //atributos de la clase Nodo
		
		private Vuelos element;
		private Nodo next;
		private Nodo previous;
		
		//Constructores de Nodo
		public Nodo() {
			this.element = null;
			this.next = null;
			this.previous = null;
		}
		
		public Nodo(Vuelos element) {
			this.element = element;
			this.next = null;
			this.previous = null;
		}
		
		public Nodo(Vuelos element,Nodo previous, Nodo next) {
			this.element = element;
			this.previous = previous;
			this.next = next;
			
		}
		
		//métodos
		
                /** Retorna el elemento del nodo actual
                 * 
                 * @return el elemento
                 */
		public Vuelos getElement() {
			return this.element;
		}
		/** Establece el elemento en el nodo
                 * 
                 * @param element 
                 */
		public void setElement(Vuelos element) {
			this.element = element;
		}
		/** Retorna el siguiente nodo con respecto al nodo actual
                 * 
                 * @return el siguiente nodo
                 */
		public Nodo getNext() {
			return this.next;
		}
		/** Establece el nodo siguiente con respecto al nodo actual
                 * 
                 * @param next 
                 */
		public void setNext(Nodo next) {
			this.next = next;	
		}
		/** Retorna el nodo anterior al nodo actual
                 * 
                 * @return el nodo anterior
                 */
		public Nodo getPrevious() {
			return this.previous;
		}
		/**
                 * Establece el nodo anterior con respecto al nodo actual
                 * @param previous 
                 */
		public void setPrevious(Nodo previous) {
			this.previous = previous;	
		}
}
