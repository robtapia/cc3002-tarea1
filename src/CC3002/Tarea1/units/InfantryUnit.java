package CC3002.Tarea1.units;



public class InfantryUnit extends Unit {
    public InfantryUnit(){
        super(100,25);

    }
    public void attackedByInfantryUnit(InfantryUnit enemy){
        this.doDamage(enemy,1.0);
    }
    public void attackedByArcherUnit(ArcherUnit enemy){
        this.doDamage(enemy,1.2);
    }

    public void attackedByCavalryUnit(CavalryUnit enemy) {
        this.doDamage(enemy,1.0);

    }

    public void attackedBySiegeUnit(SiegeUnit enemy) {
        this.doDamage(enemy,1.5);

    }

    public void attackedByVillager(Villager enemy) {
        this.doDamage(enemy,0.8);

    }
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,-0.5);

    }



    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,1.2);

    }

    public void attack(Attackable enemy) {
        if (this.isAlive()) {
            enemy.attackedByInfantryUnit(this);
        }
        else{
            return;
        }
    }


}