package romannumerals;

import junit.extensions.TestSetup;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 18/10/15
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setup(){
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void testNothing(){
        checkValues("", 0);
    }

    @Test
    public void testOne(){
        checkValues("I", 1);
    }

    @Test
    public void testTwo(){
        checkValues("II", 2);
    }

    @Test
    public void testThree(){
        checkValues("III", 3);
    }

    @Test
    public void testFour(){
        checkValues("IV", 4);
    }

    @Test
    public void testFive(){
        checkValues("V", 5);
    }

    @Test
    public void testEight(){
        checkValues("VIII", 8);
    }

    @Test
    public void testNine(){
        checkValues("IX", 9);
    }

    @Test
    public void testTen(){
        checkValues("X", 10);
    }

    @Test
    public void testThirteen(){
        checkValues("XIII", 13);
    }

    @Test
    public void testFourteen(){
        checkValues("XIV", 14);
    }

    @Test
    public void testFifteen(){
        checkValues("XV", 15);
    }

    @Test
    public void testEighteen(){
        checkValues("XVIII", 18);
    }

    @Test
    public void testNineteen(){
        checkValues("XIX", 19);
    }

    @Test
    public void testTwenty(){
        checkValues("XX", 20);
    }

    @Test
    public void testFourty(){
        checkValues("XL", 40);
    }

    @Test
    public void testFourtyNine(){
        checkValues("XLIX", 49);
    }

    @Test
    public void testFifty(){
        checkValues("L", 50);
    }

    private void checkValues(String numeral, int number){
        Assert.assertEquals(numeral, romanNumerals.calculate(number));
    }
}
