package CC3002.Tarea1.units;

/**
 * Modela el comportamiento de una unidad de asedio
 * @author Roberto Tapia
 */
public class SiegeUnit extends Unit {
    /**
     * Constructor de la clase, crea un objeto SiegeUnit
     */
    public SiegeUnit(){
        super(200,50);

    }

    public void attackedByInfantryUnit(InfantryUnit enemy){
        this.doDamage(enemy,1.2);
    }
    public void attackedByArcherUnit(ArcherUnit enemy){
        this.doDamage(enemy,0.8);
    }

    public void attackedByCavalryUnit(CavalryUnit enemy) {
        this.doDamage(enemy,1.2);

    }

    public void attackedBySiegeUnit(SiegeUnit enemy) {
        this.doDamage(enemy,1.5);

    }

    public void attackedByVillager(Villager ally) {
        this.doDamage(ally,-0.5);

    }
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,0);

    }



    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,0.5);

    }

    public void attack(Attackable enemy) {
        if (this.isAlive()) {
            enemy.attackedBySiegeUnit(this);
        }
        else{
            return;
        }
    }
}
