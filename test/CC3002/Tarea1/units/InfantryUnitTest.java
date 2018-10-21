package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class InfantryUnitTest {
    @Test
    public void InfantryUnitCreationTest(){
        InfantryUnit soldado=new InfantryUnit();
        assertEquals(100,soldado.getHP(),0.01);
        assertEquals(25,soldado.getAttackPoints(),0.01);
    }
    @Test
    public void InfantryUnitVsArcherUnitTest(){
        InfantryUnit soldado=new InfantryUnit();
        ArcherUnit arquero=new ArcherUnit();
        soldado.attack(arquero);
        arquero.attack(soldado);
        assertEquals(76,soldado.getHP(),0.01);
        assertEquals(50,arquero.getHP(),0.01);

    }
    @Test
    public void InfantryUnitVSBarracksTest(){
        InfantryUnit soldado=new InfantryUnit();
        Barracks barraca=new Barracks();
        soldado.attack(barraca);
        assertEquals(282.5,barraca.getHP(),0.01);
    }
    @Test
    public void InfantryUnitVSCastleTest(){
        InfantryUnit soldado=new InfantryUnit();
        Castle castillo=new Castle();
        soldado.attack(castillo);
        castillo.attack(soldado);
        assertEquals(40,soldado.getHP(),0.01);
        assertEquals(392.5,castillo.getHP(),0.01);
    }
    @Test
    public void InfantryUnitVSCavalryUnitTest(){
        InfantryUnit soldado=new InfantryUnit();
        CavalryUnit caballero=new CavalryUnit();
        soldado.attack(caballero);
        caballero.attack(soldado);
        assertEquals(65,soldado.getHP(),0.01);
        assertEquals(120,caballero.getHP(),0.01);

    }
    @Test
    public void InfantryUnitVSInfantryUnitTest(){
        InfantryUnit soldado=new InfantryUnit();
        InfantryUnit otroSoldado=new InfantryUnit();
        soldado.attack(otroSoldado);
        otroSoldado.attack(soldado);
        assertEquals(75,soldado.getHP(),0.01);
        assertEquals(75,otroSoldado.getHP(),0.01);
    }
    @Test
    public void InfantryUnitVSMonkTest(){
        InfantryUnit soldado=new InfantryUnit();
        Monk monje=new Monk();
        monje.attack(soldado);
        soldado.attack(monje);
        assertEquals(110,soldado.getHP(),0.01);
        assertEquals(0,monje.getHP(),0.01);
        assertFalse(monje.isAlive());
    }
    @Test
    public void InfantryUnitVSSiegeUnitTest(){
        InfantryUnit soldado=new InfantryUnit();
        SiegeUnit catapulta=new SiegeUnit();
        soldado.attack(catapulta);
        catapulta.attack(soldado);
        assertEquals(25,soldado.getHP(),0.01);
        assertEquals(170,catapulta.getHP(),0.01);
    }
    @Test
    public void InfantryUnitVSVillager(){
        InfantryUnit soldado=new InfantryUnit();
        Villager aldeano=new Villager();
        aldeano.attack(soldado);
        soldado.attack(aldeano);
        assertEquals(84,soldado.getHP(),0.01);
        assertEquals(12.5,aldeano.getHP(),0.01);
    }
    @Test
    public void InfantryUnitDeathTest(){
        InfantryUnit soldado=new InfantryUnit();
        SiegeUnit catapulta=new SiegeUnit();
        Monk monje=new Monk();
        catapulta.attack(soldado);
        catapulta.attack(soldado);
        assertEquals(0,soldado.getHP(),0.01);
        assertFalse(soldado.isAlive());
        monje.attack(soldado);
        assertEquals(0,soldado.getHP(),0.01);
        assertFalse(soldado.isAlive());
        soldado.attack(monje);
        assertTrue(monje.isAlive());
    }
}

