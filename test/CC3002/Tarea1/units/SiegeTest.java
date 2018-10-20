package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class SiegeTest {
    @Test
    public void SiegeCreationTest(){
        Siege catapulta=new Siege();
    }
    @Test
    public void SiegeVsArcherTest(){
        Siege catapulta=new Siege();
        Archer arquero=new Archer();

    }
    @Test
    public void SiegeVSBarracksTest(){
        Siege catapulta=new Siege();
        Barracks barracks=new Barracks();
    }
    @Test
    public void SiegeVSCastleTest(){
        Siege catapulta=new Siege();
        Castle castillo=new Castle();
    }
    @Test
    public void SiegeVSCavalryTest(){
        Siege catapulta=new Siege();
        Cavalry caballeria=new Cavalry();
    }
    @Test
    public void SiegeVSInfantryTest(){
        Siege catapulta=new Siege();
        Infantry soldado=new Infantry();
    }
    @Test
    public void SiegeVSMonkTest(){
        Siege catapulta=new Siege();
        Monk monje=new Monk();
    }
    @Test
    public void SiegeVSSiegeTest(){
        Siege catapulta=new Siege();
        Siege otraCatapulta=new Siege();
        catapulta.attack(otraCatapulta);
    }
    @Test
    public void SiegeVSVillager(){
        Siege catapulta=new Siege();
        Villager aldeano=new Villager();
        aldeano.attack(catapulta);
        catapulta.attack(aldeano);
        assertEquals(210,catapulta.getHP(),0.01);
        assertFalse(aldeano.isAlive());
        assertEquals(0,aldeano.getHP(),0.01);
    }
    @Test
    public void SiegeDeathTest(){
        Siege catapulta=new Siege();
    }
}
