package CC3002.Tarea1.units;

public class Barracks extends Building implements Attackable {
    public Barracks(){
        super(300);
    }

    public void attackedByInfantry(Infantry enemy){
        this.doDamage(enemy,0.7);
    }


    public void attackedByArcher(Archer enemy){
        this.doDamage(enemy,0.7);
    }

    public void attackedByCavalry(Cavalry enemy) {
        this.doDamage(enemy,0.7);

    }

    public void attackedBySiege(Siege enemy) {
        this.doDamage(enemy,2);

    }

    public void attackedByVillager(Villager ally) {
        this.doDamage(ally,-0.7);

    }
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,0);

    }



    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,0.7);

    }


}

