package example.chpter10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 내부 DSL 을 알기위한 예제 코드
 *
 * @author : 유호철
 * @since 1.0
 */
public class InnerDSL {
    public static void main(String[] args) {
        // 개선
        List<String> numbers = Arrays.asList("one", "two", "three");
        numbers.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 개선 2
        numbers.forEach(s -> System.out.println(s));

        // 개선 3
        numbers.forEach(System.out::println);
    }
}
