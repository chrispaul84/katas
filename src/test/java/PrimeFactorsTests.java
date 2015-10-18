import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTests {

    @Test
    public void testOne() {
        List<Integer> factors = PrimeFactors.generate(1);
        List<Integer> expected = Lists.newArrayList();
        assertEquals(expected, factors);
    }

    @Test
    public void testTwo(){
        List<Integer> factors = PrimeFactors.generate(2);
        List<Integer> expected = Lists.newArrayList(2);
        assertEquals(expected, factors);
    }

    @Test
    public void testThree(){
        List<Integer> factors = PrimeFactors.generate(3);
        List<Integer> expected = Lists.newArrayList(3);
        assertEquals(expected, factors);
    }

    @Test
    public void testFour(){
        List<Integer> factors = PrimeFactors.generate(4);
        List<Integer> expected = Lists.newArrayList(2, 2);
        assertEquals(expected, factors);
    }

    @Test
    public void testSix(){
        List<Integer> factors = PrimeFactors.generate(6);
        List<Integer> expected = Lists.newArrayList(2, 3);
        assertEquals(expected, factors);
    }

    @Test
    public void testEight(){
        List<Integer> factors = PrimeFactors.generate(8);
        List<Integer> expected = Lists.newArrayList(2, 2, 2);
        assertEquals(expected, factors);
    }

    @Test
    public void testNine(){
        List<Integer> factors = PrimeFactors.generate(9);
        List<Integer> expected = Lists.newArrayList(3, 3);
        assertEquals(expected, factors);
    }

    @Test
    public void testNinety(){
        List<Integer> factors = PrimeFactors.generate(90);
        List<Integer> expected = Lists.newArrayList(2, 3, 3, 5);
        assertEquals(expected, factors);
    }
}
