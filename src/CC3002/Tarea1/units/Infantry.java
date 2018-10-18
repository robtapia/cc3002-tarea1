package CC3002.Tarea1.units;



public class Infantry extends Unit {
    public Infantry(){
        super(100,25);

    }
    public void attackedByInfantry(Infantry enemy){
        this.doDamage(enemy,1.0);
    }
    public void attackedByArcher(Archer enemy){
        this.doDamage(enemy,1.2);
    }

    public void attackedByCavalry(Cavalry enemy) {
        this.doDamage(enemy,1.0);

    }

    public void attackedBySiege(Siege enemy) {
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
            enemy.attackedByInfantry(this);
        }
        else{
            return;
        }
    }


}