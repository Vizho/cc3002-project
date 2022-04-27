package model;

import com.example.aventurasdemarcoyluis.model.characters.enemies.*;
import com.example.aventurasdemarcoyluis.model.characters.principal_characters.*;
import com.example.aventurasdemarcoyluis.model.items.HoneySyrup;
import com.example.aventurasdemarcoyluis.model.items.ItemBox;
import com.example.aventurasdemarcoyluis.model.items.RedMushroom;
import com.example.aventurasdemarcoyluis.model.points.FP;
import com.example.aventurasdemarcoyluis.model.points.HP;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestPlayer {

    private Luis testLuis;
    private Marcos testMarcos;
    private Boo testBoo;
    private ItemBox testBox;
    private HoneySyrup hs;
    private RedMushroom rm;


    @BeforeEach
    public void setUp() {
        testLuis = new Luis(2,4,15,8,5);
        testBoo = new Boo(5,10,1,8);
        testMarcos = new Marcos (5,1,14,1,8);
        testBox = new ItemBox();
        hs = new HoneySyrup();
        rm = new RedMushroom();
    }


    /**
     * Check that the player's statistics have been correctly set and
     * that a player is recognized as oneself.
     */
    @Test
    public void constructorTest(){
        assertEquals(testLuis, testLuis);
        assertNotNull(testMarcos);
        assertEquals(testMarcos, new Marcos(5,1,14,1,8));
        assertNotEquals(testLuis, new Luis(1,2,3,4,5));
    }


    /**
     * Check that the Attack method hits the enemy,
     * depending on the attack type, subtracts the proper amount of damage,
     * that the fp is properly set,
     * that the enemy life is not less than 0,
     * that when the enemy HP is 0, he is KO,
     * and that when the player's is KO he doesn't attack.
     * (pst, if you run this test several times, you may see the MARTILLO failed)
     */
    @Test
    public void testAttack(){
        testMarcos.attackWithJump(testBoo);
        assertEquals(new HP(1), testBoo.getHp());
        assertEquals(new FP(7), testMarcos.getFp());
        testMarcos.attackWithHummer(testBoo);
        testMarcos.attackWithHummer(testBoo);
        testMarcos.attackWithHummer(testBoo);
        testMarcos.attackWithHummer(testBoo);
        testMarcos.attackWithJump(testBoo);
        assertEquals(new HP(0), testBoo.getHp());
        assertEquals(new FP(0), testMarcos.getFp());
        assertTrue(testBoo.isKO());
    }


    /**
     * check that items are added and used
     * only when it is in the inventory
     */
    @Test
    public void testItems(){
        testBox.add(hs);
        testBox.add(hs);
        System.out.println(testBox.getBox());
        testMarcos.attackWithHummer(testBoo);
        testMarcos.attackWithHummer(testBoo);
        testMarcos.useItem(hs, testBox);
        System.out.println(testMarcos.getFp());
        assertEquals(new FP(7), testMarcos.getFp());
        testMarcos.useItem(hs, testBox);
        assertEquals(new FP(8), testMarcos.getFp());
        testBox.add(rm);
        Luis testLuis2 = new Luis(2,4,15,13,5);
        testLuis2.useItem(rm, testBox);
        assertEquals(new Luis(2,4,15,8,5), testLuis);
        testLuis.useItem(rm, testBox);
        testMarcos.useItem(hs, testBox);
        testMarcos.useItem(rm, testBox);

    }
}
