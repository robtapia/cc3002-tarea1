package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest {


    @Test
    public void CastleAttackTest() {
        Castle castilloA = new Castle();
        Castle castilloB = new Castle();
        Castle castilloC = new Castle();
        Castle castilloD = new Castle();
        Castle castilloE = new Castle();
        Castle castilloF = new Castle();
        Castle castilloG = new Castle();
        Castle castilloH = new Castle();



        Archer arquero = new Archer();
        Barracks barraca = new Barracks();
        Castle castillo = new Castle();
        Cavalry caballeria = new Cavalry();
        Infantry soldado = new Infantry();
        Monk monje = new Monk();
        Siege catapulta = new Siege();
        Villager aldeano = new Villager();


        assertEquals(400, castilloA.getHP(), 0.01);
        assertEquals(50, castilloA.getAttackPoints(), 0.01);

        castilloA.attack(arquero);
        arquero.attack(castilloA);
        assertEquals(398, castilloA.getHP(), 0.01);
        assertEquals(20, arquero.getHP(), 0.01);

        castilloB.attack(barraca);
        //
        assertEquals(265, barraca.getHP(), 0.01);

        castilloC.attack(castillo);
        castillo.attack(castilloC);
        assertEquals(395, castilloC.getHP(), 0.01);
        assertEquals(395, castillo.getHP(), 0.01);



        castilloD.attack(caballeria);
        caballeria.attack(castilloD);
        assertEquals(389.5, castilloD.getHP(), 0.01);
        assertEquals(90, caballeria.getHP(), 0.01);


        castilloE.attack(soldado);
        soldado.attack(castilloE);
        assertEquals(392.5, castilloE.getHP(), 0.01);
        assertEquals(40, soldado.getHP(), 0.01);

        monje.attack(castilloF);
        castilloF.attack(monje);
        assertEquals(400, castilloF.getHP(), 0.01);
        assertEquals(0, monje.getHP(), 0.01);
        assertFalse(monje.isAlive());



        castilloG.attack(catapulta);
        catapulta.attack(castilloG);
        assertEquals(300, castilloG.getHP(), 0.01);
        assertEquals(175, catapulta.getHP(), 0.01);
        catapulta.attack(castilloG);
        catapulta.attack(castilloG);
        catapulta.attack(castilloG);
        catapulta.attack(castilloG);    //El castillo fue destruido
        assertEquals(0,castilloG.getHP(),0.01);
        castilloG.attack(catapulta);
        assertEquals(175,catapulta.getHP(),0.01);//El castillo destruido no puede hacer daño


        aldeano.attack(castilloH);
        assertEquals(400,castilloH.getHP(),0.01);   //El castillo no puede tener mas de 400HP
        catapulta.attack(castilloH);
        assertEquals(300,castilloH.getHP(),0.01);
        aldeano.attack(castilloH);
        assertEquals(306,castilloH.getHP(),0.01);
        castilloH.attack(aldeano);
        assertEquals(0, aldeano.getHP(), 0.01);


    }

}