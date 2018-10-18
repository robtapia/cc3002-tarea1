package CC3002.Tarea1.units;

public class Cavalry extends Unit {
    public Cavalry(){
        super(150,35);
    }
    public void attackedByInfantry(Infantry enemy){
        this.doDamage(enemy,1.2);
    }
    public void attackedByArcher(Archer enemy){
        this.doDamage(enemy,1.0);
    }

    public void attackedByCavalry(Cavalry enemy) {
        this.doDamage(enemy,1.0);

    }

    public void attackedBySiege(Siege enemy) {
        this.doDamage(enemy,1);

    }

    public void attackedByVillager(Villager enemy) {
        this.doDamage(enemy,0.5);

    }
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,0.5);

    }



    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,0.5);

    }

    public void attack(Attackable enemy) {
        if (this.isAlive()) {
            enemy.attackedByCavalry(this);
        }
        else{
            return;
        }
    }

}
