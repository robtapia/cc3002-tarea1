package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class SiegeUnitTest {
    @Test
    public void SiegeUnitCreationTest(){
        SiegeUnit catapulta=new SiegeUnit();
    }
    @Test
    public void SiegeUnitVsArcherUnitTest(){
        SiegeUnit catapulta=new SiegeUnit();
        ArcherUnit arquero=new ArcherUnit();

    }
    @Test
    public void SiegeUnitVSBarracksTest(){
        SiegeUnit catapulta=new SiegeUnit();
        Barracks barracks=new Barracks();
    }
    @Test
    public void SiegeUnitVSCastleTest(){
        SiegeUnit catapulta=new SiegeUnit();
        Castle castillo=new Castle();
    }
    @Test
    public void SiegeUnitVSCavalryUnitTest(){
        SiegeUnit catapulta=new SiegeUnit();
        CavalryUnit caballeria=new CavalryUnit();
    }
    @Test
    public void SiegeUnitVSInfantryUnitTest(){
        SiegeUnit catapulta=new SiegeUnit();
        InfantryUnit soldado=new InfantryUnit();
    }
    @Test
    public void SiegeUnitVSMonkTest(){
        SiegeUnit catapulta=new SiegeUnit();
        Monk monje=new Monk();
    }
    @Test
    public void SiegeUnitVSSiegeUnitTest(){
        SiegeUnit catapulta=new SiegeUnit();
        SiegeUnit otraCatapulta=new SiegeUnit();
        catapulta.attack(otraCatapulta);
    }
    @Test
    public void SiegeUnitVSVillager(){
        SiegeUnit catapulta=new SiegeUnit();
        Villager aldeano=new Villager();
        aldeano.attack(catapulta);
        catapulta.attack(aldeano);
        assertEquals(210,catapulta.getHP(),0.01);
        assertFalse(aldeano.isAlive());
        assertEquals(0,aldeano.getHP(),0.01);
    }
    @Test
    public void SiegeUnitDeathTest(){
        SiegeUnit catapulta=new SiegeUnit();
    }
}
