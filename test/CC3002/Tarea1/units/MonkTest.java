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

        Archer arquero=new Archer();
        Barracks barraca= new Barracks();
        Castle castillo=new Castle();
        Cavalry caballeria=new Cavalry();
        Infantry soldado=new Infantry();
        Monk monje=new Monk();
        Siege catapulta=new Siege();
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

    }
    @Test
    public void MonkVsArcherTest(){

    }
    @Test
    public void MonkVSBarracksTest(){

    }
    @Test
    public void MonkVSCastleTest(){

    }
    @Test
    public void MonkVSCavalryTest(){

    }
    @Test
    public void MonkVSInfantryTest(){

    }
    @Test
    public void MonkVSMonkTest(){

    }
    @Test
    public void MonkVSSiegeTest(){

    }
    @Test
    public void MonkVSVillager(){

    }
    @Test
    public void MonkDeathTest(){

    }

}