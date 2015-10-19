package primefactors;

import com.google.common.collect.Lists;

import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int number) {
        List<Integer> factors = Lists.newArrayList();

        for (int prime = 2; number > 1; prime++){
            for (; number % prime == 0; number /= prime) {
                factors.add(prime);
            }
        }
        return factors;
    }

}
