package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class InfantryTest {
    @Test
    public void InfantryCreationTest(){
        Infantry soldado=new Infantry();
        assertEquals(100,soldado.getHP(),0.01);
        assertEquals(25,soldado.getAttackPoints(),0.01);
    }
    @Test
    public void InfantryVsArcherTest(){
        Infantry soldado=new Infantry();
        Archer arquero=new Archer();
        soldado.attack(arquero);
        arquero.attack(soldado);
        assertEquals(76,soldado.getHP(),0.01);
        assertEquals(50,arquero.getHP(),0.01);

    }
    @Test
    public void InfantryVSBarracksTest(){
        Infantry soldado=new Infantry();
        Barracks barraca=new Barracks();
        soldado.attack(barraca);
        assertEquals(282.5,barraca.getHP(),0.01);
    }
    @Test
    public void InfantryVSCastleTest(){
        Infantry soldado=new Infantry();
        Castle castillo=new Castle();
        soldado.attack(castillo);
        castillo.attack(soldado);
        assertEquals(40,soldado.getHP(),0.01);
        assertEquals(392.5,castillo.getHP(),0.01);
    }
    @Test
    public void InfantryVSCavalryTest(){
        Infantry soldado=new Infantry();
        Cavalry caballero=new Cavalry();
        soldado.attack(caballero);
        caballero.attack(soldado);
        assertEquals(65,soldado.getHP(),0.01);
        assertEquals(120,caballero.getHP(),0.01);

    }
    @Test
    public void InfantryVSInfantryTest(){
        Infantry soldado=new Infantry();
        Infantry otroSoldado=new Infantry();
        soldado.attack(otroSoldado);
        otroSoldado.attack(soldado);
        assertEquals(75,soldado.getHP(),0.01);
        assertEquals(75,otroSoldado.getHP(),0.01);
    }
    @Test
    public void InfantryVSMonkTest(){
        Infantry soldado=new Infantry();
        Monk monje=new Monk();
        monje.attack(soldado);
        soldado.attack(monje);
        assertEquals(110,soldado.getHP(),0.01);
        assertEquals(0,monje.getHP(),0.01);
        assertFalse(monje.isAlive());
    }
    @Test
    public void InfantryVSSiegeTest(){
        Infantry soldado=new Infantry();
        Siege catapulta=new Siege();
        soldado.attack(catapulta);
        catapulta.attack(soldado);
        assertEquals(25,soldado.getHP(),0.01);
        assertEquals(170,catapulta.getHP(),0.01);
    }
    @Test
    public void InfantryVSVillager(){
        Infantry soldado=new Infantry();
        Villager aldeano=new Villager();
        aldeano.attack(soldado);
        soldado.attack(aldeano);
        assertEquals(84,soldado.getHP(),0.01);
        assertEquals(12.5,aldeano.getHP(),0.01);
    }
    @Test
    public void InfantryDeathTest(){
        Infantry soldado=new Infantry();
        Siege catapulta=new Siege();
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

