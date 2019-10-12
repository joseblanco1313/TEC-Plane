package tecplane;
//Se importa la clase Random
import java.util.Random;
/**
 *Se crea la clase "ColaCheckIn": Será una cola donde los usuarios se registren para el vuelo.
 */
public class ColaCheckIn {
    //Se definen los atributos
 private NodoPasajero front;
	private NodoPasajero rear;
	private int size;
        
	//Se define el constructor
	public ColaCheckIn(){
		this.front = new NodoPasajero ();
		this.rear = this.front;
		this.size = 0;
	}
	/**
         * Método para agregar un Pasajero a la cola
         * @param elemento 
         */
	public void enqueue (Pasajero elemento){
		this.rear.setNext(new NodoPasajero (elemento, null));
		this.rear = rear.getNext();
		this.size++;
	}
     
	// Método para desencolar un elemento de la cola
	public Pasajero dequeue(){
		if(this.size == 0){
			System.out.println("Queue is empty");
			return null;
		}
		Pasajero temp = (Pasajero) this.front.getNext().getElement();
		NodoPasajero nTemp = this.front.getNext();
		this.front.setNext(nTemp.getNext());
		if (this.rear == nTemp){
			this.rear = this.front;
		}
		this.size--;
		return temp;
	}
	//Localiza el primer elemento
	public Pasajero primero(){
		if(this.size == 0){
			System.out.println("Queue is empty");
			return null;
		}
		return (Pasajero) this.front.getNext().getElement();
	}
	//Retorna el tamaño de la cola
	public int size(){
		return this.size;
	}
	//Vacía la cola
	public void clear(){
		this.front = new NodoPasajero();
		this.rear = this.front;
		this.size = 0;
	}
/**
 * Método para crear la cola de prioridad
 * @param cola cola con los usuarios en orden de llegada
 * @param colaNueva cola que se ordenará con base en la prioridad
 * @return colaNueva
 */
       String asientos [];
       public void crearAsientos (){
           asientos  = new String [300];
           int tamaño = 3;
           int contador = 0;
           //Ciclo para añadir los asientos al arreglo
           while (tamaño <= 300){
               asientos [tamaño-3] = Integer.toString(contador) + "V";
               asientos [tamaño-2] = Integer.toString(contador) + "C";
               asientos [tamaño-1] = Integer.toString(contador) + "P";
               tamaño += 3; 
                contador++;
               
           }
       }
       public void asignarAsientos (Pasajero pasajero){
           Random numeroRandom1 = new Random();
           int randomAsiento1 = numeroRandom1.nextInt(300);
           pasajero.setAsiento(asientos[randomAsiento1]+" " + pasajero.getPlanLealtad());
       }
       public ColaCheckIn colaPrioridad (ColaCheckIn cola, ColaCheckIn  colaNueva){
     
           //Añade primero a la prioridad especial
            NodoPasajero especial = cola.front.getNext();
            //Ciclo que recorre la cola, añade a las personas con prioridad "especial" y les asigna un asiento
            while (especial != null){
                Pasajero especialElemento = (Pasajero) especial.getElement();
                if (especialElemento.getPlanLealtad().equalsIgnoreCase("especial")){
                    colaNueva.enqueue(especialElemento);      
                }
                
                especial = especial.getNext();
                
            }
            //Añade de segundos a la prioridad "VIP: Platino"
            NodoPasajero platino = cola.front.getNext();
             //Ciclo que recorre la cola, añade a las personas con prioridad "platino" y les asigna un asiento
            while (platino != null){
                Pasajero platinoElemento = (Pasajero) platino.getElement();
                if (platinoElemento.getPlanLealtad().equalsIgnoreCase("platino")){
                    colaNueva.enqueue(platinoElemento);


                }
                
                platino = platino.getNext();
                
                
            }
            //Añade de terciero a la prioridad "VIP: Oro"
            NodoPasajero oro = cola.front.getNext();
             //Ciclo que recorre la cola, añade a las personas con prioridad "oro" y les asigna un asiento
            while (oro != null){
                Pasajero oroElemento = (Pasajero) oro.getElement();
                if (oroElemento.getPlanLealtad().equalsIgnoreCase("oro")){
                    colaNueva.enqueue(oroElemento);
                  
                 oro = oro.getNext();
                }

                oro = oro.getNext();
                
            }
            //Añade de último a la prioridad económica
            NodoPasajero economico = cola.front.getNext();
             //Ciclo que recorre la cola, añade a las personas con prioridad "económica" y les asigna un asiento
            while (economico != null){
                     Pasajero economicoElemento = (Pasajero) economico.getElement();
                if (economicoElemento.getPlanLealtad().equalsIgnoreCase("economico")){
                    colaNueva.enqueue(economicoElemento);
                }
               
                economico = economico.getNext();
                
            }
            
            return colaNueva;
        }
       
    
	//Convierte datos a string
       @Override
	public String toString(){
		String result = "**Cola de registro**\n";
		NodoPasajero tFront = this.front;
		int tSize = this.size;
		while(tSize != 0){
			result+= tFront.getNext().getElement().getNombre() + "\n ";
                        result+=  "Plan de Lealtad: " + tFront.getNext().getElement().getPlanLealtad() + "\n";
			tFront = tFront.getNext();
			tSize--;
		}
		return result;
	}
        //Modificación del método "toString" para la cola de prioridad
      

	   
}
