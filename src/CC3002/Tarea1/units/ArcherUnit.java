package CC3002.Tarea1.units;

/**@author Roberto Tapia
 *
 */
public class ArcherUnit extends Unit {
    /** Constructor de la clase ArcherUnit
     *
     */
    public ArcherUnit(){
        super(80,20);
    }

    /** Ataca a un enemigo
     *
     * @param enemy enemigo que sera atacado
     */
    public void attack(Attackable enemy) {
        if (this.isAlive()) {
            enemy.attackedByArcherUnit(this);
        }
        else{
            return;
        }
    }


    /** Recibe un ataque de un objeto de la clase InfantryUnit
     *
     * @param enemy
     */
    public void attackedByInfantryUnit(InfantryUnit enemy){
        this.doDamage(enemy,1.2);
    }

    /** Recibe un ataque de un objeto de la clase ArcherUnit
     *
     * @param enemy
     */
    public void attackedByArcherUnit(ArcherUnit enemy){
        this.doDamage(enemy,1.2);
    }

    /** Recibe un ataque de un objeto de la clase CavalryUnit
     *
     * @param enemy
     */

    public void attackedByCavalryUnit(CavalryUnit enemy) {
        this.doDamage(enemy,1.5);

    }

    /** Recibe un ataque de un objeto de la clase SiegeUnit
     *
     * @param enemy
     */
    public void attackedBySiegeUnit(SiegeUnit enemy) {
        this.doDamage(enemy,1.5);

    }

    /** Recibe curacion de un monje
     *
     * @param ally
     */
    public void attackedByMonk(Monk ally) {
        this.doDamage(ally,-.5);

    }

    /** Recibe un ataque de un objeto de la clase Villager
     *
     * @param enemy
     */
    public void attackedByVillager(Villager enemy) {
        this.doDamage(enemy,1);

    }

    /** Recibe un ataque de un objeto de la clase Castle
     *
     * @param enemy
     */
    public void attackedByCastle(Castle enemy) {
        this.doDamage(enemy,1.2);

    }
}
