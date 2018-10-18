package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArcherTest {


    @Test
    public void ArcherAttackTest() {
        Archer arqueroA=new Archer();
        Archer arqueroB=new Archer();
        Archer arqueroC=new Archer();
        Archer arqueroD=new Archer();
        Archer arqueroE=new Archer();
        Archer arqueroF=new Archer();
        Archer arqueroG=new Archer();
        Archer arqueroH=new Archer();





        Archer arquero=new Archer();
        Barracks barraca= new Barracks();
        Castle castillo=new Castle();
        Cavalry caballeria=new Cavalry();
        Infantry soldado=new Infantry();
        Monk monje=new Monk();
        Siege catapulta=new Siege();
        Villager aldeano=new Villager();


        assertEquals(80,arqueroA.getHP(),0.01);
        assertEquals(20,arqueroA.getAttackPoints(),0.01);

        arqueroA.attack(arquero);
        arquero.attack(arqueroA);
        assertEquals(56,arqueroA.getHP(),0.01);
        assertEquals(56,arquero.getHP(),0.01);

        arqueroB.attack(barraca);
        //
        assertEquals(286,barraca.getHP(),0.01);

        arqueroC.attack(castillo);
        castillo.attack(arqueroC);
        assertEquals(20,arqueroC.getHP(),0.01);
        assertEquals(398,castillo.getHP(),0.01);
        castillo.attack(arqueroC);
        assertEquals(0,arqueroC.getHP(),0.01);
        assertFalse(arqueroC.isAlive());
        arqueroC.attack(castillo);
        assertEquals(398,castillo.getHP(),0.01);//El soldado esta muerto, por lo tanto no puede hacer daño


        arqueroD.attack(caballeria);
        caballeria.attack(arqueroD);
        assertEquals(27.5,arqueroD.getHP(),0.01);
        assertEquals(130,caballeria.getHP(),0.01);


        arqueroE.attack(soldado);
        soldado.attack(arqueroE);
        assertEquals(50,arqueroE.getHP(),0.01);
        assertEquals(76,soldado.getHP(),0.01);

        monje.attack(arqueroF);
        arqueroF.attack(monje);
        assertEquals(90,arqueroF.getHP(),0.01);
        assertEquals(0,monje.getHP(),0.01);
        assertFalse(monje.isAlive());
        monje.attack(arqueroF);             //Una vez el monje ha muerto, no puede curar al soldado
        assertEquals(90,arqueroF.getHP(),0.01);


        arqueroG.attack(catapulta);
        catapulta.attack(arqueroG);
        assertEquals(5,arqueroG.getHP(),0.01);
        assertEquals(184,catapulta.getHP(),0.01);

        arqueroH.attack(aldeano);
        aldeano.attack(arqueroH);
        assertEquals(60,arqueroH.getHP(),0.01);
        assertEquals(20,aldeano.getHP(),0.01);






    }

}