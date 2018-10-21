package CC3002.Tarea1.units;

public class Castle extends Building implements Attacker{
    double attackPoints;
    public Castle(){
        super(400);
        attackPoints=50;
    }
    public void attack(Attackable enemy) {
        if (this.isAlive()) {
            enemy.attackedByCastle(this);
        }
        else{
            return;
        }
    }


    public double getAttackPoints() {
        return this.attackPoints;
    }

    public void attackedByInfantryUnit(InfantryUnit enemy){
        this.doDamage(enemy,0.3);
    }
    public void attackedByArcherUnit(ArcherUnit enemy){
        this.doDamage(enemy,0.1);
    }

    public void attackedByCavalryUnit(CavalryUnit enemy) {
        this.doDamage(enemy,0.3);

    }

    public void attackedBySiegeUnit(SiegeUnit enemy) {
        this.doDamage(enemy,2);

    }

    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,0);

    }

    public void attackedByVillager(Villager ally) {
        this.doDamage(ally,-0.3);

    }

    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,0.1);

    }
}
