package test1;

public class test1 {
    interface attackable{
        void attackedByInfantry(Infantry enemy);
        //void getHP();
        //boolean isAlive();
    }
    interface attacker{
        void attack(attackable enemy);
    }

    public class Unit{
        int initialHP;
        int currentHP;
        int maxHP;
        boolean alive;
        int attackPoints;
        int getHP(){
            return currentHP;
        }
        boolean isAlive(){
            return alive;
        }
        void checkIfDead(){
            alive=(currentHP<=0);
        }

    }

    public class Infantry extends Unit implements attackable,attacker{
        public void infantry(){
            initialHP=100;
            currentHP=initialHP;
            maxHP=2*initialHP;
            alive=true;
            attackPoints=20;
        }
        public void attack(attackable enemy) {
            enemy.attackedByInfantry(this);

        }
        public void attackedByInfantry(Infantry enemy){
            if(!isAlive()){
                return;
            }
            if(this.getHP()<=(enemy.attackPoints)){
                currentHP = currentHP - enemy.attackPoints;
                checkIfDead();
            }
            else{
                this.alive=false;
            }
        }

    }
}
