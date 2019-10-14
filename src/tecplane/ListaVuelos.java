package tecplane;
//Se importa Random
import java.util.Random;

/**
 * Se crea la clase ListaVuelos: Se almacenará cada vuelo
 */
public class ListaVuelos {

	//atributos LinkedList
	private Nodo head;
	private Nodo current;
	private Nodo tail;
	private int position;
	private int size;
        //Constructor
	public ListaVuelos(){
		this.head = new Nodo();
		this.current = this.head;
		this.tail = this.head;
		this.size = 0;
		this.position = -1;
	}
	
        //Métodos

	/**
	 * Agrega un nuevo elemento a la lista
	 * @param element El elemento a agregar
	 */
	public void insertar (Vuelos element) {
		//insertar en cualquier posiciÃ³n
		Nodo newNode = new Nodo(element, this.current, this.current.getNext());
		if (this.current != this.tail) 
			this.current.getNext().setPrevious(newNode);
		this.current.setNext(newNode);
		//necesario si se está insertando al final de la lista
		if (this.current == this.tail) {
			this.tail = tail.getNext();
		}
		this.size++;	
	}
	
	/**
	 * Agrega un nuevo elemento a la lista
	 * @param element El elemento a agregar
	 */
	public void append(Vuelos element) {
		//insertar en cualquier posiciÃ³n
		Nodo newNode = new Nodo(element, this.tail, null);
		this.tail.setNext(newNode);
		this.tail = newNode;
		this.size++;	
	}
	/** Remueve el elemento siguiente al nodo actual
         * 
         */
	public void remover(){
		//verifica si la lista está vacía
		if ((this.head == this.current) && (this.head == this.tail)){
			System.out.println("Lista vacía");
			return;
		} 
                //Valida si está en el nodo especial
		if (this.head == this.current){
			System.out.println("No se puede borrar");
			return;
		}
		
		//Verifica si el nodo current es el último elemento
		if(this.current == this.tail){
			this.current.getPrevious().setNext(null);
			this.position--;
			this.tail = this.current.getPrevious();
		} else {
			this.current.getNext().setPrevious(this.current.getPrevious());
			this.current.getPrevious().setNext(this.current.getNext());
			
		}
		this.current = this.current.getPrevious();
		this.size--;
		
		
		
		
		
	}
	/** Retorna el elemento del nodo actual
         * 
         * @return el elemento del nodo actual
         */
	public Vuelos getElement(){
		return this.current.getElement();
	}	
	/** Retorna el tamaño de la lista
         * 
         * @return size 
         */
	public int getSize() {
		return this.size;
	}
	/** Verifica si hay siguiente elemento
         * 
         * @return valor boleano (true o false)
         */
	public boolean next() {
		if (this.current == this.tail) {
			System.out.println("Último nodo");
			return false;
		}
		this.current = this.current.getNext();
		this.position++;
		return true;
	}
	/** Verifica si hay elemento anterior
         * 
         * @return valor boleano (true o false)
         */
	public boolean previous() {
		if (this.current == this.head) {
			System.out.println("Actualmente en primer nodo, no se puede retroceder");
			return false;
		}
		this.current = this.current.getPrevious();
		this.position--;
		return true;
	}
        /** Añade un nodo en una posición específica
         * 
         * @param elemento
         * @param posicion 
         */
        public void insert (Vuelos elemento, int posicion){
            this.size = 0;
            Nodo temporal = this.head;
            while (this.size != posicion){
                temporal = temporal.getNext();
                size ++;
            }
            Nodo nuevoNodo = new Nodo (elemento);
            Nodo temporalNext = temporal.getNext();
            temporal.setNext(nuevoNodo);
            nuevoNodo.setPrevious(temporal);
            nuevoNodo.setNext(temporalNext);
        }
        
        /** Remueve el nodo en una posición específica
         * 
         * @param posicion 
         */
        public void remove (int posicion){
            this.size = -1;
            Nodo temporal = this.head;
            //Ciclo para encontrar la posición
            while (this.size != posicion){
                temporal = temporal.getNext();
                this.size++;
            }
            Nodo temporalAnterior = temporal.getPrevious();
            Nodo temporalNext1 = temporal.getNext();
            temporalNext1.setPrevious(temporalAnterior);
            temporalAnterior.setNext(temporalNext1);
            
        }
        //Se crea un arreglo tipo "público (global)"
           public int [] puertas;
           /**
            * Método que creará un arreglo con el número de puertas ingresadas por el usuario
            * @param numero
            * @return 
            */
    public int [] puertasArray (int numero){
       puertas = new int [numero];
       int contador = 1;
       int asignar = 0;
       //Ciclo para agregar datos al arreglo
       while (contador <= numero){
           puertas [asignar] = contador;
           contador++;
           asignar++;
       }
       
        System.out.println("Lista ordenada: ");
        for (int i: puertas){
          System.out.print( i + ", ");
            }
          System.out.println();
          return puertas;
    }
    /**
     * Método para asignar una puerta a cada vuelo
     * @param lista 
     */
        public void asignarPuerta (ListaVuelos lista){
            //Ciclo para asignar una puerta aleatoria a cada vuelo
            for (Nodo temporal = lista.head.getNext(); temporal != null; temporal = temporal.getNext()){
                Vuelos vueloElemento = temporal.getElement();
                Random random = new Random ();
                //Búsqueda lineal para evitar la repetición de puertas
                int randomNumero = random.nextInt(puertas.length);
                vueloElemento.setPuerta(puertas[randomNumero]);
            }
            System.out.println("Lista de vuelos: " + lista.toString());
        }
        
	
	 /**
     *Método para convertir la lista a string
     * @return el string
     */
    @Override
        public String toString() {
		Nodo currentNode = this.head.getNext();
		
		StringBuilder result = new StringBuilder();
        
        for (int i = 0; currentNode != null; i++) 
		{
        	if (i > 0) 
			{
        		result.append(",");
        	}
        	Vuelos element = currentNode.getElement();
			
        	result.append(element == null ? "" : "Número de vuelo: " + element.getNumeroVuelo() + " Puerta: " + element.getPuerta());
        	currentNode = currentNode.getNext();
        }
        return result.toString();
	}    
}
