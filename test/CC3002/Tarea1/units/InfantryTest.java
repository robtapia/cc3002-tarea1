package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class InfantryTest {


    @Test
    public void infantryAttackTest() {
        Infantry soldadoA=new Infantry();
        Infantry soldadoB=new Infantry();
        Infantry soldadoC=new Infantry();
        Infantry soldadoD=new Infantry();
        Infantry soldadoE=new Infantry();
        Infantry soldadoF=new Infantry();
        Infantry soldadoG=new Infantry();
        Infantry soldadoH=new Infantry();


        Archer arquero=new Archer();
        Barracks barraca= new Barracks();
        Castle castillo=new Castle();
        Cavalry caballeria=new Cavalry();
        Infantry soldado=new Infantry();
        Monk monje=new Monk();
        Siege catapulta=new Siege();
        Villager aldeano=new Villager();


        assertEquals(100,soldadoA.getHP(),0.01);
        assertEquals(25,soldadoA.getAttackPoints(),0.01);

        soldadoA.attack(arquero);
        arquero.attack(soldadoA);
        assertEquals(76,soldadoA.getHP(),0.01);
        assertEquals(50,arquero.getHP(),0.01);

        soldadoB.attack(barraca);
        //
        assertEquals(282.5,barraca.getHP(),0.01);

        soldadoC.attack(castillo);
        castillo.attack(soldadoC);
        assertEquals(40,soldadoC.getHP(),0.01);
        assertEquals(392.5,castillo.getHP(),0.01);
        castillo.attack(soldadoC);
        assertEquals(0,soldadoC.getHP(),0.01);
        assertFalse(soldadoC.isAlive());
        soldadoC.attack(castillo);
        assertEquals(392.5,castillo.getHP(),0.01);//El soldado esta muerto, por lo tanto no puede hacer daño


        soldadoD.attack(caballeria);
        caballeria.attack(soldadoD);
        assertEquals(65,soldadoD.getHP(),0.01);
        assertEquals(120,caballeria.getHP(),0.01);


        soldadoE.attack(soldado);
        soldado.attack(soldadoE);
        assertEquals(75,soldadoE.getHP(),0.01);
        assertEquals(75,soldado.getHP(),0.01);

        monje.attack(soldadoF);
        soldadoF.attack(monje);
        assertEquals(110,soldadoF.getHP(),0.01);
        assertEquals(0,monje.getHP(),0.01);
        assertFalse(monje.isAlive());
        monje.attack(soldadoF);             //Una vez el monje ha muerto, no puede curar al soldado
        assertEquals(110,soldadoF.getHP(),0.01);


        soldadoG.attack(catapulta);
        catapulta.attack(soldadoG);
        assertEquals(25,soldadoG.getHP(),0.01);
        assertEquals(170,catapulta.getHP(),0.01);

        soldadoH.attack(aldeano);
        aldeano.attack(soldadoH);
        assertEquals(84,soldadoH.getHP(),0.01);
        assertEquals(12.5,aldeano.getHP(),0.01);






    }

}