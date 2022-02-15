package sumByUsinfgStream;

import java.util.Arrays;

public class ArrayToStream {
    public static void main(String[] args) {
        int[] numbers = {3, -4, 8, 4, -2, 17,8,12,14,-1};
        int sum = Arrays.stream(numbers)
                .map(n -> Math.abs(n))
                .filter(n -> n % 2 == 0)
                .distinct()
                .sum();
        System.out.println(sum);
    }
    }


