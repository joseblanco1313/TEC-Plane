package tecplane;

/**
 *Se crea la clase Vuelos: donde se almacenará la información de los vuelos
 */
public class Vuelos {
    //Se crean los atributos de la clase
    private int numeroVuelo;
    private String origen;
    private String destino;
    private int puerta;

//métodos get's y set's
    
    /**
     * @return the numeroVuelo
     */
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * @param numeroVuelo the numeroVuelo to set
     */
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the puerta
     */
    public int getPuerta() {
        return puerta;
    }

    /**
     * @param puerta the puerta to set
     */
    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }
}
