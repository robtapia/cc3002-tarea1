package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class VillagerTest {
    @Test
    public void VillagerCreationTest(){
        Villager aldeano = new Villager();
        assertEquals(50,aldeano.getHP(),0.01);
        assertEquals(20,aldeano.getAttackPoints(),0.01);

    }
    @Test
    public void VillagerVsArcherUnitTest(){
        Villager aldeano = new Villager();
        ArcherUnit arquero=new ArcherUnit();
        aldeano.attack(arquero);
        arquero.attack(aldeano);
        assertEquals(20,aldeano.getHP(),0.01);
        assertEquals(60,arquero.getHP(),0.01);

    }
    @Test
    public void VillagerVSBarracksTest(){
        Villager aldeano = new Villager();
        Barracks barracks= new Barracks();
        InfantryUnit soldado=new InfantryUnit();
        aldeano.attack(barracks);
        assertEquals(300,barracks.getHP(),0.01);
        soldado.attack(barracks);
        aldeano.attack(barracks);
        assertEquals(296.5,barracks.getHP(),0.01);

    }
    @Test
    public void VillagerVSCastleTest(){
        Villager aldeano = new Villager();
        Castle castillo= new Castle();
        InfantryUnit soldado=new InfantryUnit();
        aldeano.attack(castillo);
        assertEquals(400,castillo.getHP(),0.01);
        soldado.attack(castillo);
        aldeano.attack(castillo);
        assertEquals(398.5,castillo.getHP(),0.01);
        castillo.attack(aldeano);
        assertEquals(0,aldeano.getHP(),0.01);
        assertFalse(aldeano.isAlive());
    }
    @Test
    public void VillagerVSCavalryUnitTest(){
        Villager aldeano = new Villager();
        CavalryUnit caballeria=new CavalryUnit();
        aldeano.attack(caballeria);
        caballeria.attack(aldeano);
        assertEquals(0,aldeano.getHP(),0.01);
        assertFalse(aldeano.isAlive());
        assertEquals(140,caballeria.getHP(),0.01);
    }
    @Test
    public void VillagerVSInfantryUnitTest(){
        Villager aldeano = new Villager();
        InfantryUnit soldado= new InfantryUnit();
        aldeano.attack(soldado);
        soldado.attack(aldeano);
        assertEquals(12.5,aldeano.getHP(),0.01);
        assertEquals(84,soldado.getHP(),0.01);
    }
    @Test
    public void VillagerVSMonkTest(){
        Villager aldeano = new Villager();
        Monk monje=new Monk();
        monje.attack(aldeano);
        aldeano.attack(monje);
        assertEquals(60,aldeano.getHP(),0.01);
        assertEquals(40,monje.getHP(),0.01);
    }
    @Test
    public void VillagerVSSiegeUnitTest(){
        Villager aldeano = new Villager();
        SiegeUnit catapulta=new SiegeUnit();
        aldeano.attack(catapulta);
        catapulta.attack(aldeano);
        assertEquals(0,aldeano.getHP(),0.01);
        assertFalse(aldeano.isAlive());
        assertEquals(210,catapulta.getHP(),0.01);

    }
    @Test
    public void VillagerVSVillager(){
        Villager aldeano = new Villager();
        Villager otroAldeano = new Villager();
        aldeano.attack(otroAldeano);
        otroAldeano.attack(aldeano);
        assertEquals(30,aldeano.getHP(),0.01);
        assertEquals(30,otroAldeano.getHP(),0.01);
    }
    @Test
    public void VillagerDeathTest(){
        Villager aldeano = new Villager();
        Monk monje=new Monk();
        SiegeUnit catapulta=new SiegeUnit();
        catapulta.attack(aldeano);
        assertEquals(0,aldeano.getHP(),0.01);
        assertFalse(aldeano.isAlive());
        monje.attack(aldeano);
        aldeano.attack(catapulta);
        assertEquals(200,catapulta.getHP(),0.01);



    }
}
