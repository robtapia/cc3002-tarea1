package CC3002.Tarea1.units;



interface Attackable {
    void attackedByInfantry(Infantry enemy);
    void attackedByArcher(Archer enemy);
    void attackedByCavalry(Cavalry enemy);
    void attackedBySiege(Siege enemy);
    void attackedByVillager(Villager ally);
    void attackedByMonk(Monk ally);
    void attackedByCastle(Castle enemy);
    double getHP();
    boolean isAlive();
}