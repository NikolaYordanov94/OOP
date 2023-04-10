package football;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FootballTeamTests {
    FootballTeam footballTeam;
    Footballer footballer;

    @Before
    public void prepare(){
        footballTeam = new FootballTeam("Man United", 5);
        footballer = new Footballer("Lionel Messi");
    }

    @Test
    public void testConstructorShouldCreateAProperFootballTeam(){
        Assert.assertEquals("Man United", footballTeam.getName());
        Assert.assertEquals(5, footballTeam.getVacantPositions());
    }

    @Test (expected = NullPointerException.class)
    public void testNameShouldThrowIfSetToNull(){
        footballTeam = new FootballTeam(null, 2);
    }

    @Test (expected = NullPointerException.class)
    public void testNameShouldThrowIfSetEmpty(){
        footballTeam = new FootballTeam(" ", 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testVacantPositionsShouldThrowIfLessThanZero(){
        footballTeam = new FootballTeam("Portugal", -1);
    }

    @Test
    public void testAddShouldAddFootballer(){
        footballTeam.addFootballer(footballer);
        Assert.assertEquals(1, footballTeam.getCount());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddShouldThrowIfFull(){
        footballTeam.addFootballer(footballer);
        footballTeam.addFootballer(footballer);
        footballTeam.addFootballer(footballer);
        footballTeam.addFootballer(footballer);
        footballTeam.addFootballer(footballer);
        footballTeam.addFootballer(footballer);
    }

    @Test
    public void testRemoveFootballerShouldRemove(){
        footballTeam.addFootballer(footballer);
        footballTeam.removeFootballer("Lionel Messi");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveFootBallerShouldThrowIfNotFoundFootballer(){
        footballTeam.removeFootballer("LionelMessi");
    }

    @Test
    public void testFootballerForSaleShouldFindExistingFootballerInTheTeam(){
        footballTeam.addFootballer(footballer);
        Footballer currentFootballerForSAle = footballTeam.footballerForSale("Lionel Messi");
        Assert.assertEquals("Lionel Messi", currentFootballerForSAle.getName());
    }

    @Test
    public void testFootballerForSaleShouldChangeActiveStatusToTrue(){
        footballTeam.addFootballer(footballer);
        Footballer currentFootballerForSAle = footballTeam.footballerForSale("Lionel Messi");
        Assert.assertFalse(currentFootballerForSAle.isActive());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFootballerForSaleShouldThrowIfNotFoundInTeam(){
        footballTeam.footballerForSale("Ronaldo");
    }

    @Test
    public void testGetStatisticsPrintsCorrectInformation(){

    }
}
