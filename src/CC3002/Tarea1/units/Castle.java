package CC3002.Tarea1.units;

public class Castle extends Building implements Attacker{
    double attackPoints;
    Castle(){
        super(400);
        attackPoints=30;
    }


    public void attackedByInfantry(Infantry enemy) {
        this.doDamage(enemy.attackPoints*0.3);
    }


    public void attackedByArcher(Archer enemy) {

    }


    public void attackedByCavalry(Cavalry enemy) {

    }


    public void attackedBySiege(Siege enemy) {

    }


    public void attackedByMonk(Monk ally) {

    }


    public void attackedByVillager(Villager ally) {

    }


    public void attackedByCastle(Castle enemy) {

    }
}
