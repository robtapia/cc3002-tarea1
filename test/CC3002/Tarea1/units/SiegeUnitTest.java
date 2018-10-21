package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class SiegeUnitTest {
    @Test
    public void SiegeUnitCreationTest(){
        SiegeUnit catapulta=new SiegeUnit();
        assertEquals(200,catapulta.getHP(),0.01);
        assertEquals(50,catapulta.getAttackPoints(),0.01);
    }
    @Test
    public void SiegeUnitVsArcherUnitTest(){
        SiegeUnit catapulta=new SiegeUnit();
        ArcherUnit arquero=new ArcherUnit();
        catapulta.attack(arquero);
        arquero.attack(catapulta);
        assertEquals(184,catapulta.getHP(),0.01);
        assertEquals(5,arquero.getHP(),0.01);

    }
    @Test
    public void SiegeUnitVSBarracksTest(){
        SiegeUnit catapulta=new SiegeUnit();
        Barracks barracks=new Barracks();
        catapulta.attack(barracks);
        assertEquals(200,barracks.getHP(),0.01);
    }
    @Test
    public void SiegeUnitVSCastleTest(){
        SiegeUnit catapulta=new SiegeUnit();
        Castle castillo=new Castle();
        catapulta.attack(castillo);
        castillo.attack(catapulta);
        assertEquals(175,catapulta.getHP(),0.01);
        assertEquals(300,castillo.getHP(),0.01);
    }
    @Test
    public void SiegeUnitVSCavalryUnitTest(){
        SiegeUnit catapulta=new SiegeUnit();
        CavalryUnit caballeria=new CavalryUnit();
        catapulta.attack(caballeria);
        caballeria.attack(catapulta);
        assertEquals(158,catapulta.getHP(),0.1);
        assertEquals(100,caballeria.getHP(),0.01);
    }
    @Test
    public void SiegeUnitVSInfantryUnitTest(){
        SiegeUnit catapulta=new SiegeUnit();
        InfantryUnit soldado=new InfantryUnit();
        catapulta.attack(soldado);
        soldado.attack(catapulta);
        assertEquals(170,catapulta.getHP(),0.01);
        assertEquals(25,soldado.getHP(),0.01);
    }
    @Test
    public void SiegeUnitVSMonkTest(){
        SiegeUnit catapulta=new SiegeUnit();
        Monk monje=new Monk();
        monje.attack(catapulta);
        catapulta.attack(monje);
        assertEquals(200,catapulta.getHP(),0.01);
        assertEquals(0,monje.getHP(),0.01);
        assertFalse(monje.isAlive());
    }
    @Test
    public void SiegeUnitVSSiegeUnitTest(){
        SiegeUnit catapulta=new SiegeUnit();
        SiegeUnit otraCatapulta=new SiegeUnit();
        catapulta.attack(otraCatapulta);
        otraCatapulta.attack(catapulta);
        assertEquals(125,catapulta.getHP(),0.01);
        assertEquals(125,otraCatapulta.getHP(),0.01);
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
        SiegeUnit otraCatapulta=new SiegeUnit();
        Villager aldeano=new Villager();
        otraCatapulta.attack(catapulta);
        otraCatapulta.attack(catapulta);
        otraCatapulta.attack(catapulta);
        assertEquals(0,catapulta.getHP(),0.01);
        assertFalse(catapulta.isAlive());
        aldeano.attack(catapulta);
        assertEquals(0,catapulta.getHP(),0.01);
        assertFalse(catapulta.isAlive());
        catapulta.attack(otraCatapulta);
        assertEquals(200,otraCatapulta.getHP(),0.01);



    }
}
