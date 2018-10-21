package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class CavalryUnitTest {


    @Test
    public void CavalryUnitCreationTest(){
        CavalryUnit caballero=new CavalryUnit();
        assertEquals(150,caballero.getHP(),0.01);
        assertEquals(35,caballero.getAttackPoints(),0.01);

    }
    @Test
    public void CavalryUnitVsArcherUnitTest(){
        CavalryUnit caballero=new CavalryUnit();
        ArcherUnit arquero=new ArcherUnit();
        caballero.attack(arquero);
        arquero.attack(caballero);
        assertEquals(130,caballero.getHP(),0.01);
        assertEquals(27.5,arquero.getHP(),0.01);

    }
    @Test
    public void CavalryUnitVSBarracksTest(){
        CavalryUnit caballero=new CavalryUnit();
        Barracks barraca =new Barracks();
        caballero.attack(barraca);
        //
        assertEquals(275.5,barraca.getHP(),0.01);

    }
    @Test
    public void CavalryUnitVSCastleTest(){
        CavalryUnit caballero=new CavalryUnit();
        Castle castillo = new Castle();
        caballero.attack(castillo);
        castillo.attack(caballero);
        assertEquals(90,caballero.getHP(),0.01);
        assertEquals(389.5,castillo.getHP(),0.01);
    }
    @Test
    public void CavalryUnitVSCavalryUnitTest(){
        CavalryUnit caballero=new CavalryUnit();
        CavalryUnit otroCaballero=new CavalryUnit();
        caballero.attack(otroCaballero);
        otroCaballero.attack(caballero);
        assertEquals(115,caballero.getHP(),0.01);
        assertEquals(115,otroCaballero.getHP(),0.01);

    }
    @Test
    public void CavalryUnitVSInfantryUnitTest(){
        CavalryUnit caballero=new CavalryUnit();
        InfantryUnit soldado=new InfantryUnit();
        caballero.attack(soldado);
        soldado.attack(caballero);
        assertEquals(120,caballero.getHP(),0.01);
        assertEquals(65,soldado.getHP(),0.01);
    }
    @Test
    public void CavalryUnitVSMonkTest(){
        CavalryUnit caballero=new CavalryUnit();
        Monk monje=new Monk();
        monje.attack(caballero);
        caballero.attack(monje);
        assertEquals(160,caballero.getHP(),0.01);
        assertEquals(0,monje.getHP(),0.01);
        assertFalse(monje.isAlive());

    }
    @Test
    public void CavalryUnitVSSiegeUnitTest(){
        CavalryUnit caballero=new CavalryUnit();
        SiegeUnit catapulta=new SiegeUnit();
        caballero.attack(catapulta);
        catapulta.attack(caballero);
        assertEquals(100,caballero.getHP(),0.01);
        assertEquals(158,catapulta.getHP(),0.01);
    }
    @Test
    public void CavalryUnitVSVillager(){
        CavalryUnit caballero=new CavalryUnit();
        Villager aldeano=new Villager();
        aldeano.attack(caballero);
        caballero.attack(aldeano);
        assertEquals(140,caballero.getHP(),0.01);
        assertEquals(0,aldeano.getHP(),0.01);

    }
    @Test
    public void CavalryUnitDeathTest(){
        CavalryUnit caballero=new CavalryUnit();
        Monk monje=new Monk();
        SiegeUnit catapulta=new SiegeUnit();
        catapulta.attack(caballero);
        catapulta.attack(caballero);
        catapulta.attack(caballero);
        assertFalse(caballero.isAlive());
        assertEquals(0,caballero.getHP(),0.01);
        monje.attack(caballero);
        assertFalse(caballero.isAlive());
        assertEquals(0,caballero.getHP(),0.01);
        caballero.attack(monje);
        assertEquals(40,monje.getHP(),0.01);

    }

}