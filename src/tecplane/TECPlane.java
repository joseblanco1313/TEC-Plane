
package tecplane;

/** Se crea el método main que ejecutará todo el código.
 *
 * @authors Jose Ignacio Blanco Chaves, Julio Romero Chacón, Kevin Rojas Salazar
 */
public class TECPlane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se instancian dos colas
        ColaCheckIn cola = new ColaCheckIn();
        ColaCheckIn colaNueva = new ColaCheckIn();
    //Se instancian los pasajeros
        Pasajero p1 = new Pasajero ();
        p1.setNombre("Kevin Rojas");
        p1.setFecha("09/10/2019");
        p1.setNacionalidad("Costarricense");
        p1.setNumeroPasaporte(1075740768);
        p1.setOrigen("Costa Rica");
        p1.setDestino("Holanda");
        p1.setPlanLealtad("Especial");
                cola.enqueue(p1);
        //----------------------------------------------
                Pasajero p2 = new Pasajero ();
        p2.setNombre("Sebas Córdoba");
        p2.setFecha("17/04/2000");
        p2.setNacionalidad("Costarricense");
        p2.setNumeroPasaporte(306460345);
        p2.setOrigen("Costa Rica");
        p2.setDestino("Alemania");
        p2.setPlanLealtad("Oro");
                cola.enqueue(p2);
        //---------------------------------------------
                Pasajero p3 = new Pasajero ();
        p3.setNombre("Julio Romero");
        p3.setFecha("01//04/2000");
        p3.setNacionalidad("Costarricense");
        p3.setNumeroPasaporte(106370646);
        p3.setOrigen("Costa Rica");
        p3.setDestino("México");
        p3.setPlanLealtad("Especial");
                cola.enqueue(p3);
        //----------------------------------
                Pasajero p4 = new Pasajero ();
        p4.setNombre("Tavo Calderón");
        p4.setFecha("14/02/2000");
        p4.setNacionalidad("Costarricense");
        p4.setNumeroPasaporte(109650352);
        p4.setOrigen("Costa Rica");
        p4.setDestino("Estados Unidos");
        p4.setPlanLealtad("Economico");
                cola.enqueue(p4);
        //---------------------------------------
        Pasajero p5 = new Pasajero ();
        p5.setNombre("Jose Blanco");
        p5.setFecha("26/03/2001");
        p5.setNacionalidad("Costarricense");
        p5.setNumeroPasaporte(305310180);
        p5.setOrigen("Costa Rica");
        p5.setDestino("Dubai");
        p5.setPlanLealtad("Platino");
                cola.enqueue(p5);
        System.out.println("Cola Normal: " + cola.toString());
        cola.crearAsientos();
        System.out.println("Cola prioridad:" + colaNueva.toString());
        
        


    }
    
}
