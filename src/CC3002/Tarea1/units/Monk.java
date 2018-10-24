package CC3002.Tarea1.units;

/**
 * Modela el comportamiento de un monje
 * @author Roberto Tapia
 */
public class Monk extends Unit {
    /**
     * Constructor de la clase, crea un objeto Monk
     */
    public Monk(){
        super(40,20);
    }

    public void attackedByInfantryUnit(InfantryUnit enemy){
        this.die();
    }
    public void attackedByArcherUnit(ArcherUnit enemy){
        this.die();
    }

    public void attackedByCavalryUnit(CavalryUnit enemy) {
        this.die();

    }

    public void attackedBySiegeUnit(SiegeUnit enemy) {
        this.die();

    }

    public void attackedByVillager(Villager enemy) {
        this.doDamage(enemy,0);

    }
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,-0.5);

    }



    public void attackedByCastle(Castle enemy) {
        this.die();

    }

    public void attack(Attackable ally) {
        if (this.isAlive()) {
            ally.attackedByMonk(this);
        }
        else{
            return;
        }
    }

}
