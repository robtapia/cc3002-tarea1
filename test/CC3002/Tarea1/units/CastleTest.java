package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest {

    @Test
    public void CastleCreationTest(){
        Castle castillo = new Castle();
        assertEquals(400, castillo.getHP(), 0.01);
        assertEquals(50, castillo.getAttackPoints(), 0.01);
    }
    @Test
    public void CastleVsArcherTest(){
        Castle castillo = new Castle();
        Archer arquero = new Archer();
        castillo.attack(arquero);
        arquero.attack(castillo);
        assertEquals(398, castillo.getHP(), 0.01);
        assertEquals(20, arquero.getHP(), 0.01);
    }
    @Test
    public void CastleVSBarracksTest(){
        Castle castillo = new Castle();
        Barracks barraca = new Barracks();
        castillo.attack(barraca);
        //
        assertEquals(265, barraca.getHP(), 0.01);
    }
    @Test
    public void CastleVSCastleTest(){
        Castle castillo = new Castle();
        Castle otroCastillo= new Castle();
        otroCastillo.attack(castillo);
        castillo.attack(otroCastillo);
        assertEquals(395, otroCastillo.getHP(), 0.01);
        assertEquals(395, castillo.getHP(), 0.01);
    }
    @Test
    public void CastleVSCavalryTest(){
        Castle castillo = new Castle();
        Cavalry caballeria = new Cavalry();
        castillo.attack(caballeria);
        caballeria.attack(castillo);
        assertEquals(389.5, castillo.getHP(), 0.01);
        assertEquals(90, caballeria.getHP(), 0.01);

    }
    @Test
    public void CastleVSInfantryTest(){
        Castle castillo = new Castle();
        Infantry soldado=new Infantry();
        castillo.attack(soldado);
        soldado.attack(castillo);
        assertEquals(392.5, castillo.getHP(), 0.01);
        assertEquals(40, soldado.getHP(), 0.01);
    }
    @Test
    public void CastleVSMonkTest(){
        Castle castillo = new Castle();
        Monk monje=new Monk();
        monje.attack(castillo);
        castillo.attack(monje);
        assertEquals(400, castillo.getHP(), 0.01);
        assertEquals(0, monje.getHP(), 0.01);
        assertFalse(monje.isAlive());
    }
    @Test
    public void CastleVSSiegeTest(){
        Castle castillo = new Castle();
        Siege catapulta=new Siege();
        castillo.attack(catapulta);
        catapulta.attack(castillo);
        assertEquals(300, castillo.getHP(), 0.01);
        assertEquals(175, catapulta.getHP(), 0.01);
    }
    @Test
    public void CastleVSVillager(){
        Castle castillo=new Castle();
        Villager aldeano=new Villager();
        Infantry soldado=new Infantry();
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
    public void CastleDeathTest(){
        Castle castillo = new Castle();
        Siege catapulta=new Siege();
        Villager aldeano=new Villager();
        catapulta.attack(castillo);
        catapulta.attack(castillo);
        catapulta.attack(castillo);
        catapulta.attack(castillo);
        assertFalse(castillo.isAlive());
        assertEquals(0,castillo.getHP(),0.01);
        aldeano.attack(castillo);
        assertFalse(castillo.isAlive());
        assertEquals(0,castillo.getHP(),0.01);
        castillo.attack(aldeano);
        assertTrue(aldeano.isAlive());
    }

}