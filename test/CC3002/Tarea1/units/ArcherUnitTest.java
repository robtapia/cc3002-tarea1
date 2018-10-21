package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArcherUnitTest {

    @Test
    public void ArcherUnitCreationTest(){
        ArcherUnit arquero=new ArcherUnit();
        assertEquals(80,arquero.getHP(),0.01);
        assertEquals(20,arquero.getAttackPoints(),0.01);
    }
    @Test
    public void ArcherUnitVSArcherUnitTest(){
        ArcherUnit arqueroA=new ArcherUnit();
        ArcherUnit arqueroB=new ArcherUnit();
        arqueroA.attack(arqueroB);
        arqueroB.attack(arqueroA);
        assertEquals(56,arqueroA.getHP(),0.01);
        assertEquals(56,arqueroB.getHP(),0.01);
    }
    @Test
    public void ArcherUnitVSBarracksTest(){
        ArcherUnit arquero=new ArcherUnit();
        Barracks barraca=new Barracks();
        arquero.attack(barraca);
        //
        assertEquals(286,barraca.getHP(),0.01);
    }
    @Test
    public void ArcherUnitVSCastleTest(){
        ArcherUnit arquero=new ArcherUnit();
        Castle castillo=new Castle();
        arquero.attack(castillo);
        castillo.attack(arquero);
        assertEquals(20,arquero.getHP(),0.01);
        assertEquals(398,castillo.getHP(),0.01);

    }
    @Test
    public void ArcherUnitVSCavalryUnitTest(){
        ArcherUnit arquero=new ArcherUnit();
        CavalryUnit caballero=new CavalryUnit();
        arquero.attack(caballero);
        caballero.attack(arquero);
        assertEquals(27.5,arquero.getHP(),0.01);
        assertEquals(130,caballero.getHP(),0.01);

    }
    @Test
    public void ArcherUnitVSInfantryUnitTest(){
        ArcherUnit arquero=new ArcherUnit();
        InfantryUnit soldado=new InfantryUnit();
        arquero.attack(soldado);
        soldado.attack(arquero);
        assertEquals(50,arquero.getHP(),0.01);
        assertEquals(76,soldado.getHP(),0.01);
    }
    @Test
    public void ArcherUnitVSMonkTest(){
        Monk monje=new Monk();
        ArcherUnit arquero=new ArcherUnit();
        monje.attack(arquero);
        arquero.attack(monje);
        assertEquals(90,arquero.getHP(),0.01);
        assertEquals(0,monje.getHP(),0.01);
    }
    @Test
    public void ArcherUnitVSSiegeUnitTest(){
        ArcherUnit arquero=new ArcherUnit();
        SiegeUnit catapulta=new SiegeUnit();
        arquero.attack(catapulta);
        catapulta.attack(arquero);
        assertEquals(5,arquero.getHP(),0.01);
        assertEquals(184,catapulta.getHP(),0.01);
    }
    @Test
    public void ArcherUnitVSVillagerTest(){
        ArcherUnit arquero=new ArcherUnit();
        Villager aldeano=new Villager();
        arquero.attack(aldeano);
        aldeano.attack(arquero);
        assertEquals(60,arquero.getHP(),0.01);
        assertEquals(20,aldeano.getHP(),0.01);
    }
    @Test
    public void ArcherUnitDead(){
        ArcherUnit arquero=new ArcherUnit();
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