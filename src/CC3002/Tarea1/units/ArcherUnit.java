package CC3002.Tarea1.units;

public class ArcherUnit extends Unit {
    public ArcherUnit(){
        super(80,20);
    }
    public void attack(Attackable enemy) {
        if (this.isAlive()) {
            enemy.attackedByArcherUnit(this);
        }
        else{
            return;
        }
    }



    public void attackedByInfantryUnit(InfantryUnit enemy){
        this.doDamage(enemy,1.2);
    }
    public void attackedByArcherUnit(ArcherUnit enemy){
        this.doDamage(enemy,1.2);
    }

    public void attackedByCavalryUnit(CavalryUnit enemy) {
        this.doDamage(enemy,1.5);

    }

    public void attackedBySiegeUnit(SiegeUnit enemy) {
        this.doDamage(enemy,1.5);

    }

    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,-.5);

    }

    public void attackedByVillager(Villager enemy) {
        this.doDamage(enemy,1);

    }

    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,1.2);

    }
}
