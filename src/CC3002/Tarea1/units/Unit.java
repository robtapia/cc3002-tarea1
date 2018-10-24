package CC3002.Tarea1.units;

/**
 * Modela el comportamiento de todas las unidades
 * @author Roberto Tapia
 */

public abstract class Unit extends Entity implements Attacker {

    int attackPoints;

    /**
     * Constructor de la clase, crea un objeto Unit
     * @param initialHP     Cantidad inicial de HP de una unidad
     * @param attackPoints  Cantidad de puntos de ataque de una unidad
     */
    Unit(int initialHP, int attackPoints){
        super(initialHP,2*initialHP);
        this.attackPoints=attackPoints;

    }
    public double getAttackPoints(){
        return this.attackPoints;
    }
}