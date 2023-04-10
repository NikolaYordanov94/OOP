package rpg_lab;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HeroTest {

    @Test
    public void testAttackWhenTargetDiesHeroGetsExp(){

        int exp = 10;
        Target facade = mock(Target.class);
        when(facade.isDead()).thenReturn(true);
        when(facade.giveExperience()).thenReturn(exp);

        Weapon weapon = mock(Weapon.class);

        Hero hero = new Hero("Pesho", weapon);

        hero.attack(facade);
        assertEquals(exp, hero.getExperience());
    }
}
