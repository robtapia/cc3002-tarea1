package CC3002.Tarea1;

public class T1 {
    interface attacker{
        void attack(ente u);
        int getAttackPoints();


    }
    interface attackable{
        void attackedByInfantry(infantry enemigo);
        void attackedByArcher(archer enemigo);
        void attackedByCavalry(cavalry enemigo);
        void attackedBySiege(siege enemigo);
        void attackedByMonk(monk enemigo);
        void attackedByVillager(villager enemigo);
        void attackedByCastle(castle enemigo);
        void beHealed(int amountHealed);
        int getHP();
    }


    public interface ente{
        boolean isAlive();
        int getHP();
        void attackedByInfantry(int attackPoints);
    }
    public abstract class Unit implements ente{
        int maxHP;
        int attackPoints;
    }
    public abstract class Building implements ente{

    }
    public class infantry extends Unit {
        public infantry(){
            initialHP=100;
            currentHP=initialHP;
            maxHP=2*initialHP;
            attackPoints=25;
            alive= true;
        }


        public void attackedByInfantry(int attackPoints){
            this.currentHP=this.currentHP-attackPoints;
        }
        public void attack(ente enemigo){

            enemigo.attackedByInfantry(this.attackPoints);
        }
    }
    public class archer extends Unit {
        public archer(){
            initialHP=75;
            maxHP=2*initialHP;
            attackPoints=20;
            alive= true;

        }
        public void attackedByInfantry(int attackPoints){
            this.currentHP=this.currentHP-attackPoints;
        }
    }
    public class cavalry extends Unit {
        public cavalry(){
            initialHP=150;
            maxHP=2*initialHP;
            attackPoints=20;
            alive= true;

        }
        public void attackedByInfantry(int attackPoints){
            this.currentHP=this.currentHP-attackPoints;
        }
    }
    public class siege extends Unit {
        public siege(){
            initialHP=200;
            maxHP=2*initialHP;
            attackPoints=50;
            alive= true;

        }
        public void attackedByInfantry(int attackPoints){
            this.currentHP=this.currentHP-attackPoints;
        }
    }
    public class monk extends Unit {
        public monk(){
            initialHP=20;
            maxHP=2*initialHP;
            attackPoints=25;
            alive= true;

        }
        public void attackedByInfantry(int attackPoints){
            this.currentHP=this.currentHP-attackPoints;
        }
    }
    public class villager extends Unit {
        public villager(){
            initialHP=30;
            maxHP=2*initialHP;
            attackPoints=25;
            alive= true;

        }
        public void attackedByInfantry(int attackPoints){
            this.currentHP=this.currentHP-attackPoints;
        }
    }



    public class barracks extends Building{
        public void attackedByInfantry(int attackPoints){
            this.currentHP=this.currentHP-attackPoints;
        }
    }
    public class castle extends Building{
        public void attackedByInfantry(int attackPoints){
            this.currentHP=this.currentHP-attackPoints;
        }
    }
}
