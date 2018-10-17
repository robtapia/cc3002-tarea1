package CC3002.Tarea1.units;



public class Infantry extends Unit {
    public Infantry(){
        super(100,25);

    }
    public void attack(Attackable enemy) {
        enemy.attackedByInfantry(this);

    }
    public void attackedByInfantry(Infantry enemy){
        this.doDamage(enemy.attackPoints);

    }
    public void attackedByArcher(Archer enemy){
        this.doDamage(enemy.attackPoints*1.2);

    }


}