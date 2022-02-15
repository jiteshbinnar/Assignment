package sumByUsinfgStream;

import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {
        int sum= IntStream.of(1,2,3,4,5)//we do the sum of all numbers by taking square of each
                .map(n->n*n)
                        .sum();
        System.out.println(sum);
    }
}
