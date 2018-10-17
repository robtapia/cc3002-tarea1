package CC3002.Tarea1.units;

public class Villager extends Unit {
    public Villager(){
        super(50,30);
    }



    public void attackedByInfantry(Infantry enemy){
        this.doDamage(enemy,1.2);
    }
    public void attackedByArcher(Archer enemy){
        this.doDamage(enemy,0.8);
    }

    public void attackedByCavalry(Cavalry enemy) {
        this.doDamage(enemy,1.2);

    }

    public void attackedBySiege(Siege enemy) {
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
        enemy.attackedByVillager(this);
    }

}
