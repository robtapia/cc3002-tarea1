package CC3002.Tarea1.units;


/** Metodos necesarios para las entidades que son atacables
 *  @author Roberto Tapia
 */
interface Attackable {

    /**
     * Recibe un ataque de un objeto de la clase InfantryUnit
     * @param enemy Unidad que ataca
     */
    void attackedByInfantryUnit(InfantryUnit enemy);

    /**
     * Recibe un ataque de un objeto de la clase ArcherUnit
     * @param enemy Unidad que ataca
     */
    void attackedByArcherUnit(ArcherUnit enemy);

    /**
     * Recibe un ataque de un objeto de la clase CavalryUnit
     * @param enemy Unidad que ataca
     */
    void attackedByCavalryUnit(CavalryUnit enemy);

    /**
     * Recibe un ataque de un objeto de la clase SiegeUnit
     * @param enemy Unidad que ataca
     */
    void attackedBySiegeUnit(SiegeUnit enemy);

    /**
     * Recibe un ataque de un objeto de la clase Villager
     * @param ally Unidad que ataca/cura
     */
    void attackedByVillager(Villager ally);

    /**
     * Recibe curacion de un objeto de la clase Monk
     * @param ally Unidad que cura
     */
    void attackedByMonk(Monk ally);

    /**
     * Recibe un ataque de un objeto de la clase Castle
     * @param enemy Unidad que ataca
     */
    void attackedByCastle(Castle enemy);

    /**
     * Entrega los HP actuales
     * @return HP actuales
     */
    double getHP();

    /**
     * Entrega el estado actual de la entidad
     * @return true  si la unidad esta viva, falso en caso contrario
     */
    boolean isAlive();
}