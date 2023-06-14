package example;

import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collectors.SummingInt 를 위한 예제 코드
 *
 * @author : 유호철
 * @since 1.0
 */
public class SummingIntEx {
    public static void main(String[] args) {
        Stream<BigDecimal> s = Stream.iterate(
                BigDecimal.ONE, bigDecimal ->
                    bigDecimal.add(BigDecimal.ONE))
            .limit(10).peek(System.out::println);


        int i = s.collect(Collectors.summingInt(
            (BigDecimal::intValue)));
        System.out.println("sum: " + i);
    }
}
