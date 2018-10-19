package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class CavalryTest {


    @Test
    public void CavalryAttackTest() {
        Cavalry caballeroA=new Cavalry();
        Cavalry caballeroB=new Cavalry();
        Cavalry caballeroC=new Cavalry();
        Cavalry caballeroD=new Cavalry();
        Cavalry caballeroE=new Cavalry();
        Cavalry caballeroF=new Cavalry();
        Cavalry caballeroG=new Cavalry();
        Cavalry caballeroH=new Cavalry();

        Archer arquero=new Archer();
        Barracks barraca= new Barracks();
        Castle castillo=new Castle();
        Cavalry caballeria=new Cavalry();
        Infantry soldado=new Infantry();
        Monk monje=new Monk();
        Siege catapulta=new Siege();
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
    public void CavalryCreationTest(){

    }
    @Test
    public void CavalryVsArcherTest(){

    }
    @Test
    public void CavalryVSBarracksTest(){

    }
    @Test
    public void CavalryVSCastleTest(){

    }
    @Test
    public void CavalryVSCavalryTest(){

    }
    @Test
    public void CavalryVSInfantryTest(){

    }
    @Test
    public void CavalryVSMonkTest(){

    }
    @Test
    public void CavalryVSSiegeTest(){

    }
    @Test
    public void CavalryVSVillager(){

    }
    @Test
    public void CavalryDeathTest(){

    }

}