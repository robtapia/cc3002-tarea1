package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArcherTest {

    @Test
    public void ArcherCreationTest(){
        Archer arquero=new Archer();
        assertEquals(80,arquero.getHP(),0.01);
        assertEquals(20,arquero.getAttackPoints(),0.01);
    }
    @Test
    public void ArcherVSArcherTest(){
        Archer arqueroA=new Archer();
        Archer arqueroB=new Archer();
        arqueroA.attack(arqueroB);
        arqueroB.attack(arqueroA);
        assertEquals(56,arqueroA.getHP(),0.01);
        assertEquals(56,arqueroB.getHP(),0.01);
    }
    @Test
    public void ArcherVSBarracksTest(){
        Archer arquero=new Archer();
        Barracks barraca=new Barracks();
        arquero.attack(barraca);
        //
        assertEquals(286,barraca.getHP(),0.01);
    }
    @Test
    public void ArcherVSCastleTest(){
        Archer arquero=new Archer();
        Castle castillo=new Castle();
        arquero.attack(castillo);
        castillo.attack(arquero);
        assertEquals(20,arquero.getHP(),0.01);
        assertEquals(398,castillo.getHP(),0.01);

    }
    @Test
    public void ArcherVSCavalryTest(){
        Archer arquero=new Archer();
        Cavalry caballero=new Cavalry();
        arquero.attack(caballero);
        caballero.attack(arquero);
        assertEquals(27.5,arquero.getHP(),0.01);
        assertEquals(130,caballero.getHP(),0.01);

    }
    @Test
    public void ArcherVSInfantryTest(){
        Archer arquero=new Archer();
        Infantry soldado=new Infantry();
        arquero.attack(soldado);
        soldado.attack(arquero);
        assertEquals(50,arquero.getHP(),0.01);
        assertEquals(76,soldado.getHP(),0.01);
    }
    @Test
    public void ArcherVSMonkTest(){
        Monk monje=new Monk();
        Archer arquero=new Archer();
        monje.attack(arquero);
        arquero.attack(monje);
        assertEquals(90,arquero.getHP(),0.01);
        assertEquals(0,monje.getHP(),0.01);
    }
    @Test
    public void ArcherVSSiegeTest(){
        Archer arquero=new Archer();
        Siege catapulta=new Siege();
        arquero.attack(catapulta);
        catapulta.attack(arquero);
        assertEquals(5,arquero.getHP(),0.01);
        assertEquals(184,catapulta.getHP(),0.01);
    }
    @Test
    public void ArcherVSVillagerTest(){
        Archer arquero=new Archer();
        Villager aldeano=new Villager();
        arquero.attack(aldeano);
        aldeano.attack(arquero);
        assertEquals(60,arquero.getHP(),0.01);
        assertEquals(20,aldeano.getHP(),0.01);
    }
    @Test
    public void ArcherDead(){
        Archer arquero=new Archer();
        Castle castillo=new Castle();
        arquero.attack(castillo);
        castillo.attack(arquero);
        assertEquals(20,arquero.getHP(),0.01);
        assertEquals(398,castillo.getHP(),0.01);
        castillo.attack(arquero);
        assertEquals(0,arquero.getHP(),0.01);
        assertFalse(arquero.isAlive());
        arquero.attack(castillo);
        assertEquals(398,castillo.getHP(),0.01);//El arquero esta muerto, por lo tanto no puede hacer daño
    }


}