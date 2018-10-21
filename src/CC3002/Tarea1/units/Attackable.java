package CC3002.Tarea1.units;



interface Attackable {
    void attackedByInfantryUnit(InfantryUnit enemy);
    void attackedByArcherUnit(ArcherUnit enemy);
    void attackedByCavalryUnit(CavalryUnit enemy);
    void attackedBySiegeUnit(SiegeUnit enemy);
    void attackedByVillager(Villager ally);
    void attackedByMonk(Monk ally);
    void attackedByCastle(Castle enemy);

    double getHP();
    boolean isAlive();
}