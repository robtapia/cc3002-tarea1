package CC3002.Tarea1.units;

/**
 * Comportamientos necesarios para una entidad con la capacidad de atacar
 * @author Roberto Tapia
 *
 */
public interface Attacker {
    /**
     * Ataca a la entidad enemy, debe chequear que la entidad que realiza el ataque este viva
     * @param enemy enemigo que sera atacado
     */
    void attack(Attackable enemy);

    /**
     *
     * @return entrega los AP de la entidad
     */
    double getAttackPoints();
}
