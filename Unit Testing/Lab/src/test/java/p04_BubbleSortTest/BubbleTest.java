package p04_BubbleSortTest;

import org.junit.Assert;
import org.junit.Test;

public class BubbleTest {

    @Test
    public void testBubbleSortIfSortingCorrect(){
        int[] numbers = {2, 5, -1, 10, -4, 0, 15};
        int[] sortedNumbers = {-4, -1, 0, 2, 5, 10, 15};
        Bubble.sort(numbers);
        Assert.assertArrayEquals(sortedNumbers, numbers);
    }
}