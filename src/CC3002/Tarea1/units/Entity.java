package CC3002.Tarea1.units;


/**
 * Modela el comportamiento de todas las entidades posibles en el juego
 * @author Roberto Tapia
 */

public abstract class Entity implements Attackable {
    double initialHP;
    double currentHP;
    double maxHP;
    boolean alive;

    /**
     * Constructor de la clase, crea un objeto Entity
     * @param initialHP HP con los que parte la entidad (unidad o edificio)
     * @param maxHP     HP maximos que puede tener la entidad
     */
    public Entity(double initialHP,double maxHP){
        this.initialHP=initialHP;
        this.maxHP=maxHP;
        this.currentHP=initialHP;
        this.alive=true;


    }
    public double getHP(){
        return currentHP;
    }
    public boolean isAlive(){
        return alive;
    }

    /**
     * Modifica los HP de una entidad debido a un ataque por otra entidad
     * @param attacker entidad atacante
     * @param factor    factor por el que se debe multiplicar los AP de la entidad attacker
     */
    protected void doDamage(Attacker attacker,double factor){
        double damage=attacker.getAttackPoints()*factor;
        if(!isAlive()){
            return;
        }
        if(this.getHP()>damage) {
            currentHP=currentHP-damage;
        }
        else{
            this.currentHP=0;
            this.alive=false;
        }
        if(this.getHP() > this.maxHP){
            this.currentHP=this.maxHP;
        }
    }

    /**
     * Modela la muerte de una entidad, seteando su HP a 0 y su
     * alive a false
     */
    protected void die(){
        currentHP=0;
        alive=false;


    }

}
