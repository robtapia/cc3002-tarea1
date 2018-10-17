package CC3002.Tarea1.units;

public class Castle extends Building implements Attacker{
    double attackPoints;
    Castle(){
        super(400);
        attackPoints=30;
    }
    public void attack(Attackable enemy){
        enemy.attackedByCastle(this);
    }


    public double getAttackPoints() {
        return this.attackPoints;
    }

    public void attackedByInfantry(Infantry enemy){
        this.doDamage(enemy,0.3);
    }
    public void attackedByArcher(Archer enemy){
        this.doDamage(enemy,0.1);
    }

    public void attackedByCavalry(Cavalry enemy) {
        this.doDamage(enemy,0.3);

    }

    public void attackedBySiege(Siege enemy) {
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
