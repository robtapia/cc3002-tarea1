package CC3002.Tarea1.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class BarracksTest {


    @Test
    public void BarrackCreationTest() {
        Barracks barraca = new Barracks();
        assertEquals(300,barraca.getHP(),0.01);
        //Dado que las Barracks no pueden atacar, solo se puede testear su reaccion a los ataques, las que se encuentran en los tests de todos los demas attackers.
    }
    @Test
    public void BarrackDeathTest(){
        Barracks barraca=new Barracks();
        SiegeUnit catapulta=new SiegeUnit();
        Villager aldeano=new Villager();

        catapulta.attack(barraca);
        catapulta.attack(barraca);
        catapulta.attack(barraca);
        assertEquals(0,barraca.getHP(),0.01);
        aldeano.attack(barraca);
        assertEquals(0,barraca.getHP(),0.01);
    }

}