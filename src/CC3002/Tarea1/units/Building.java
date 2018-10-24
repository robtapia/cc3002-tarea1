package CC3002.Tarea1.units;


/**
 * Modela el comportamiento de los edificios
 * @author Roberto Tapia
 */
public abstract class Building extends Entity{

    /**
     * Constructor de la clase, crea un objeto Building
     * @param initialHP
     */
    Building(double initialHP){
        super(initialHP,initialHP);

    }
}
