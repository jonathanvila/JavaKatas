import org.aytartana.kata.shuffle.BestShuffle4Numbers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jonathan on 13/02/15.
 */
public class BestShuffleTest {
    private BestShuffle4Numbers bestShuffle4Numbers;

    @Before
    public void initMethod() {
        bestShuffle4Numbers = new BestShuffle4Numbers();
    }

    @Test
    public void testOneShuffle() {
        assertEquals("shuffle 1,1, 1, 1 = 0" , 0, bestShuffle4Numbers.solution(1,1,1,1));
    }

    @Test
    public void testBestShuffle() {
        assertEquals("best shuffle 5,3, -1, 5 = 14" , 14, bestShuffle4Numbers.solution(5,3,-1,5));
    }

    @Test
    public void testBestShuffle2() {
        assertEquals("best shuffle 50,30, -10, 50 = 140" , 140, bestShuffle4Numbers.solution(50,30,-10,50));
    }
}
