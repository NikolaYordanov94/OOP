package p05_CustomLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomLinkedListTest {
    private CustomLinkedList<String> list;

    @Before
    public void prepare(){
        list  = new CustomLinkedList<>();
        list.add("Pesho");
        list.add("Georgi");
        list.add("Nikola");
        list.add("Maria");
    }

    @Test
    public void testIndexOfShouldReturnTheIndexOfCurrentElement(){
        Assert.assertEquals(2, list.indexOf("Nikola"));
    }

    @Test
    public void testContainsShouldReturnIfCurrentElementIsContainedInTheList(){
        Assert.assertTrue(list.contains("Pesho"));
        Assert.assertFalse(list.contains("Dragan"));
    }

    @Test
    public void testGetShouldGetElementOnSpecificPosition(){
        Assert.assertEquals("Maria", list.get(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetShouldThrowWhenNoElementOnSpecificPosition() throws IllegalArgumentException{
        list.get(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetShouldThrowWhenNegativeIndexInput() throws IllegalArgumentException{
        list.get(-2);
    }

    @Test
    public void testSetShouldSetTheElementCorrect(){
        list.set(3, "Penka");
        Assert.assertEquals("Penka", list.get(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetShouldThrowWhenNoElementOnSpecificPosition() throws IllegalArgumentException{
        list.set(4, "Petar");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetShouldThrowWhenNegativeIndexInput() throws IllegalArgumentException{
        list.set(-1, "Hristo");
    }

    @Test
    public void testAddShouldAddAtLastIndex(){
        list.add("Petya");
        Assert.assertEquals(4, list.indexOf("Petya"));
    }

    @Test
    public void testRemoveAtShouldRemoveTheElementOnTheCurrentIndex(){
        list.removeAt(2);
        Assert.assertEquals("Maria", list.get(2));
    }

    @Test
    public void testRemoveAtShouldReduceTheLengthOfTheByOne(){
        list.removeAt(1);
        Assert.assertEquals("Maria", list.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAtShouldThrowIfInvalidIndexInput() throws IllegalArgumentException{
        list.removeAt(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAtShouldThrowIfNegativeIndexInput() throws IllegalArgumentException{
        list.removeAt(-2);
    }

    @Test
    public void testRemoveAtShouldReturnTeRemovedElement(){
        Assert.assertEquals("Georgi", list.removeAt(1));
    }

    @Test
    public void testRemoveShouldRemoveTheCurrentElement(){
        list.remove("Maria");
        Assert.assertFalse(list.contains("Maria"));
    }

    @Test
    public void testRemoveShouldReduceTheLengthOfTheByOne(){
        list.remove("Georgi");
        Assert.assertEquals(2, list.indexOf("Maria"));
    }

    @Test
    public void testRemoveShouldReturnMinusOneIfElementIsNotFound(){
        Assert.assertEquals(-1, list.remove("Dragan"));
    }
}