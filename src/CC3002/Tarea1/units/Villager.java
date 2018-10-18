package CC3002.Tarea1.units;

public class Villager extends Unit {
    public Villager(){
        super(50,20);
    }



    public void attackedByInfantry(Infantry enemy){
        this.doDamage(enemy,1.5);
    }
    public void attackedByArcher(Archer enemy){
        this.doDamage(enemy,1.5);
    }

    public void attackedByCavalry(Cavalry enemy) {
        this.doDamage(enemy,1.5);

    }

    public void attackedBySiege(Siege enemy) {
        this.doDamage(enemy,1.5);

    }

    public void attackedByVillager(Villager enemy) {
        this.doDamage(enemy,1);

    }
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,-0.5);

    }



    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,1.2);

    }

    public void attack(Attackable enemy) {
        if (this.isAlive()) {
            enemy.attackedByVillager(this);
        }
        else{
            return;
        }
    }

}
