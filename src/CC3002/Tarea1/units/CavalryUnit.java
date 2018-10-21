package CC3002.Tarea1.units;

public class CavalryUnit extends Unit {
    public CavalryUnit(){
        super(150,35);
    }
    public void attackedByInfantryUnit(InfantryUnit enemy){
        this.doDamage(enemy,1.2);
    }
    public void attackedByArcherUnit(ArcherUnit enemy){
        this.doDamage(enemy,1.0);
    }

    public void attackedByCavalryUnit(CavalryUnit enemy) {
        this.doDamage(enemy,1.0);

    }

    public void attackedBySiegeUnit(SiegeUnit enemy) {
        this.doDamage(enemy,1);

    }

    public void attackedByVillager(Villager enemy) {
        this.doDamage(enemy,0.5);

    }
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,-0.5);

    }



    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,1.2);

    }

    public void attack(Attackable enemy) {
        if (this.isAlive()) {
            enemy.attackedByCavalryUnit(this);
        }
        else{
            return;
        }
    }

}
