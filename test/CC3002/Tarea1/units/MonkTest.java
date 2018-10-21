package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonkTest {


    @Test
    public void MonkAttackTest() {
        Monk monjeA=new Monk();
        Monk monjeB=new Monk();
        Monk monjeC=new Monk();
        Monk monjeD=new Monk();
        Monk monjeE=new Monk();
        Monk monjeF=new Monk();
        Monk monjeG=new Monk();
        Monk monjeH=new Monk();

        ArcherUnit arquero=new ArcherUnit();
        Barracks barraca= new Barracks();
        Castle castillo=new Castle();
        CavalryUnit caballeria=new CavalryUnit();
        InfantryUnit soldado=new InfantryUnit();
        Monk monje=new Monk();
        SiegeUnit catapulta=new SiegeUnit();
        Villager aldeano=new Villager();


        assertEquals(40,monjeA.getHP(),0.01);
        assertEquals(20,monjeA.getAttackPoints(),0.01);

        monjeA.attack(arquero);
        arquero.attack(monjeA);
        assertEquals(0,monjeA.getHP(),0.01);
        assertEquals(90,arquero.getHP(),0.01);

        monjeB.attack(barraca);
        //
        assertEquals(300,barraca.getHP(),0.01);

        monjeC.attack(castillo);
        castillo.attack(monjeC);
        assertEquals(0,monjeC.getHP(),0.01);
        assertEquals(400,castillo.getHP(),0.01);
        assertFalse(monjeC.isAlive());


        monjeD.attack(caballeria);
        caballeria.attack(monjeD);
        assertEquals(0,monjeD.getHP(),0.01);
        assertEquals(160,caballeria.getHP(),0.01);


        monjeE.attack(soldado);
        soldado.attack(monjeE);
        assertEquals(0,monjeE.getHP(),0.01);
        assertEquals(110,soldado.getHP(),0.01);

        monje.attack(monjeF);
        monjeF.attack(monje);
        assertEquals(50,monjeF.getHP(),0.01);
        assertEquals(50,monje.getHP(),0.01);
        monje.attack(monjeF);
        assertEquals(60,monjeF.getHP(),0.01);
        monje.attack(monjeF);
        assertEquals(70,monjeF.getHP(),0.01);
        monje.attack(monjeF);
        assertEquals(80,monjeF.getHP(),0.01);
        monje.attack(monjeF);
        assertEquals(80,monjeF.getHP(),0.01); //las unidades no pueden tener mas de dos veces sus HP originales.



        monjeG.attack(catapulta);
        catapulta.attack(monjeG);
        assertEquals(0,monjeG.getHP(),0.01);
        assertEquals(200,catapulta.getHP(),0.01);

        aldeano.attack(monjeH);
        monjeH.attack(aldeano);
        assertEquals(40,monjeH.getHP(),0.01);
        assertEquals(60,aldeano.getHP(),0.01);



    }
    @Test
    public void MonkCreationTest(){
        Monk monje=new Monk();
        assertEquals(40,monje.getHP(),0.01);
        assertEquals(20,monje.getAttackPoints(),0.01);
    }
    @Test
    public void MonkVsArcherUnitTest(){
        Monk monje=new Monk();
        ArcherUnit arquero=new ArcherUnit();
        monje.attack(arquero);
        arquero.attack(monje);
        assertEquals(0,monje.getHP(),0.01);
        assertEquals(90,arquero.getHP(),0.01);
    }
    @Test
    public void MonkVSBarracksTest(){
        Monk monje=new Monk();
        Barracks barraca=new Barracks();
        monje.attack(barraca);
        //
        assertEquals(300,barraca.getHP(),0.01);
    }
    @Test
    public void MonkVSCastleTest(){
        Monk monje=new Monk();
        Castle castillo=new Castle();
        monje.attack(castillo);
        castillo.attack(monje);
        assertEquals(0,monje.getHP(),0.01);
        assertEquals(400,castillo.getHP(),0.01);
        assertFalse(monje.isAlive());

    }
    @Test
    public void MonkVSCavalryUnitTest(){
        Monk monje=new Monk();
        CavalryUnit caballeria=new CavalryUnit();
        monje.attack(caballeria);
        caballeria.attack(monje);
        assertEquals(0,monje.getHP(),0.01);
        assertEquals(160,caballeria.getHP(),0.01);
    }
    @Test
    public void MonkVSInfantryUnitTest(){
        Monk monje=new Monk();
        InfantryUnit soldado=new InfantryUnit();
        monje.attack(soldado);
        soldado.attack(monje);
        assertEquals(0,monje.getHP(),0.01);
        assertEquals(110,soldado.getHP(),0.01);
    }
    @Test
    public void MonkVSMonkTest(){
        Monk monje=new Monk();
        Monk otroMonje=new Monk();
        otroMonje.attack(monje);
        monje.attack(otroMonje);
        assertEquals(50,monje.getHP(),0.01);
        assertEquals(50,otroMonje.getHP(),0.01);
        otroMonje.attack(monje);
        assertEquals(60,monje.getHP(),0.01);
        otroMonje.attack(monje);
        assertEquals(70,monje.getHP(),0.01);
        otroMonje.attack(monje);
        assertEquals(80,monje.getHP(),0.01);
        otroMonje.attack(monje);
        assertEquals(80,monje.getHP(),0.01); //las unidades no pueden tener mas de dos veces sus HP originales.

    }
    @Test
    public void MonkVSSiegeUnitTest(){
        Monk monje=new Monk();
        SiegeUnit catapulta=new SiegeUnit();
        monje.attack(catapulta);
        catapulta.attack(monje);
        assertEquals(0,monje.getHP(),0.01);
        assertEquals(200,catapulta.getHP(),0.01);
    }
    @Test
    public void MonkVSVillager(){
        Monk monje=new Monk();
        Villager aldeano=new Villager();
        aldeano.attack(monje);
        monje.attack(aldeano);
        assertEquals(40,monje.getHP(),0.01);
        assertEquals(60,aldeano.getHP(),0.01);
    }
    @Test
    public void MonkDeathTest(){
        Monk monje=new Monk();
        InfantryUnit soldado=new InfantryUnit();
        Monk otroMonje=new Monk();
        soldado.attack(monje);
        assertEquals(0,monje.getHP(),0.01);
        assertFalse(monje.isAlive());
        otroMonje.attack(monje);
        assertEquals(0,monje.getHP(),0.01);
        assertFalse(monje.isAlive());
        monje.attack(soldado);
        assertEquals(100,soldado.getHP(),0.01);
    }

}