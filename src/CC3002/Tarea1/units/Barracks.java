package CC3002.Tarea1.units;

/**
 * Representa un edificio del tipo barracks
 * @author Roberto
 */

public class Barracks extends Building{

    /**
     * Constructor de la clase, crea un objeto Barracks
     */
    public Barracks(){
        super(300);
    }

    public void attackedByInfantryUnit(InfantryUnit enemy){
        this.doDamage(enemy,0.7);
    }


    public void attackedByArcherUnit(ArcherUnit enemy){
        this.doDamage(enemy,0.7);
    }

    public void attackedByCavalryUnit(CavalryUnit enemy) {
        this.doDamage(enemy,0.7);

    }

    public void attackedBySiegeUnit(SiegeUnit enemy) {
        this.doDamage(enemy,2);

    }

    public void attackedByVillager(Villager ally) {
        this.doDamage(ally,-0.7);

    }
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,0);

    }



    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,0.7);

    }


}

