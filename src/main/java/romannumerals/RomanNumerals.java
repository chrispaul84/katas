package romannumerals;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.SortedSet;

public class RomanNumerals {

    private int[] values = new int[]{50,40,10,9,5,4,1};
    private String[] numerals = new String[]{"L", "XL", "X", "IX", "V", "IV", "I"};

    public String calculate(int number) {
        String result = "";
        while(number > 0){
            int closestNumeral = getClosestLowNumeral(number);
            result += getNumeral(closestNumeral);
            number -= closestNumeral;
        }
        return result;
    }

    private int getClosestLowNumeral(int number) {
        for (int i = 0; i < values.length; i++){
            if (values[i] <= number){
                return values[i];
            }
        }
        return 0;
    }

    private String getNumeral(int number) {
        for (int i = 0; i < values.length; i++){
            if (values[i] == number){
                return numerals[i];
            }
        }
        return "";
    }
}
