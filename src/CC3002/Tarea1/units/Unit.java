package CC3002.Tarea1.units;

public abstract class Unit extends Entity implements Attackable, Attacker {

    int attackPoints;

    Unit(int initialHP, int attackPoints){
        super(initialHP,2*initialHP);
        this.attackPoints=attackPoints;

    }

}