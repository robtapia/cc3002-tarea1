package CC3002.Tarea1.units;

public class Monk extends Unit {
    public Monk(){
        super(40,20);
    }

    public void attackedByInfantry(Infantry enemy){
        this.die();
    }
    public void attackedByArcher(Archer enemy){
        this.die();
    }

    public void attackedByCavalry(Cavalry enemy) {
        this.die();

    }

    public void attackedBySiege(Siege enemy) {
        this.die();

    }

    public void attackedByVillager(Villager enemy) {
        this.doDamage(enemy,0);

    }
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,-0.5);

    }



    public void attackedByCastle(Castle enemy) {
        this.die();

    }

    public void attack(Attackable ally) {
        if (this.isAlive()) {
            ally.attackedByMonk(this);
        }
        else{
            return;
        }
    }

}
