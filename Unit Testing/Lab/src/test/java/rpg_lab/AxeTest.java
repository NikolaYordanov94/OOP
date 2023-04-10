package rpg_lab;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {

    private static final  int ATTACK = 10;
    private static final int DURABILITY = 10;
    private static final int HEALTH = 100;
    private static final int EXPERIENCE = 10;

    private Axe axe;
    private Axe brokenAxe;
    private Dummy dummy;

    @Before
    public void setUp(){
        this.axe = new Axe(ATTACK, DURABILITY);
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
        this.brokenAxe = new Axe(ATTACK, 0);
    }

    @Test
    public void testAttackReduceDurability(){
        axe.attack(dummy);
        int expected = DURABILITY - 1;
        Assert.assertEquals(expected, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAttackThrowsWhenAxeIsBroken(){

        brokenAxe.attack(dummy);
    }




}
