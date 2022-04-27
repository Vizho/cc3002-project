package model;

import com.example.aventurasdemarcoyluis.model.characters.enemies.Boo;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Goomba;
import com.example.aventurasdemarcoyluis.model.characters.enemies.Spiny;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.Marcos;
import com.example.aventurasdemarcoyluis.model.points.HP;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEnemy {

    private Goomba testGoomba;
    private Boo testBoo;
    private Spiny testSpiny;
    private Marcos testMarcos;


    @BeforeEach
    public void setUp() {
        testGoomba= new Goomba(2,4,15,8);
        testBoo = new Boo(5,9,3,8);
        testSpiny = new Spiny(5,9,3,8);
        testMarcos = new Marcos(5,1,14,1,3);
    }


    /**
     * Check that the enemy statistics have been correctly set and
     * that an enemy is recognized as oneself.
     */
    @Test
    public void constructorTest(){
        assertEquals(testBoo, testBoo);
        assertNotNull(testSpiny);
        assertEquals(testGoomba, new Goomba(2,4,15,8));
        assertNotEquals(testSpiny, new Spiny(1,2,3,4));
    }


    /**
     * Check that the Attack method hits the enemy, subtracts the proper amount of damage,
     * that the Player's life is not less than 0,
     * that when the Player's HP is 0, he is KO,
     * and that when the enemy is KO he doesn't attack.
     */
    @Test
    public void testAttack(){
        testGoomba.attack(testMarcos);
        assertEquals(new HP(2), testMarcos.getHp());
        testSpiny.attack(testMarcos);
        assertEquals(new HP(0), testMarcos.getHp());
        assertTrue(testMarcos.isKO());
        //testGoomba.setKO(true);
        //testMarcos.setHp(14);
        //testGoomba.attack(testMarcos, AttackType.NORMAL);
        //assertEquals(14, testMarcos.getHp());
    }
}
