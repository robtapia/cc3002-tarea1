package CC3002.Tarea1;

public class T1 {
    interface attacker{
        void attack(ente u);
        int getAttackPoints();


    }
    interface attackable{
        void atacked();
        void beHealed();
        int getHP();
    }

    public abstract class ente{

    }

    public abstract class Unit extends ente{
        int initialHP;
        int maxHP;
        int attackPoints;
        Boolean alive;
        Boolean isAlive(){
            return this.alive;
        }
    }

    public class infantry extends Unit implements attacker, attackable {
        public infantry(){
            initialHP=100;
            maxHP=2*initialHP;
            attackPoints=25;
            alive= true;
        }
    }
    public class archer extends Unit {

    }
    public class cavalry extends Unit {

    }
    public class siege extends Unit {

    }
    public class monk extends Unit {

    }
    public class villager extends Unit {

    }


    public abstract class Building extends ente{

    }
    public class barracks extends Building{

    }
    public class castle extends Building{

    }
}
