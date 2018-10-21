package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class CavalryUnitTest {


    @Test
    public void CavalryUnitAttackTest() {
        CavalryUnit caballeroA=new CavalryUnit();
        CavalryUnit caballeroB=new CavalryUnit();
        CavalryUnit caballeroC=new CavalryUnit();
        CavalryUnit caballeroD=new CavalryUnit();
        CavalryUnit caballeroE=new CavalryUnit();
        CavalryUnit caballeroF=new CavalryUnit();
        CavalryUnit caballeroG=new CavalryUnit();
        CavalryUnit caballeroH=new CavalryUnit();

        ArcherUnit arquero=new ArcherUnit();
        Barracks barraca= new Barracks();
        Castle castillo=new Castle();
        CavalryUnit caballeria=new CavalryUnit();
        InfantryUnit soldado=new InfantryUnit();
        Monk monje=new Monk();
        SiegeUnit catapulta=new SiegeUnit();
        Villager aldeano=new Villager();


        assertEquals(150,caballeroA.getHP(),0.01);
        assertEquals(35,caballeroA.getAttackPoints(),0.01);

        caballeroA.attack(arquero);
        arquero.attack(caballeroA);
        assertEquals(130,caballeroA.getHP(),0.01);
        assertEquals(27.5,arquero.getHP(),0.01);

        caballeroB.attack(barraca);
        //
        assertEquals(275.5,barraca.getHP(),0.01);

        caballeroC.attack(castillo);
        castillo.attack(caballeroC);
        assertEquals(90,caballeroC.getHP(),0.01);
        assertEquals(389.5,castillo.getHP(),0.01);
        castillo.attack(caballeroC);
        castillo.attack(caballeroC);
        castillo.attack(caballeroC);
        assertEquals(0,caballeroC.getHP(),0.01);
        assertFalse(caballeroC.isAlive());
        caballeroC.attack(castillo);
        assertEquals(389.5,castillo.getHP(),0.01);//El caballero esta muerto, por lo tanto no puede hacer daño


        caballeroD.attack(caballeria);
        caballeria.attack(caballeroD);
        assertEquals(115,caballeroD.getHP(),0.01);
        assertEquals(115,caballeria.getHP(),0.01);


        caballeroE.attack(soldado);
        soldado.attack(caballeroE);
        assertEquals(120,caballeroE.getHP(),0.01);
        assertEquals(65,soldado.getHP(),0.01);

        monje.attack(caballeroF);
        caballeroF.attack(monje);
        assertEquals(160,caballeroF.getHP(),0.01);
        assertEquals(0,monje.getHP(),0.01);
        assertFalse(monje.isAlive());
        monje.attack(caballeroF);             //Una vez el monje ha muerto, no puede curar al caballero
        assertEquals(160,caballeroF.getHP(),0.01);


        caballeroG.attack(catapulta);
        catapulta.attack(caballeroG);
        assertEquals(100,caballeroG.getHP(),0.01);
        assertEquals(158,catapulta.getHP(),0.01);

        aldeano.attack(caballeroH);
        caballeroH.attack(aldeano);
        assertEquals(140,caballeroH.getHP(),0.01);
        assertEquals(0,aldeano.getHP(),0.01);


    }
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