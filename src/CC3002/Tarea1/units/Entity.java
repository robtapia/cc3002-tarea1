package CC3002.Tarea1.units;

public abstract class Entity implements Attackable {
    double initialHP;
    double currentHP;
    double maxHP;
    boolean alive;
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
    protected void doDamage(Attacker attacker,double factor){
        double damage=attacker.getAttackPoints()*factor;
        if(!isAlive()){
            return;
        }
        if(this.getHP()>=damage) {
            currentHP=currentHP-damage;
        } else if(this.getHP() > this.maxHP){
            this.currentHP=this.maxHP;
        } else{
            this.currentHP=0;
            this.alive=false;
        }
    }
    protected void die(){
        currentHP=0;
        alive=false;


    }

}
